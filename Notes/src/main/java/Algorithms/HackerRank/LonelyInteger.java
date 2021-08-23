package Algorithms.HackerRank;

import java.util.Collections;
import java.util.List;

public class LonelyInteger {

    public static int lonelyinteger(List<Integer> a) {
        Collections.sort(a);

        if (a.size() < 2) return a.get(0);

        for (int i = 1; i < a.size(); i++) {
            if (i == a.size() - 1) {
                if (a.get(i) != a.get(i - 1)) {
                    return a.get(i);
                }
            } else if (a.get(i) != a.get(i - 1) && a.get(i) != a.get(i + 1)) {
                return a.get(i);
            }
        }
        return -1;
    }
}
