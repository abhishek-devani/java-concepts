package designPatterns.prototype;

public class Client {

    public static void fillRegistry(StudentRegistry studentRegistry) {

        Student aprBeginnerBatchPrototype = new Student();
        aprBeginnerBatchPrototype.setBatchName("April23 Beginner Batch");
        aprBeginnerBatchPrototype.setAverageBatchPsp(70);

        studentRegistry.register("April23BeginnerBatch", aprBeginnerBatchPrototype);

    }

    public static void main(String[] args) {

        // Creating a prototype
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        // Making object
        Student abc = studentRegistry.get("April23BeginnerBatch").clone();
        abc.setName("abc");
        abc.setAge(25);
        abc.setPsp(80);

        System.out.println(abc.getAverageBatchPsp());

    }

}
