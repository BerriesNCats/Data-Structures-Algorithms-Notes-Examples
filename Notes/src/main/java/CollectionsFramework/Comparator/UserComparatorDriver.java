package CollectionsFramework.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserComparatorDriver {

    public static void main(String[] args) {
        UserDetails userDetails1 = new UserDetails("Bob", 5000);
        UserDetails userDetails2 = new UserDetails("Susan", 300000);
        UserDetails userDetails3 = new UserDetails("George", 30);
        UserDetails userDetails4 = new UserDetails("Henry", 600);
        UserDetails userDetails5 = new UserDetails("Porge", 40000);

        List<UserDetails> userDetailsList = new ArrayList<>();

        userDetailsList.add(userDetails1);
        userDetailsList.add(userDetails2);
        userDetailsList.add(userDetails3);
        userDetailsList.add(userDetails4);
        userDetailsList.add(userDetails5);

        Collections.sort(userDetailsList, new UserDonationAmountComparator());

        for (int i = 0; i < userDetailsList.size(); i++) {
            System.out.println(userDetailsList.get(i).getDonationAmount() + " " +
                    userDetailsList.get(i).getFirstName());
        }


    }


 }
