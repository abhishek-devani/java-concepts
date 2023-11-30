package designPatterns.builder;

import designPatterns.builder.exceptions.InvalidArgumentException;

public class Builder {

//    private String name;
//    private int age;
//    private String universityName;
//    private Gender gender;
//    private String phoneNumber;
//    private Double psp;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getUniversityName() {
//        return universityName;
//    }
//
//    public void setUniversityName(String universityName) {
//        this.universityName = universityName;
//    }
//
//    public Gender getGender() {
//        return gender;
//    }
//
//    public void setGender(Gender gender) {
//        this.gender = gender;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public Double getPsp() {
//        return psp;
//    }
//
//    public void setPsp(Double psp) {
//        this.psp = psp;
//    }
//
//    public boolean validate() {
//        if (this.phoneNumber.length() != 10) {
//            return false;
//        }
//        return true;
//    }
//
//    public Student build() throws InvalidArgumentException {
//
//        // start validation
//        if (!validate()) {
//            throw new InvalidArgumentException();
//        }
//        // end validation
//
//        return new Student(this);
//    }

}
