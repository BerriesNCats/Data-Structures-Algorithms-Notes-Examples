package DataStructures.MyLinkedList;

public class EmployeeLinkedListDriver {

    public static void main(String[] args) {

        Employee johnSmith = new Employee("John", "Smith", 1001);
        Employee aliceJones = new Employee("Alice", "Jones", 1002);
        Employee danCooper = new Employee("Dan", "Cooper", 1003);
        Employee bobEtho = new Employee("Bob", "Etho", 1004);

        EmployeeLinkedList employeeList = new EmployeeLinkedList();
        employeeList.addToFront(johnSmith);
        employeeList.addToFront(aliceJones);
        employeeList.addToFront(danCooper);
        employeeList.addToFront(bobEtho);

        employeeList.printList();

        System.out.println(employeeList.getSize());

        System.out.println(employeeList.isEmpty());

        employeeList.removeFromFront();
        System.out.println(employeeList.getSize());

        employeeList.printList();

    }
}
