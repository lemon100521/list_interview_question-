package com.struct.interview_question.list_interview_question.findnode;

import com.struct.interview_question.list_interview_question.ListNode;

/**
*@Description: 查找链表的中间节点，只遍历一次链表
*@Author： dyy
*/

public class FindMiddleNode {
    public ListNode findMiddleNode(ListNode head){
        if(head==null||head.nextNode==null){
            return head;
        }
        //走的慢的节点每次走一步
        ListNode slowNode = head;
        //走的块的节点每次走两步
        ListNode fastNode = head;
        //当走的快的节点为null时，此时走的慢的节点即为中间节点
        while(fastNode!=null && fastNode.nextNode!=null){
                slowNode = slowNode.nextNode;
                fastNode = fastNode.nextNode.nextNode;
        }
       return slowNode;
    }
}
