package threads.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        ExecutorService e = Executors.newFixedThreadPool(10);

        for (int i = 1; i <= 1000; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            e.execute(numberPrinter);
        }

        e.shutdown();

    }

}
