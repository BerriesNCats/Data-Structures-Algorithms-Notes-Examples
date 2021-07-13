package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableUserDriver {
    public static void main(String[] args) {
        ComparableUser user1 = new ComparableUser("bob", "guy", 439);
        ComparableUser user2 = new ComparableUser("some", "kind", 9);
        ComparableUser user3 = new ComparableUser("so", "hey", 90);
        ComparableUser user4 = new ComparableUser("this", "is", 390);

        List<ComparableUser> comparableUsers = new ArrayList();

        comparableUsers.add(user1);
        comparableUsers.add(user2);
        comparableUsers.add(user3);
        comparableUsers.add(user4);

        Collections.sort(comparableUsers);

        for (int i = 0; i < comparableUsers.size(); i++) {
            System.out.println(comparableUsers.get(i).getFavoriteNumber() + " " +
                    comparableUsers.get(i).getFirstName());
        }
    }
}
