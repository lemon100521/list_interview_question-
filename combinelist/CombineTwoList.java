package com.struct.interview_question.list_interview_question.combinelist;

import com.struct.interview_question.list_interview_question.listsort.ListNode;

/**
*@Description: 合并两个有序链表合并后依然有序
*@Author： dyy
*/
public class CombineTwoList {
    public ListNode combineList(ListNode head1,ListNode head2){
        //链表1为空链表
        if(head1==null){
            return head2;
        }
        //链表2为空链表
        if(head2==null){
            return head1;
        }
        //两个链表均为空链表
        if (head1==null&&head2==null){
            return null;
        }
        //定义新的头结点
        ListNode head =null;
        //以升序排序为准
        //若链表1的头结点小于链表2的头结点，则以链表1的头结点为新的头节点
        if(head1.data<=head2.data){
            head = head1;
            //对节点进行后移操作，以便选出小的节点
            head1 = head1.nextNode;
        }else{
            //若链表1的头结点大于链表2的头结点，则以链表2的头结点为新的头节点
            head = head2;
            head2 = head2.nextNode;
        }
        //临时节点，用来保存下一个小节点的指向
        ListNode temp = head;
        //对头结点的后续节点进行大小的比较，找出第二小节点，直到有一个链表为空
        while (head1!=null&&head2!=null){
            if(head1.data<=head2.data){
               temp.nextNode = head1;
               head1 = head1.nextNode;
            }else{
                temp.nextNode = head2;
                head2 = head2.nextNode;
            }
            temp = temp.nextNode;
        }
        //当链表1为空时，直接拼接链表2
        if(head1 == null){
            temp.nextNode = head2;
        }
        //当链表2为空时，直接拼接链表1
        if(head2 == null){
            temp.nextNode = head1;
        }
        return head;

    }
}
