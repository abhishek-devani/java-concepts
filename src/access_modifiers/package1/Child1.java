package access_modifiers.package1;

public class Child1 extends Student {

    public static void main(String[] args) {

        Student s = new Student();

//        Private member
//        s.name = "Ishan"

//        Default
        s.batchId = 3;

//         Protected
        s.psp = 99.0;

    }

}
