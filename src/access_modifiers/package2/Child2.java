package access_modifiers.package2;

import access_modifiers.package1.Student;

public class Child2 extends Student {

    public static void main(String[] args) {

        Student s = new Student();

//        Private member
//        s.name = "Ishan"

//        Default
//        s.batchId = 3;

//        Protected
//        s.psp = 99.0;

    }

    public void test() {
        psp = 99;
    }

}
