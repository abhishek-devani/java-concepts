package designPatterns.builder;

import designPatterns.builder.exceptions.InvalidArgumentException;

public class Client {

    public static void main(String[] args) throws InvalidArgumentException {

        // V1

//        Builder builder = new Builder();
//        builder.setName("Abhishek");
//        builder.setAge(25);
//        builder.setUniversityName("Scaler");
//        builder.setGender(Gender.MALE);
//        builder.setPhoneNumber("9876543210");
//        builder.setPsp(90.0);
//
//        Student student = new Student(builder);


        // V2

//        Builder builder1 = Student.createBuilder();
//        builder1.setName("Abhishek");
//        builder1.setAge(25);
//        builder1.setUniversityName("Scaler");
//        builder1.setGender(Gender.MALE);
//        builder1.setPhoneNumber("9876543210");
//        builder1.setPsp(90.0);

//        Student student1 = builder1.build();
        // We have to avoid below code because it's still creating student object using student class
//        Student student2 = new Student(builder1);

        // V3

        Student student = Student.createBuilder()
                .setName("Abhishek")
                .setAge(25)
                .setGender(Gender.MALE)
                .setPsp(90.0)
                .setUniversityName("abc")
                .setPhoneNumber("9876543210")
                .build();

        System.out.println(student.getName());

    }

}
