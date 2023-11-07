package addersubtractorusinglambdas;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Value v = new Value();
        Lock l = new ReentrantLock();

        ExecutorService es = Executors.newCachedThreadPool();

        Callable<Void> adderLambda = () -> {

            for (int i = 1; i <= 10000; i++) {
                l.lock();
                v.value += i;
                l.unlock();
            }
            return null;

        };

        Callable<Void> subtractorLambda = () -> {

            for (int i = 1; i <= 10000; i++) {
                l.lock();
                v.value -= i;
                l.unlock();
            }
            return null;

        };

        Future<Void> adderFuture = es.submit(adderLambda);

        Future<Void> subtractorFuture = es.submit(subtractorLambda);

        adderFuture.get();
        subtractorFuture.get();

        es.shutdown();

        System.out.println(v.value);

    }
}
