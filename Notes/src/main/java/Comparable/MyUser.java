package Comparable;

public class MyUser implements Comparable<MyUser>{

    private String firstName;
    private String userName;
    private int favoriteNumber;

    public MyUser(String firstName, String userName, int favoriteNumber) {
        this.firstName = firstName;
        this.userName = userName;
        this.favoriteNumber = favoriteNumber;
    }

    // This Override will order a comparable user list by their favorite number in ascending order
    @Override
    public int compareTo(MyUser otherMyUser) {
        if (this.getFavoriteNumber() < otherMyUser.getFavoriteNumber()) {
            return -1;
        } else if (this.getFavoriteNumber() > otherMyUser.getFavoriteNumber()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getFavoriteNumber() {
        return favoriteNumber;
    }

    public void setFavoriteNumber(int favoriteNumber) {
        this.favoriteNumber = favoriteNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
