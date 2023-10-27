package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pair<Integer, String> p1 = new Pair<>(1, "abhishek");
        System.out.println(p1.getFirst());
        System.out.println(p1.getSecond());

        Pair<String, Double> p2 = new Pair<>("Hi", 2.34);
        System.out.println(p2.getFirst());
        System.out.println(p2.getSecond());

//        Raw Data Types
//        Pair p3 = new Pair("Hi", "World");
//        Integer i = (Integer) p3.getFirst();

//        p1.doSomethingOnFirst("Hi");

        p1.printMoreFirsts(
                List.of(3, 1, 9, 8)
        );

        Pair<Animal, Integer> animalCounts = new Pair<>(new Animal(), 45);
        Animal a1 = new Animal();
        a1.name = "Abhishek";
        Animal a2 = new Animal();
        a2.name = "Amit";
        Animal a3 = new Dog();
        a3.name = "XYZ";

        animalCounts.printMoreFirsts(
                List.of(a1, a2, a3)
        );

        Dog d1 = new Dog();
        d1.name = "abc";

        Dog d2 = new Dog();
        d2.name = "def";

        Dog d3 = new Dog();
        d3.name = "ghi";

        List<Dog> dogs = new ArrayList<>();
        dogs.add(d1);
        dogs.add(d2);
        dogs.add(d3);

        animalCounts.printMoreFirstsAgain(dogs);

    }

}
