package com.struct.interview_question.list_interview_question.cyclelist;

import com.struct.interview_question.list_interview_question.ListNode;

/**
*@Description: 求带环链表环的长度
*@Author： dyy
*/
public class CycleLength {
    //判断链表是否带环，返回相交点
    public ListNode hasCycle(ListNode head){
        if(head==null||head.nextNode==null){
            return null;
        }
        ListNode pre = head;
        ListNode lat = head;
        while (pre!=null){
            pre = pre.nextNode.nextNode;
            lat = lat.nextNode;
            if(pre==lat){
                return pre;
            }
        }
        return null;
    }
    //求环的长度，参数为相交点
    public int cycleLength(ListNode node){
        ListNode current = node;
        int length = 0;
        while (current!=null){
            current = current.nextNode;
            length++;
            if(current==node){
                return length;
            }
        }
        return length;
    }
}
