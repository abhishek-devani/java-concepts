package stackUsingLinkedList;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackUsingLinkedList {

    private static class Node {
        int val;
        Node next;

        Node (int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    Node h = null;
    int c = 0;

    public void push(int x) {
        Node nn = new Node(x, null);
        nn.next = h;
        h = nn;
        c++;
    }

    public int pop() {
        if (h == null) {
            throw new EmptyStackException();
        }
        int val = h.val;
        h = h.next;
        c--;
        return val;
    }

    public int size() {
        return c;
    }

    public int top() {
        if (h == null) {
            throw new EmptyStackException();
        }
        return h.val;
    }

}