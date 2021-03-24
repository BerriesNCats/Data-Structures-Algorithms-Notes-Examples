package DataStructures.MyLinkedList;

public class EmployeeLinkedList {

    /*          Instance Variables          */
    private EmployeeNode headNode;
    private int listSize;

    // When we add a node to the Linked List at the front, it becomes
    // the new Head node in the list
    public void addToFront (Employee employee) {
        EmployeeNode newNode = new EmployeeNode(employee);
        newNode.setNextNode(headNode);
        headNode = newNode;
        listSize++;
    }

    // When we remove a node from the Linked List at the front, we need to
    // store it so we can reassign the next node in the list as the new
    // head node.
    public EmployeeNode removeFromFront () {
        if (isEmpty()) return null;
        EmployeeNode removedNode = headNode;
        headNode = headNode.getNextNode();
        listSize--;
        removedNode.setNextNode(null);
        return removedNode;
    }

    public int getSize() {
        return listSize;
    }

    public boolean isEmpty() {
        return headNode == null;
    }

    public void printList() {
        EmployeeNode currentNode = headNode;
        System.out.print("Head -> ");
        while (currentNode != null) {
            System.out.print(currentNode);
            System.out.print(" -> ");
            currentNode = currentNode.getNextNode();
        }
        System.out.println("Null");
    }

}
