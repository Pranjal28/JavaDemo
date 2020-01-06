package com.java.linkedlist;

class ReverseList
{
	public void reverseList(Node head)
	{
		Node prev = null, next = null;
		
		Node current = head;
		
		while(current != null)
		{
			next = current.next;
			
			current.next = prev;
			
			prev = current;
			
			current = next; 
		}
		
		head = prev;
		
		while (head != null)
		{
			System.out.print(head.data + " ");
			head = head.next;
		}
		
		
	}
}

public class ReverseDemo {
	public static void main(String args[]) {
		
		ReverseList obj = new ReverseList();
		
		Node head = new Node(3);
		
		head.next = new Node(4);
		
		head.next.next = new Node(2);
		
		obj.reverseList(head);
		
		System.out.println();
	}
}
