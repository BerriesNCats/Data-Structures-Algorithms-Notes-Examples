package CollectionsFramework.Comparator;

public class UserDetails {

    private String firstName;
    private int donationAmount;

    public UserDetails(String firstName, int donationAmount) {
        this.firstName = firstName;
        this.donationAmount = donationAmount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getDonationAmount() {
        return donationAmount;
    }

    public void setDonationAmount(int donationAmount) {
        this.donationAmount = donationAmount;
    }
}
