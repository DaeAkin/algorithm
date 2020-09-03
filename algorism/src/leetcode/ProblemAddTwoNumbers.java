package leetcode;

public class ProblemAddTwoNumbers {


    public static void main(String[] args) {
        Solution solution = new Solution();

<<<<<<< HEAD
//         ListNode testNode1 = new ListNode(2);
//         testNode1.next = new ListNode(4);
//         testNode1.next.next = new ListNode(3);
//
//         ListNode testNode2 = new ListNode(5);
//         testNode2.next = new ListNode(6);
//         testNode2.next.next = new ListNode(4);

        ListNode testNode1 = new ListNode(1);
        testNode1.next = new ListNode(8);
=======
         ListNode testNode1 = new ListNode(2);
         testNode1.next = new ListNode(4);
         testNode1.next.next = new ListNode(3);
>>>>>>> fd91c7ecb7f758f425de4d88845c9c615ae69207

         ListNode testNode2 = new ListNode(5);
         testNode2.next = new ListNode(6);
         testNode2.next.next = new ListNode(4);

//        ListNode testNode1 = new ListNode(0);
//
//
//        ListNode testNode2 = new ListNode(0);


        ListNode listNode = solution.addTwoNumbers(testNode1, testNode2);
        System.out.println(listNode.val + ":" + listNode.next.val + ":" );
    }

    static public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0);
            ListNode p = l1, q = l2, curr = dummyHead;
            int carry = 0;
            while (p != null || q != null) {
                int x = (p != null) ? p.val : 0;
                int y = (q != null) ? q.val : 0;
                int sum = carry + x + y;
                carry = sum / 10;
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
                if (p != null) p = p.next;
                if (q != null) q = q.next;
            }
            if (carry > 0) {
                curr.next = new ListNode(carry);
            }
            return dummyHead.next;
        }
//        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//            int numberOne = ListToInt(l1);
//            int numberTwo = ListToInt(l2);
//
//            return toListNode(numberOne + numberTwo);
//        }

        public int ListToInt(ListNode node) {
            String result = "";
            while (true) {
                result += String.valueOf(node.val);

                if (node.next == null)
                    break;
                node = node.next;
            }
            return Integer.parseInt(result);
        }

        public ListNode toListNode(int num) {
            String[] number = String.valueOf(num).split("");
            ListNode listNode = new ListNode(Integer.parseInt(number[number.length - 1]));
            if (number.length == 1)
                return new ListNode(num);

            listNode.next = new ListNode();
            ListNode nextNode = listNode.next;

            for (int i = number.length - 2; i >= 0; i--) {
                nextNode.val = Integer.parseInt(number[i]);
                if (i != 0) {
                    nextNode.next = new ListNode();
                    nextNode = nextNode.next;
                }
            }
            return listNode;
        }
    }
}
