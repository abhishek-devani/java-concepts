package collections;

public class Student implements Comparable<Student>{

    int id;
    int age;
    String name;
    double psp;

    public double getPsp() {
        return psp;
    }

    public Student(int id, int age, String name, double psp) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.psp = psp;
    }

    @Override
    public int compareTo(Student other) {
        if(this.name.compareTo(other.name) < 0) {
            return -1;
        }
        return 1;
    }

//    this <--> other
//    < 0 --> current student is smaller than the other student.  | this ... other |
//    = 0 --> both student are equal. Put them in any order.  | this ... other | or | other ... this |
//    > 0 --> current student is greater than the other student. Put this after. | other ... this |

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", psp=" + psp +
                '}';
    }
}
