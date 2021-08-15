import java.util.Arrays;

public class GiveChange {



    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
    }

    public static int giveChange(int[] coins, int amount) {
        int dyanmicArray[] = new int[amount + 1];
        Arrays.fill(dyanmicArray, amount + 1);
        dyanmicArray[0] = 0;

        for (int i = 0; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dyanmicArray[i] = Math.min(dyanmicArray[i], 1 + dyanmicArray[i - coins[j]]);
                }
            }
        }

        return dyanmicArray[amount] > amount ? -1: dyanmicArray[amount];
    }
}
