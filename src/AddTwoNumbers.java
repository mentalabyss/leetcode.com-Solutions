public class AddTwoNumbers {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode ret = l1;
            while(l2 != null){

                l1.val += l2.val;
                ListNode test = l1;

                while(test.val > 9){
                    test.val %= 10;
                    if(test.next != null)
                        test.next.val++;
                    else{
                        test.next = new ListNode(1);
                    }
                    test = test.next;
                }
                //if (l1.val > 9){
                //    l1.val %= 10;
                //    if(l1.next != null)
                //        l1.next.val++;
                //    else{
                //        l1.next = new ListNode(1);
                //    }
                //}

                if(l1.next == null && l2.next != null)
                    l1.next = new ListNode(0);

                l1 = l1.next;
                l2 = l2.next;

            }
            return ret;
        }
    }

    public static void main(String[] args){
        Solution solution = new AddTwoNumbers().new Solution();

        AddTwoNumbers.ListNode listNode = new AddTwoNumbers().new ListNode(9);
        listNode.next = new AddTwoNumbers().new ListNode(9);
        AddTwoNumbers.ListNode it; // = listNode.next;
        //it.next = new AddTwoNumbers().new ListNode(3);

        AddTwoNumbers.ListNode listNode2 = new AddTwoNumbers().new ListNode(9);
        //listNode2.next = new AddTwoNumbers().new ListNode(3);
        //it = listNode2.next;
        //it.next = new AddTwoNumbers().new ListNode(4);

        AddTwoNumbers.ListNode listNode3 = new AddTwoNumbers().new ListNode(8);
        listNode3.next = new AddTwoNumbers().new ListNode(0);
        it = listNode3.next;
        it.next = new AddTwoNumbers().new ListNode(1);

        ListNode res = solution.addTwoNumbers(listNode, listNode2);
        while (res != null){
            System.out.print(res.val);
            res = res.next;
        }
    }
}
