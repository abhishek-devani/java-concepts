package designPatterns.builder;

import designPatterns.builder.exceptions.InvalidArgumentException;
import exceptionhandling.Doer;

public class Student {

    private String name;
    private int age;
    private String universityName;
    private Gender gender;
    private String phoneNumber;
    private Double psp;

    public String getName() {
        return name;
    }

    private Student(Builder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.universityName = builder.getUniversityName();
        this.gender = builder.getGender();
        this.phoneNumber = builder.getPhoneNumber();
        this.psp = builder.getPsp();
    }

    public static Builder createBuilder() {
        return new Builder();
    }

    static class Builder {

        private String name;
        private int age;
        private String universityName;
        private Gender gender;
        private String phoneNumber;
        private Double psp;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public Gender getGender() {
            return gender;
        }

        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Double getPsp() {
            return psp;
        }

        public Builder setPsp(Double psp) {
            this.psp = psp;
            return this;
        }

        public boolean validate() {
            if (this.phoneNumber.length() != 10) {
                return false;
            }
            return true;
        }

        public Student build() throws InvalidArgumentException {

            // start validation
            if (!validate()) {
                throw new InvalidArgumentException();
            }
            // end validation

            return new Student(this);
        }
    }
}
