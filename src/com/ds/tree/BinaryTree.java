package com.ds.tree;

import java.util.Scanner;

public class BinaryTree {
	static Scanner sc = null;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Node node=binary_Tree();
		System.out.println(node.left.data);
		
		inOrder(node);
		preOrder(node);
		postOrder(node);
	}

	static Node binary_Tree() {
		Node root = null;
		int data = sc.nextInt();
		System.out.println("Enter Data:");
		if (data == -1)
			return null;

		root = new Node(data);

		System.out.println("Enter left for " + data);
		root.left = binary_Tree();

		System.out.println("Enter right for " + data);
		root.right = binary_Tree();

		return root;
	}
	
	static void inOrder(Node root){
		if(root==null) return;
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	static void preOrder(Node root){
		if(root==null) return;
		
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	static void postOrder(Node root){
		if(root==null)return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
		
	}

}

class Node {
	Node left, right;
	int data;

	public Node(int data) {
		this.data = data;
	}

}
