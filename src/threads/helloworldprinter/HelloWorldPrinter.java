package threads.helloworldprinter;

public class HelloWorldPrinter implements Runnable {

    public void doSomething() {
        System.out.println("Do Something " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
//        Hello World always runs before doSomething
        System.out.println("Hello World " + Thread.currentThread().getName());
        doSomething();
    }
}
