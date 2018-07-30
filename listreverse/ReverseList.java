package com.struct.interview_question.list_interview_question.listreverse;

import com.struct.interview_question.list_interview_question.ListNode;

import java.util.Stack;

public class ReverseList {
    //使用栈来操作
    public static void printListReverseByStack(ListNode headNode){
        Stack<ListNode> stack = new Stack<ListNode>();
        //将表中的数据入栈
        while (headNode!=null){
            stack.push(headNode);
            headNode = headNode.nextNode;
        }

        //栈非空则弹出栈顶元素
        while (!stack.isEmpty()){
            System.out.print(stack.pop().data+" ");
        }
    }

    //方法2：采用递归方式
    public void printListReverseByRecursive(ListNode headNode){
        if(headNode.nextNode!=null){
            printListReverseByRecursive(headNode.nextNode);
        }
        System.out.print(headNode.data+" ");
    }
}
