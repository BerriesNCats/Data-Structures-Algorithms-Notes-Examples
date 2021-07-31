package Algorithms.LeetCode;
/**
 * LeetCode #0021
 *
 * Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the
 * nodes of the first two lists.
 *
 * Example Input
 *      list1 = [1,2,4]
 *      list2 = [1,3,4]
 *
 *      Output = [1,1,2,3,4,4]
 */
public class MergeTwoSortedLists {

    /**
     * Steps
     * - create a temporary head and a temp node
     * - create a loop that goes while there is a non null node in both lists
     * - if the value in list 1 is below list 2, add it to the list and change the node to the next node
     *   in that list
     * - once we have reached the end of one list, we need to add the rest of the other list to our temp list
     * - return the new list starting after our temporary head
     *
     * @param list1 the first node in the first linked list
     * @param list2 the first node in the second linked list
     * @return the merge sorted linked list
     */
    public static ListNode mergeTwoLinkedLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode(-1);
        ListNode tempHead = mergedList;

        while (list1 != null & list2 != null) {
            if (list1.value <= list2.value) {
                mergedList.next = list1;
                list1 = list1.next;
            } else {
                mergedList.next = list2;
                list2 = list2.next;
            }
            mergedList = mergedList.next;
        }

        if (list1 != null) {
            mergedList.next = list1;
        } else {
            mergedList.next = list2;
        }

        return tempHead.next;
    }
}

class ListNode {
    int value;
    ListNode next;
    ListNode() {}
    ListNode(int value) { this.value = value; }
    ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}