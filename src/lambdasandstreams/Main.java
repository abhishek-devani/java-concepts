package lambdasandstreams;

import collections.Student;
import collections.StudentComparatorByPSP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // ---- V1
        SomethingDoer somethingDoer = new SomethingDoer();
        Thread t = new Thread(somethingDoer);
        t.start();

        // ---- V2
        Runnable r = () -> {
            System.out.println("Do Something V2");
        };

        Thread t2 = new Thread(r);
        t2.start();

        // ---- V3
        Thread t3 = new Thread(
                () -> {
                    System.out.println("Do Something V3");
                }
        );
        t3.start();


//        List<Student> students = new ArrayList<>();
//        students.addAll(List.of(
//                new Student(9, 25, "C", 90),
//                new Student(2, 20, "A", 80),
//                new Student(5, 35, "D", 35)
//        ));
//
//        Comparator<Student> studentComparator = (current, other) -> {
//
//            if (current.getPsp() < other.getPsp()) {
//                return -1;
//            }
//            return 1;
//
//        };
//
//        Collections.sort(students, studentComparator);

        MathematicalOperation addition = (a, b) -> {
          return a + b;
        };

        MathematicalOperation subtraction = (a, b) -> {
            return a - b;
        };

        MathematicalOperation multiply = (a, b) -> {
            return a * b;
        };

        multiply.operate(3,4);

    }

}
