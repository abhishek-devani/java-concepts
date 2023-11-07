package lambdasandstreams;

public class SomethingDoer implements Runnable {

    @Override
    public void run() {
        System.out.println("Do Something V1");
    }

}
