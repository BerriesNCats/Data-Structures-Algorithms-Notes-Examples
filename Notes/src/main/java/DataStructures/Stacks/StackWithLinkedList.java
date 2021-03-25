package DataStructures.Stacks;

/**
 * This class is being used to demonstrate the simple functionality of a stack
 * However, in practice you can use a class that implements the Deque interface
 * like LinkedList which is an implementation of a stack with greater functionality.
 */

import java.util.LinkedList;

public class StackWithLinkedList {

    private LinkedList<Employee> stack;

    public StackWithLinkedList() {
        stack = new LinkedList<>();
    }

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
