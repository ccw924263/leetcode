package leetcode;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode L1, ListNode L2) {
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            while (L1 != null){
                list1.add(L1.val);
                L1 = L1.next;
            }
            while (L2 != null){
                list2.add(L2.val);
                L2 = L2.next;
            }
            return null;
        }
    }















}
