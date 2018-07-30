package com.struct.interview_question.list_interview_question.listsort;

public class QuickSort {
    public ListNode quickSort(ListNode begin, ListNode end) {
        if (begin == null || begin == end) {
            return begin;
        }
        //找到基准点
        ListNode index = divide(begin, end);
        //对基准点前元素进行操作
        quickSort(begin, index);
        //对基准点后元素进行操作
        quickSort(index.nextNode, end);
        return begin;
    }

    public static ListNode divide(ListNode begin, ListNode end) {
        //没有元素或者只有一个元素
        if (begin == null || begin == end) {
            return begin;
        }
        // 以头结点为基准对元素进行划分
        int value = begin.data;
        ListNode index = begin;
        ListNode cur = begin.nextNode;
        while(cur!=null){
            if(cur.data<value){
                index = index.nextNode;
                //交换结点的值
                int temp = cur.data;
                cur.data = index.data;
                index.data = temp;
            }
            cur = cur.nextNode;
        }
        //交换基准值和index结点的值
        begin.data = index.data;
        index.data = value;
        //返回基准值
        return index;
    }
}
