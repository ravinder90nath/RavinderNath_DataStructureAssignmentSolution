package com.greateLearninglab3;

import java.util.ArrayList;
import java.util.List;

public class longestpathFind {
	
	static class Node{
		Node leftNode;
		Node rightNode;
		int nodeData;
	}
	
	public static void inOrder(Node node) {
		if(node == null) {
			return;
		}
		inOrder(node.leftNode);
		System.out.print(node.nodeData + " ");
		inOrder(node.rightNode);
	}
	
	static List<Node> findLongestPath (Node root){
		if (root == null) {
			return new ArrayList<>();
		}
		
		List<Node> leftNodeList = findLongestPath(root.leftNode);
		List<Node> rightNodeList = findLongestPath(root.rightNode);
		if(rightNodeList.size() > leftNodeList.size()) {
			rightNodeList.add(root);
		}else {
			leftNodeList.add(root);
		}
		return (rightNodeList.size() > leftNodeList.size()) ? rightNodeList : leftNodeList;
	}


	private static Node newNode(int data) {
		// TODO Auto-generated method stub
		
		Node temp = new Node();
		temp.nodeData = data;
		temp.rightNode = null;
		temp.leftNode = null;
		return temp;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node root = newNode(100);
		root.leftNode = newNode(20);
		root.rightNode = newNode(130);
		root.leftNode.leftNode = newNode(10);
		root.leftNode.rightNode = newNode(50);
		root.rightNode.leftNode = newNode(110);
		root.rightNode.rightNode = newNode(140);
		root.leftNode.leftNode.leftNode = newNode(5);
		
		System.out.println("InOrder Traversal : ");
		inOrder(root);

		List<Node> LongestPath =  findLongestPath(root);		
		System.out.println("\n Longest Path from Left is ");
		for (Node node: LongestPath) {
			System.out.print(node.nodeData + " ");
		}
	}

}
