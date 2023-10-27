package threads;

public class Client {

    public static void doSomething() {
        int a = 1;
        int b = 2;
        System.out.println("Hey There " +Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println("Hello World " + Thread.currentThread().getName());
        doSomething();
    }

}
