package threads.threadpool;

public class NumberPrinter implements Runnable {

    private final int noToPrint;

    public int count = 0;

    NumberPrinter(int noToPrint) {
        this.noToPrint = noToPrint;
    }

    @Override
    public void run() {
        System.out.println(noToPrint +" " + Thread.currentThread().getName());
        count++;
    }
}
