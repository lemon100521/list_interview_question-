package com.struct.interview_question.list_interview_question.insertnode;

import com.struct.interview_question.list_interview_question.ListNode;

public class InsertNode {
    //在无头链表的任意节点前插入节点(不遍历链表)
    public void insertNodePre(ListNode node){
        ListNode newNode = new ListNode("lll");
        //新节点指向要插入节点的下一个节点
        newNode.nextNode = node.nextNode;
        //指点节点指向新的节点
        node.nextNode = newNode;
        //交换节点的值
        Object curData = node.data;
        node.data = newNode.data;
        newNode.data = curData;
    }
}
