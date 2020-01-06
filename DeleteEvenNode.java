package com.java.linkedlist;

class DeleteNode
{
	public void deleteValues(Node head)
	{
		
		while(head != null)
		{
			
			Node next=null,current=head;
			
			if(head.data%2==0)
			{
				next = current.next;
				current = null;
				head = next;								
			}
	
			else
			{
				head = head.next;
			}
			
			
		}

		while (head != null)
		{
			System.out.print(head.data + " ");
			head = head.next;
		}
	
	}
}

public class DeleteEvenNode {
	public static void main(String args[]) {
		
		DeleteNode obj = new DeleteNode();
		
		Node head = new Node(3);
		
		head.next = new Node(4);
		
		head.next.next = new Node(5);
		
		obj.deleteValues(head);
		
		System.out.println();
	}
}
