/*
 * Copyright David Amateau 2021.
 */

package Algorithms;

import java.util.Arrays;

public class GiveChange {



    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println(giveChange(coins, amount));
    }

    public static int giveChange(int[] coins, int amount) {
        int[] dynamicArray = new int[amount + 1];
        Arrays.fill(dynamicArray, amount + 1);
        dynamicArray[0] = 0;

        for (int i = 0; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dynamicArray[i] = Math.min(dynamicArray[i], 1 + dynamicArray[i - coin]);
                }
            }
        }

        return dynamicArray[amount] > amount ? -1: dynamicArray[amount];
    }
}
