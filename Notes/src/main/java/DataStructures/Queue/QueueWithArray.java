package DataStructures.Queue;

import DataStructures.Stacks.Employee;

import java.util.NoSuchElementException;

public class QueueWithArray {

    private Employee[] queue;
    private int frontOfQueue;
    private int backOfQueue;
    // Back of queue is pointing at the next available position in the array

    public QueueWithArray(int capacity) {
        queue = new Employee[capacity];
    }

    public void addEnqueue (Employee employee) {
        if (size() == queue.length - 1) {
            int numItems = size();
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue, frontOfQueue, newArray, 0, queue.length - frontOfQueue);
            System.arraycopy(queue, 0, newArray, queue.length - frontOfQueue, backOfQueue);

            queue = newArray;
            frontOfQueue = 0;
            backOfQueue = numItems;
        }
        queue[backOfQueue] = employee;
        if (backOfQueue < queue.length - 1) {
            backOfQueue++;
        } else {
            backOfQueue = 0;
        }
    }

    public Employee removeDequeue() {
        if (size() == 0) throw new NoSuchElementException();
        Employee employee = queue[frontOfQueue];
        queue[frontOfQueue] = null;
        frontOfQueue++;
        if (size() == 0) {
            frontOfQueue = 0;
            backOfQueue = 0;
        } else if (frontOfQueue == queue.length) {
            frontOfQueue = 0;
        }
        return employee;
    }

    public Employee peek() {
        if (size() == 0) throw new NoSuchElementException();
        return queue[frontOfQueue];
    }

    public int size() {
        if (frontOfQueue <= backOfQueue) {
            return backOfQueue - frontOfQueue;
        } else {
            return backOfQueue - frontOfQueue + queue.length;
        }
    }

    public void printQueue() {
        if (frontOfQueue <= backOfQueue) {
            for (int i = frontOfQueue; i < backOfQueue; i++) {
                System.out.println(queue[i]);
            }
        } else {
            for (int i = frontOfQueue; i < queue.length; i++) {
                System.out.println(queue[i]);
            }
            for (int i = 0; i < backOfQueue; i++) {
                System.out.println(queue[i]);
            }
        }
    }

}
