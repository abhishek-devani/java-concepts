package exceptionhandling;

import java.io.NotActiveException;
import java.util.Random;

public class Doer {

    public Object findStudentByRollNumber(int roll) throws ClassNotFoundException, NotActiveException {

//        if (roll < 30) {
//            return new Object();
//        }

        Random random = new Random();
        int n = random.nextInt();

        if (roll % 2 == 0) {
            // throw new EvenNumberException();
            throw new EvenNumberException();
        }

        throw new ClassNotFoundException();

    }

    public void doSomething() {
        int n =  1/0;
    }

}
