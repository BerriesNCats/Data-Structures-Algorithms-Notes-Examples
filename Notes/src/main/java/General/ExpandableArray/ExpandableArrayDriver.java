package General.ExpandableArray;

public class ExpandableArrayDriver {

    public static void main(String[] args) {
        ExpandableArray myList = new ExpandableArray();
        myList.set(14, "Bob");
        myList.set(21, "Sally");

        String value = (String) myList.get(14);
        if (value!= null) System.out.println("Got value: " + value);
    }
}
