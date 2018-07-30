package com.struct.interview_question.list_interview_question.listsort;

public class BubbleSort {
    //已知头结点，对链表进行冒泡排序
    public ListNode bubbleSort(ListNode head) {
        //只有一个节点或者链表为空的情况
        if (head == null || head.nextNode == null) {
            return head;
        }
        //current用来保存当前节点，tail用来保存尾节点
        ListNode current = null;
        ListNode tail = null;
        current = head;
        while(current.nextNode!=tail){
            while(current.nextNode!=tail){
                //前者大于后者则交换两者的顺序
                if(current.data>current.nextNode.data){
                    int temp = current.data;
                    current.data = current.nextNode.data;
                    current.nextNode.data = temp;
                }
                current = current.nextNode;
            }
            //重置tail为当前节点，current为现在的head
            tail = current;
            current = head;
        }
        return head;
    }
}
