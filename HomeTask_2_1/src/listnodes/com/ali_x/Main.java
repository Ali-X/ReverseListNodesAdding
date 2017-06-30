package listnodes.com.ali_x;

import java.util.Random;

public class Main {

    private static int temp = 0;

    public static void main(String[] args) {
        Random rand = new Random();
        int size = 5;
        int element;
        ListNode Node1 = null;
        ListNode Node2 = null;
        ListNode listNode1 = null;
        ListNode listNode2 = null;
        ListNode listNodeResult;
        //first list
        for (int i = 0; i < size; i++) {
            element = rand.nextInt(10);
            if (listNode1 == null) {
                listNode1 = new ListNode(element);
                Node1 = listNode1;
            } else {
                while (listNode1.next != null) {
                    listNode1 = listNode1.next;
                }
                listNode1.next = new ListNode(element);
            }
        }
        //second list
        for (int i = 0; i < size; i++) {
            element = rand.nextInt(10);
            if (listNode2 == null) {
                listNode2 = new ListNode(element);
                Node2 = listNode2;
            } else {
                while (listNode2.next != null) {
                    listNode2 = listNode2.next;
                }
                listNode2.next = new ListNode(element);
            }
        }
        //Adding
        listNodeResult = addTwoNumbers(Node1, Node2);
        //print out
        System.out.println("First list");
        while (Node1 != null) {
            System.out.print(Node1.val + " ");
            Node1 = Node1.next;
        }
        System.out.println("\nSecond list");
        while (Node2 != null) {
            System.out.print(Node2.val + " ");
            Node2 = Node2.next;
        }
        System.out.println("\nAdding result");
        while (listNodeResult != null) {
            System.out.print(listNodeResult.val + " ");
            listNodeResult = listNodeResult.next;
        }
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        if (l1 == null || l2 == null) {
            if (temp == 1) result = new ListNode(temp);
            return result;
        }
        int summ = l1.val + l2.val + temp;
        if (summ < 10) {
            temp = 0;
            result = new ListNode(summ);
            result.next = addTwoNumbers(l1.next, l2.next);
            return result;
        } else {
            temp = 1;
            result = new ListNode(summ - 10);
            result.next = addTwoNumbers(l1.next, l2.next);
            return result;
        }
    }
}
