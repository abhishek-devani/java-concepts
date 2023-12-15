package stackUsingLinkedList;

import java.util.EmptyStackException;

public class Main {

    public static void main(String[] args) {
        // Creating an instance of the StackUsingLinkedList class
        StackUsingLinkedList stack = new StackUsingLinkedList();

        // Pushing elements onto the stack
        stack.push(5);
        stack.push(10);
        stack.push(15);

        // Displaying the size of the stack
        System.out.println("Size of the stack: " + stack.size());

        // Displaying the top element of the stack
        try {
            System.out.println("Top element of the stack: " + stack.top());
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty");
        }

        // Popping elements from the stack
        try {
            System.out.println("Popped element: " + stack.pop());
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty");
        }

        try {
            System.out.println("Popped element: " + stack.pop());
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty");
        }

        try {
            System.out.println("Top element of the stack: " + stack.top());
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty");
        }

        // Displaying the size of the stack after popping
        System.out.println("Size of the stack after popping: " + stack.size());

        // Pushing element
        stack.push(21);
        System.out.println("Size of the stack after pushing: " + stack.size());
        System.out.println("Top element of the stack: " + stack.top());

    }
}
