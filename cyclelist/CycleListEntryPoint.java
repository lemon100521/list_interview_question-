package com.struct.interview_question.list_interview_question.cyclelist;

import com.struct.interview_question.list_interview_question.ListNode;

/**
*@Description: 求带环链表的环的入口点
*@Author： dyy
 */
public class CycleListEntryPoint {
    public ListNode findEntryPoint(ListNode head,int cycleLength){
        if(head == null){
            return null;
        }
        ListNode pre = head;
        ListNode lat = head;
        for(int i = 0; i < cycleLength;i++){
            pre = pre.nextNode;
        }
        while (pre!=null && lat!=null){
            pre = pre.nextNode;
            lat = lat.nextNode;
            if(pre==lat){
                return pre;
            }
        }
        return null;
    }
}
