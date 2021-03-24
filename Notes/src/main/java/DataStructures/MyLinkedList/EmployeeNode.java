package DataStructures.MyLinkedList;

public class EmployeeNode {

    /*          Instance Variables      */
    private Employee employee;      // The object
    private EmployeeNode nextNode;  // The pointer to the next node in the list

    /*          Constructor             */
    public EmployeeNode (Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(EmployeeNode nextNode) {
        this.nextNode = nextNode;
    }

    public String toString() {
        return employee.toString();
    }
}
