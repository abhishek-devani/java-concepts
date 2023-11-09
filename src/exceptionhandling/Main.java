package exceptionhandling;

import java.io.NotActiveException;

public class Main {

    public static void main(String[] args) throws EvenNumberException, NotActiveException {

        Doer doer = new Doer();
//        doer.doSomething();

        try{
            System.out.println("Before finding student by id");
            doer.findStudentByRollNumber(21);
            System.out.println("After finding student by id");
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("Class was not found");
        } catch (NotActiveException notActiveException) {
            System.out.println("Student was not active");
            throw notActiveException;
        } catch (Exception exception) {
            System.out.println("exception was thrown");
        } finally {
            System.out.println("Before we go");
        }

        // Only check for the first catch block that matches the error
        System.out.println("Outside try catch");

    }

}
