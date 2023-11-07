package streams;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Integer> l1 = List.of(
                1, 2, 3, 4
        );

        Stream<Integer> s1 = l1.stream();

//        s1.forEach(System.out::println);

        s1.forEach(
                (ele) -> {
                    System.out.println(ele * 2);
                }
        );

        // Given a list with some elements and empty set
        // add all elements of the list to a set.

        List<Integer> l10 = List.of(
          1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        );

        Set<Integer> s10 = new HashSet<>();

        Stream<Integer> st10 = l10.stream();

        st10.forEach(
                (ele) -> {
                    s10.add(ele);
                }
        );

        // another approach
        l10.stream().forEach((ele) -> {s10.add(ele);});

        // list all the even elements with multiplication of 2
        s10.stream()
                // filter function return an element only if given condition is true
                .filter((ele) -> ele % 2 == 0)
                .forEach((ele) -> System.out.println(ele * 2));

        // multiply number with 3 then print those numbers which are less than 20
        l10.stream()
                .map((ele) -> ele * 3)
                .filter((ele) -> ele < 20)
                .forEach(System.out::println);

        // print only first number from above question
        Optional<Integer> i = l10.stream()
                                    .map((ele) -> ele * 3)
                                    .filter((ele) -> ele < 20)
                                    .findFirst();

        if (i.isEmpty()) {
            System.out.println("No Number");
        }

        System.out.println(i.get());

        // print hashset
        for(Integer i: s10) {
            System.out.println(i);
        }

    }

}
