package polymorphism;

public class Client {

    public static void main(String[] args) {

        A a = new B();
        System.out.println("Debug");

        String s = "A";
        A a1 = getObject(s);

    }

    public static A getObject(String s) {

        if ("A".equals(s)) {
            return new A();
        } else if ("B".equals(s)) {
            return new B();
        } else if ("C".equals(s)) {
            return new C();
        }

        return null;

    }

}
