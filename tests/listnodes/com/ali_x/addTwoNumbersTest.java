package listnodes.com.ali_x;

import junit.framework.TestCase;

import static listnodes.com.ali_x.Main.addTwoNumbers;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Ali-X on 06.07.2017.
 */
public class addTwoNumbersTest extends TestCase {
    public void testAddTwoNumbers() throws Exception {
        int[] list1 = new int[]{2, 2, 1, 9, 0};
        int[] list2 = new int[]{1, 1, 9, 1, 2};
        int[] expectedResult = new int[]{3, 3, 0, 1, 3};
        int[] result = new int[5];

        ListNode node1 = null;
        ListNode node2 = null;
        ListNode listNode1 = null;
        ListNode listNode2 = null;
        ListNode listNodeResult;
        //first list
        for (int aList1 : list1) {
            if (listNode1 == null) {
                listNode1 = new ListNode(aList1);
                node1 = listNode1;
            } else {
                while (listNode1.next != null) {
                    listNode1 = listNode1.next;
                }
                listNode1.next = new ListNode(aList1);
            }
        }
        //second list
        for (int aList2 : list2) {
            if (listNode2 == null) {
                listNode2 = new ListNode(aList2);
                node2 = listNode2;
            } else {
                while (listNode2.next != null) {
                    listNode2 = listNode2.next;
                }
                listNode2.next = new ListNode(aList2);
            }
        }
        //Adding
        listNodeResult = addTwoNumbers(node1, node2);
        for (int i = 0; i < result.length; i++) {
            result[i] = listNodeResult.val;
            listNodeResult = listNodeResult.next;
            if (listNodeResult == null) break;
        }
        assertArrayEquals(expectedResult, result);
    }

}