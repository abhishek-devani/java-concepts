package generics;

import java.util.List;

public class Pair<FIRST, SECOND> {

    private FIRST first;
    private SECOND second;

    public Pair(FIRST first, SECOND second) {
        this.first = first;
        this.second = second;
    }

    public FIRST getFirst() {
        return first;
    }

    public SECOND getSecond() {
        return second;
    }

    public void doSomethingOnFirst(String greetings) {
        System.out.println(greetings);
        System.out.println(first);
        System.out.println(second);
    }

    public void printMoreFirsts(List<FIRST> firsts) {
        for (FIRST f: firsts) {
            System.out.println(f);
        }
    }

//    It also allows any data types which extends FIRST
    public void printMoreFirstsAgain(List<? extends FIRST> firsts) {
        for (FIRST f: firsts) {
            System.out.println(f);
        }
    }

}
