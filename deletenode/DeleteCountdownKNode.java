package com.struct.interview_question.list_interview_question.deletenode;

import com.struct.interview_question.list_interview_question.ListNode;

/**
*@Description: 删除倒数第k个节点
*@Author： dyy
*/
public class DeleteCountdownKNode {
    //要删除倒数第index个节点
    public boolean deleteCountdownNode(ListNode head,int index){
        if(index==0||head==null) return false;
        //走在前面的节点
        ListNode premer = head;
        //走在后面的节点
        ListNode latter = head;
        for(int i = 0; i < index; i++){
            premer = premer.nextNode;
        }
        //此处表明要删除节点刚好为头结点
        if(premer == null){
            head = head.nextNode;
            return true;
        }
        while (premer.nextNode!=null){
            premer = premer.nextNode;
            latter = latter.nextNode;
        }
        //循环结束后者即为倒数第k个节点的前一个节点，改变指向即可删除
        latter.nextNode = latter.nextNode.nextNode;
        return true;
    }
}
