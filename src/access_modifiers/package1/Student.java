package access_modifiers.package1;

public class Student {

    private String name;

    int batchId;

    protected double psp;

    public String universityName;

    void changeBatch(int newBatchId) {
        batchId = newBatchId;
        name = "Ishan";
        batchId = 2;
        psp = 99.0;
    }

}
