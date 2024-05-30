package com.AlgorithmsJava;

public class ReverseALinkedList {

    //1->2->3
    //3<-2<-1

    public ListNode node(ListNode head) {

        if(head == null) return null;

        ListNode current = head;

        ListNode previous = null;
        while(current != null) {
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;

        }

        return previous;
    }


    public class ListNode{
        int val;
        ListNode next;
        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }


    }


}
