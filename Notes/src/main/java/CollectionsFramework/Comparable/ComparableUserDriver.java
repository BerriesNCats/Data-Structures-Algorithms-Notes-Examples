package CollectionsFramework.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableUserDriver {
    public static void main(String[] args) {
        MyUser user1 = new MyUser("bob", "guy", 439);
        MyUser user2 = new MyUser("some", "kind", 9);
        MyUser user3 = new MyUser("so", "hey", 90);
        MyUser user4 = new MyUser("this", "is", 390);

        List<MyUser> myUsers = new ArrayList();

        myUsers.add(user1);
        myUsers.add(user2);
        myUsers.add(user3);
        myUsers.add(user4);

        Collections.sort(myUsers);

        for (int i = 0; i < myUsers.size(); i++) {
            System.out.println(myUsers.get(i).getFavoriteNumber() + " " +
                    myUsers.get(i).getFirstName());
        }
    }
}
