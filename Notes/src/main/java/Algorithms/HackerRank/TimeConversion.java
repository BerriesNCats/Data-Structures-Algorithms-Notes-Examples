package Algorithms.HackerRank;

public class TimeConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    // Sample Input 07:05:45PM
    // Sample Output 19:05:45
    // 12:00:00 AM = 00:00:00
    // 12:00:00 PM = 12:00:00

    public static String timeConversion(String s) {
        String hour = s.substring(0, 2);
        String amORpm = s.substring(8);
        StringBuilder result = new StringBuilder();

        if (hour.equals("12") && amORpm.equals("AM")) {
            hour = "00";
            result.append(hour).append(s, 2, 8);
        } else if (amORpm.equals("PM") && (!hour.equals("12"))) {
            int numberHour = Integer.parseInt(hour);
            numberHour += 12;
            result.append(numberHour).append(s, 2, 8);
        } else {
            result.append(s, 0, 8);
        }

        return result.toString();
    }

}
