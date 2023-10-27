package polymorphism.methodoverriding;

public class Client {

    public static void main(String[] args) {

        A a = new A();
        a.doSomething();

        A a1 = new B();
        a1.doSomething();

    }

}
