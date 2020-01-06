package com.java.datastructure;

class LinkedList
{
	Node head;

	static class Node
	{
		
		public int d;
		public Node next;
		
		Node (int data)
		{
			d = data;
			next = null;
		}
	}
	
	public static boolean detectLoop(LinkedList obj)
	{
	   Node p = obj.head;
	   Node q = obj.head;
	    
	    while (p != null && q != null)
	    {
	    	p=p.next;
	    	q=q.next.next;
	    	
	    	if(p==q)
	    	{
	    		return true;
	    	}
	    }
		
	     return false;		
	}
	
}
public class LinkedListDemo {
		
	public static void main (String args[])
	{
		
		LinkedList ll = new LinkedList();
		
		ll.head = new LinkedList.Node(1);
		ll.head.next = new LinkedList.Node(2);
		ll.head.next.next = new LinkedList.Node(3);
		ll.head.next.next.next = new LinkedList.Node(4);
	    
		ll.head.next.next.next = ll.head;
		
		System.out.println(ll);
		
		boolean b = LinkedList.detectLoop(ll);
		System.out.println(b);
				
	}

}
