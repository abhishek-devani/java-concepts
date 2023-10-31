package collections;

import polymorphism.A;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.add(12);
        stack.add(31);
        stack.add(15);

        stack.add(1, 10);

        Set<Integer> set = new LinkedHashSet<>();
        set.add(5);
        set.add(10);
        set.add(0);
        set.add(20);

        for(Integer i: set) {
            System.out.println(i);
        }

        Payment payment = new Payment();
        payment.status = PaymentStatus.SUCCESS;

//        Set<PaymentStatus> paymentStatuses = new LinkedHashSet<>();
//        paymentStatuses.add(PaymentStatus.SUCCESS);
//        paymentStatuses.add(PaymentStatus.FAILURE);
//        paymentStatuses.add(PaymentStatus.PENDING);
//        paymentStatuses.add(PaymentStatus.AWAITING_BANK_APPROVAL);

//        we can use enum set to add all the values of enum class
        Set<PaymentStatus> paymentStatuses = EnumSet.allOf(PaymentStatus.class);

        List<Payment> payments = new ArrayList<>();

        for (PaymentStatus paymentStatus: paymentStatuses) {
            for (Payment payment1: payments) {
                if (payment1.status == paymentStatus) {
                    System.out.println(payment1.status +" : " +payment1);
                }
            }
        }

        List<Student> students = new ArrayList<>();
        students.addAll(List.of(
                new Student(9, 25, "C", 90),
                new Student(2, 20, "A", 80),
                new Student(5, 35, "D", 35)
        ));

//        List<Student> students = new ArrayList<>();
//        Student student1 = new Student(1,25,"C", 90);
//        Student student2 = new Student(2,30,"A", 80);
//        Student student3 = new Student(3,35,"D", 35);
//
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);

        Collections.sort(students, new StudentComparatorByPSP());

        for(Student student: students) {
            System.out.println(student);
        }

    }

}
