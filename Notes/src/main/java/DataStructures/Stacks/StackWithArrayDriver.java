package DataStructures.Stacks;

public class StackWithArrayDriver {

    public static void main(String[] args) {

        StackWithArray myStack = new StackWithArray(10);

        myStack.push(new Employee("David", "Amateau", 1001));
        myStack.push(new Employee("George", "B", 1002));
        myStack.push(new Employee("Alice", "Jones", 1003));
        myStack.push(new Employee("Adam", "Smith", 1004));


        myStack.pop();
        myStack.printStack();
    }
}
