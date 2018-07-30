package com.struct.interview_question.list_interview_question.cyclelist;

import com.struct.interview_question.list_interview_question.ListNode;

/**
*@Description: 判断链表是否带环
*@Author： dyy
*/
public class ListHasCycle {
    public boolean hasCycle(ListNode head){
        if(head==null||head.nextNode==null){
            return false;
        }
        ListNode pre = head;
        ListNode lat = head;
        while (pre!=null){
            pre = pre.nextNode.nextNode;
            lat = lat.nextNode;
            //当两个节点相遇时就表明有环
            if(pre == lat){
                return true;
            }
        }
        return false;
    }
}
