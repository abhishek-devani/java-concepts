package producerconsumersemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

    private Store store;
    private Semaphore producerSema;
    private Semaphore consumerSema;

    public Producer(Store store, Semaphore producerSema, Semaphore consumerSema) {
        this.store = store;
        this.producerSema = producerSema;
        this.consumerSema = consumerSema;
    }

    @Override
    public void run() {
        while (true) {
            try {
                producerSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.addItem();
            consumerSema.release();
        }
    }
}
