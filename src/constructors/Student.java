package constructors;

public class Student {

    private String name;

    int batchId;

    protected double psp;

    public String universityName;

    public Student(String stdName, String univName) {
        name = stdName;
        universityName = univName;
    }

    public Student() {

    }

    void changeBatch(int newBatchId) {
        batchId = newBatchId;
        name = "Ishan";
        batchId = 2;
        psp = 99.0;
    }

}
