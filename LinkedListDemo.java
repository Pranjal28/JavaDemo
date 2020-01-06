
package com.java.linkedlist;

class LinkedList
{
	
	public int calculateSum(Node head)
	{
		int sum = 0;
				
		while(head != null)
		{
			sum = sum + head.data;
			
			head = head.next;
		}
		
		return sum;
		
	}
}
class Node
{
	Node next;
	int data;
	
	public Node(int x)
	{
		data = x;
		next = null;
	}
}

public class LinkedListDemo {
	
	
	public static void main(String args[]) {
		
		LinkedList obj = new LinkedList();
		
		Node head = new Node(2);
		
		head.next = new Node(3);
		
		head.next.next = new Node(4);
		
		head.next.next.next = new Node(5);
		
		int sum = obj.calculateSum(head);
		
		System.out.println(sum);
	}
}
