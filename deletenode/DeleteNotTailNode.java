package com.struct.interview_question.list_interview_question.deletenode;

import com.struct.interview_question.list_interview_question.ListNode;

public class DeleteNotTailNode {
    //不遍历链表删除无头单链表的非尾节点(参数为要删除的节点)
    public void deleteNotTailNode(ListNode node){
        ListNode curNode = null;
        if(node.nextNode!=null) {
            curNode = node.nextNode;
            node.data = curNode.data;
            node.nextNode = curNode.nextNode;
        }
    }
}
