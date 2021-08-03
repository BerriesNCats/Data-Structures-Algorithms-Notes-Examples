package Algorithms;

public class ManchesterCode {

    public static void main(String[] args) {

        String code;
        code = "10100111001";

        System.out.println(manchesterCode(code));

    }

    // Sample Input = 010
    // Conversion 01 10 01
    // Sample Output = 011001
    public static String manchesterCode(String code){
        // Convert String to char array
        // Create a StringBuilder object
        // If the char is a 0, add 01 to StringBuilder
        // If the char is a 1, add 10 to StringBuilder

        char[] rawData = code.toCharArray();

        StringBuilder manchesterCode = new StringBuilder();

        for (int i = 0; i < rawData.length; i++) {
            if (rawData[i] == '0') {
                manchesterCode.append("01");
            } else if (rawData[i] == '1') {
                manchesterCode.append("10");
            }
        }

        return manchesterCode.toString();
    }

}
