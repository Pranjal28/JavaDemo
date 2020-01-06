package com.java.tree;

class Node
{
	Node root;
	Node left, right;
	public int data;
	
	public Node(int x)
	{
		data=x;
		left=null;
		right=null;
	}
}

class BinaryTree
{
	public void calculateNodeValue(Node root)
	{
		
      if(root == null)
	  return;
		
      calculateNodeValue(root.left);
      
      System.out.println(root.data + " ");
      
      calculateNodeValue(root.right);
		
	}
}

public class BinaryTreeDemo1 {
	
	public static void main(String args[]) {
		
		BinaryTree bt = new BinaryTree();
		
		Node root = new Node(3);
		
		root.left = new Node(4);
		
		root.right = new Node(5);
		
		bt.calculateNodeValue(root);
		
		
		System.out.println();
	}
}
