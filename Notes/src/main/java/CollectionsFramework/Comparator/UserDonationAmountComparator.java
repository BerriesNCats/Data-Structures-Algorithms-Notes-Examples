package CollectionsFramework.Comparator;

import java.util.Comparator;

public class UserDonationAmountComparator implements Comparator<UserDetails>{

    // This will allow users to be ordered by the largest donation amount;
    @Override
    public int compare(UserDetails user1, UserDetails user2) {
        if (user1.getDonationAmount() > user2.getDonationAmount()) return -1;
        else if (user1.getDonationAmount() < user2.getDonationAmount()) return 1;
        else return 0;
    }
}
