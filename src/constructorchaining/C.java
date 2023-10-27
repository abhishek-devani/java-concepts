package constructorchaining;

public class C extends B {

    public C() {
        System.out.println("Constructor of C ... ");
    }

    public C (String msg) {
        System.out.println("Message from C: " +msg);
    }

}
