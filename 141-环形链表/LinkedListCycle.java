package LinkedListCycle;

/**
 * @Author: lirito
 * @Date: 2020/5/20 14:39
 * @Version：
 * @Description：判断链表是否存在环
 * @解决思路：第一次做关于链表的题目，我是没有思路。直接看的题解。
 * @：这个问题的关键是处理2个问题，第一个是怎么判断有环。第二个是怎么处理不满足条件的时候。
 * 当两个指针相遇的时候，则有环。
 * 不满足条件的时候，使用快慢指针，快的指针走2步，慢的指针走1步。这样最大走的环数是两个指针步子大小的最小公倍数
 */

public class LinkedListCycle {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head){
        if(head == null) return false;
        ListNode l1 = head;
        ListNode l2 = head.next;
        while (l1 != null && l2 != null && l2.next != null){
            if(l1 == l2) return true;
            l1 = l1.next;
            l2 = l2.next.next;
        }
    }

    public static void main(String[] args){

    }
}
