package threads.helloworldprinter;

public class Main {

    public static void main(String[] args) {

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread t = new Thread(helloWorldPrinter);
        t.start();

        System.out.println("Hello World " + Thread.currentThread().getName());

    }

}
