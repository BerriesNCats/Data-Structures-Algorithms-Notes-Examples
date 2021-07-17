package CollectionsFramework.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDriver {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(30);
        integerList.add(400);
        integerList.add(2);
        integerList.add(289);

        // The Iterator references the object it was created from and can alter the list wrapped in the iterator
        ListIterator iterator = integerList.listIterator();

        iterator.add(459);

        while (iterator.hasNext()) {
            Integer current = (Integer) iterator.next();
            if (current < 5) iterator.remove();
        }

        System.out.println(integerList);
    }
}
