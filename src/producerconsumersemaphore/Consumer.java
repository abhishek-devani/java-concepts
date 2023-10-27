package producerconsumersemaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    private Store store;
    private Semaphore producerSema;
    private Semaphore consumerSema;

    public Consumer(Store store, Semaphore producerSema, Semaphore consumerSema) {
        this.store = store;
        this.producerSema = producerSema;
        this.consumerSema = consumerSema;
    }

    @Override
    public void run() {
        while (true) {
            try {
                consumerSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.removeItem();
            producerSema.release();
        }
    }
}
