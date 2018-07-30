package com.struct.interview_question.list_interview_question.listjosephcircle;

import com.struct.interview_question.list_interview_question.ListNode;

public class ListJosephCircle{
//单链表解决约瑟夫环问题
    public void listJosephCircle(int perNum, int exitNum, ListNode tail){
        while(tail!=tail.nextNode){
            for(int i =1 ;i < exitNum;i++)
                //移动tail的指向
                tail = tail.nextNode;
            //删除第m个节点
            System.out.println(tail.nextNode.data+" ");
            //将tail的next指向要删除节点的下一个节点
            tail.nextNode = tail.nextNode.nextNode;
        }
        System.out.println("幸运者为："+tail.data);
    }
}
