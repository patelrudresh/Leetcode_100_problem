package Queue;

import java.util.Arrays;

public class QueueWithLinkedList {
		 static class Node{
			int data;
			Node next;
			Node(int data){
				this.data=data;
				next=null;
			}
		}
		
		static Node head=null;
		static Node tail=null;
		
		public static boolean isemplty() {
			return head==null && tail==null;
		}
		public static void add(int data) {
		 Node newnode=new Node(data);
		 if(tail==null) {
			 tail=head=newnode;
			 return;
		 }
		 tail.next=newnode;
		 tail=newnode;
		}
		
		public static int remove() {
			if(isemplty()) {
				return -1;
			}
			int front=head.data;
			if(head==tail) {
				tail=null;
			}
			head=head.next;
			return front;
		}
	
		public static int peek() {
			if(isemplty()) {
				return -1;
			}
			return head.data;
		}
		public static void main(String [] args) {
			QueueWithLinkedList q=new QueueWithLinkedList();
			q.add(1);
			q.add(2);
			q.add(3);
			while (!isemplty()) {
				System.out.println(q.peek());
				remove();
			}
		}
}
