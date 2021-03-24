package DataStructures.Stacks;

import java.util.EmptyStackException;

/**
 * This is an example of creating a stack of objects and backing that stack with an Array.
 */

public class StackWithArray {

    /*          Instance Variables          */
    private Employee[] employeeStack;
    private int topOfStack;
    /*          Constructor                 */
    public StackWithArray(int capacity) {
        employeeStack = new Employee[capacity];
    }

    /*          Basic Stack Operations      */
    //     This locates the top of the stack which is the last element that is not empty in our array
//     adds 1 to the arrays index and to the int that is keeping track of what is at the top of the stack
//     and then adds the new employee to the top of the stack
    public void push(Employee employee) {
    //         If this is true, the array is full and we need to resize the backing array
    //         and to reduce the amount of times we will need to resize the array we will
    //         simply double the size of the arrays capacity
        if (topOfStack == employeeStack.length) {
            resizeArray(employeeStack);
        }
        employeeStack[topOfStack++] = employee;
    }

    public Employee pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Employee employee = employeeStack[--topOfStack];
        employeeStack[topOfStack] = null;
        return employee;
    }

    public Employee peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return employeeStack[topOfStack - 1];
    }


    /*          Functional Operations       */
    public boolean isEmpty() {
        return topOfStack == 0;
    }

    //     System.arraycopy format
//     1. what we are copying
//     2. where we want to start copying what we are copying from
//     3. where we are copying to
//     4. where we want to start copying into
//     5. the amount of items from what we are copying that we want to copy to the new array
    public void resizeArray(Employee[] stack) {
        Employee[] tempArray = new Employee[2 * employeeStack.length];
        System.arraycopy(employeeStack, 0, tempArray, 0, employeeStack.length);
        employeeStack = tempArray;
    }

    public void printStack() {
        for (int i = topOfStack -1; i >= 0; i--) {
            System.out.println(employeeStack[i]);
        }
    }
}
