package com.struct.interview_question.list_interview_question.twolikehascycle;

import com.struct.interview_question.list_interview_question.ListNode;
import com.struct.interview_question.list_interview_question.cyclelist.ListHasCycle;

public class ListMeet {
    public ListNode twoLikeMeet(ListNode head1,ListNode head2) {
        //两个链表有一个为空时
        if (head1 == null || head2 == null) {
            return null;
        }
        int length1 = getLength(head1);
        int length2 = getLength(head2);
        //记录两个链表的长度差
        int lengthDif = 0;
        ListNode longNode;
        ListNode shortNode;
        if(length1>length2){
            longNode = head1;
            shortNode = head2;
            lengthDif = length1-length2;
        }else{
            longNode = head2;
            shortNode = head1;
            lengthDif = length2-length1;
        }
        //将较长的链表先向前走长度差步
        for(int i = 0; i <lengthDif; i++){
            longNode = longNode.nextNode;
        }
        //将两个节点同时向后移动，第一个相等的点即为交点
        while (longNode!=null && shortNode!=null){
            if(longNode==shortNode){
                return longNode;
            }
            longNode = longNode.nextNode;
            shortNode = shortNode.nextNode;
        }
        return null;
    }
    //求链表的长度
    public static int getLength(ListNode head){
        if(head==null){
            return 0;
        }
        int count = 0;
        ListNode cur = head;
        while (cur!=null){
            count++;
            cur=cur.nextNode;
        }
        return count;
    }
}
