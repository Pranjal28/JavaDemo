package com.java.datastructure;

import com.java.datastructure.TreeExample.Node;

class TreeExample
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
	
	public void printMirror(TreeExample.Node root)
	{
		printMirror(root.left);
		printMirror(root.right);
		
		int temp = root.left.data;
		root.left.data = root.right.data;
		root.right.data = temp;
	}
}

public class MirrorTree {
	
	public static void main (String args[])
	{
        TreeExample treeExample = new TreeExample();
		
		treeExample.root = new TreeExample.Node(4);
		
		treeExample.root.left = new TreeExample.Node(2);		
		treeExample.root.left.left = new TreeExample.Node(1);
		treeExample.root.left.right = new TreeExample.Node(3);
		
		treeExample.root.right = new TreeExample.Node(6);
		treeExample.root.right.left = new TreeExample.Node(5);
		treeExample.root.right.right = new TreeExample.Node(7);

		treeExample.printMirror(treeExample.root);
		
	}

}
