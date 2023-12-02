package designPatterns.prototype;

public class Student implements Prototype {

    private String name;
    private int age;
    private double psp;
    private String batchName;
    private double averageBatchPsp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public double getAverageBatchPsp() {
        return averageBatchPsp;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    @Override
    public Student clone() {

        Student copy = new Student();
        copy.name = this.name;
        copy.age = this.age;
        copy.psp = this.psp;
        copy.batchName = this.batchName;
        copy.averageBatchPsp = this.averageBatchPsp;

        return copy;

    }
}
