package generics;

public class Animal {

    int age = 25;
    String name = "Hello";
    int weight = 58;

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
