package queueUsingStack;

public class Main {
    public static void main(String[] args) {

        QueueUsingStack queue = new QueueUsingStack();

        queue.enQueue(20);
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
        System.out.println(queue.deQueue());
        System.out.println(queue.isEmpty());
        queue.enQueue(30);
        System.out.println(queue.peek());
        queue.enQueue(40);
        System.out.println(queue.peek());

    }
}
