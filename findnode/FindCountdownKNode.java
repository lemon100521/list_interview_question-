package com.struct.interview_question.list_interview_question.findnode;

import com.struct.interview_question.list_interview_question.ListNode;

public class FindCountdownKNode {
    //查找倒数第index个节点(遍历两遍链表)
    public ListNode findKNode(ListNode head,int index){
        if(head == null||index==0) {
            return null;
        }
        int count = 0;
        ListNode cur = head;
        while(cur!=null){
           count++;
           cur = cur.nextNode;
        }
        if(index>count){
            System.out.println("指定值大于链表长度");
        }
        ListNode node = head;
        for(int i = 0;i < count-index;i++){
            node = node.nextNode;
        }
        return node;
    }

    public ListNode FindKNodeSimple(ListNode head,int index){
        if(head==null||index==0){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        for(int i = 0;i < index-1;i++){
            fast = fast.nextNode;
            //此处表明index已经大于链表长度
            if(fast==null){
                return null;
            }
        }
        while (fast.nextNode!=null){
            slow = slow.nextNode;
            fast = fast.nextNode;
        }
        return slow;
    }
}
