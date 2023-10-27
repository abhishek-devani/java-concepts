package access_modifiers.package1;

public class Client {

    public static void main(String[] args) {

        Student std = new Student();

//        private member
//        std.name = "Ishan";

//        default
        std.batchId = 2;

//        Protected
        std.psp = 99.2;

    }

}
