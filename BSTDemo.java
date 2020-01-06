package com.java.datastructure;

class Tree
{
	Node root;
	
	static class Node
	{
		public Node left,right;
		public int data;
		
		Node(int d)
		{
			data=d;
			left=null;
			right=null;
		}
	}
	
	public boolean isBst(Tree.Node root, int min, int max)
	{
		if(root == null)
			return true;
		
		if(root.data<min || root.data>max)
			return false;
		
		return (isBst(root.left, min, root.data -1)&&isBst(root.right, root.data + 1, max));
	}
	
	
}

public class BSTDemo {
	
	public static void main (String args[])
	{
		Tree tree = new Tree();
		
		tree.root = new Tree.Node(4);
		
		tree.root.left = new Tree.Node(2);		
		tree.root.left.left = new Tree.Node(1);
		tree.root.left.right = new Tree.Node(3);
		
		tree.root.right = new Tree.Node(6);
		tree.root.right.left = new Tree.Node(5);
		tree.root.right.right = new Tree.Node(7);
		
		boolean bstValue = tree.isBst(tree.root,1,7);
		
		System.out.println(bstValue);
	}

}
