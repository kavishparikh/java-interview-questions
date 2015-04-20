import java.io.*;
import java.util.*;

public class BinarySearchTree{

	public static void main(String args[]){

		System.out.println("Implementing Binary Search Tree");
		Tree thetree = new Tree();
		thetree.insert(50, 5);
		thetree.insert(60, 7);
		thetree.insert(25, 5);
		thetree.insert(80, 2);

		Node min = thetree.minimum();
		System.out.println(Node.displayTreeNode());
		//System.out.println(Tree.maximum());

		Node found = thetree.find(80);

	}
}


public class Node{
	int idata;
	double ddata;
	Node leftchild;
	Node rightchild;

	public void displayTreeNode(){
		System.out.println("{ "+idata+" , "+ddata+" }");
	}	
}


public class Tree{

	private Node root;

	public Tree(){
		root = null;
	}

	public void insert(int id, double dd) {
		Node newNode = new Node();
		newNode.idata = id;
		newNode.ddata = dd;
		if(root == null)
			root = newNode;
		else {
			Node current = root;
			Node parent;
			while(true) {
				parent = current;
				if(id < current.idata) {
					current = current.leftchild;
					if(current == null) {
						parent.leftchild = newNode;
						return;
					}
				} else {
					current = current.rightchild;
					if(current == null) {
						parent.rightchild = newNode;
						return;
					}
				}
			}
		}
	}

	public Node find(int key) {
		Node current = root;
		while(current.idata != key) {
			if(key < current.idata)
				current = current.leftchild;
			else
				current = current.rightchild;
			if(current == null)
				return null
		}
		return current;
	}

	public void traverseInOrder(Node localroot){
		if(localroot != null){
			traverseInOrder(localroot.leftchild);
			System.out.println(localroot.idata+" ");
			traverseInOrder(localroot.rightchild);
		}
	}

	public void traversePreOrder(Node localroot){
		if(localroot != null){
			System.out.println(localroot.idata+" ");
			traversePreOrder(localroot.leftchild);
			traversePreOrder(localroot.rightchild);
		}
	}

	public void traversePostOrder(Node localroot){
		if(localroot != null){
			traversePreOrder(localroot.leftchild);
			traversePreOrder(localroot.rightchild);
			System.out.println(localroot.idata+" ");
		}
	}

	public void minimum() {
		Node current, last;
		current = root;
		while(current != null) {
			last = current;
			current = current.leftchild;
		}
		return last;
	}

	public oid maximum() {
		Node current, last;
		current = root;
		while(current != null) {
			last = current;
			current = current.rightchild;
		}
		return last;
	}

	public void delete(int key){
		Node current = root;
		Node parent;
		boolean isLeftChild = true;
		while(current.idata != key){
			parent = current;
			if(key < current.idata){
				isLeftChild = true;
				current = current.leftchild;
			}
			else{
				isLeftChild = false;
				current = current.rightchild;
			}
			if(current == null)
				return false;
		}
		//Delete for condition when the node has no childrens
		if(current.leftchild == null && current.rightchild.null){
			if(current == root)
				root = null;
			else if(isLeftChild)
				parent.leftchild = null;
			else
				parent.rightchild = null;
		}
		//delete for condition when a node has only 1 children
		else if(current.rightchild == null){
			if(current == root)
				root = current.leftchild;
			else if(isLeftChild)
				parent.leftchild = current.leftchild;
			else
				parent.rightchild = current.leftchild;
		}
		else if(current.leftchild == null){
			if(current == root)
				root = current.rightchild;
			else if(isLeftChild)
				parent.leftchild = current.rightchild;
			else 
				parent.rightchild = current.rightchild;
		}
		// delete for condition when node has both the childrens
		// the trick is to find the next highest number after the delete node
		// ie. find the minimum number delNode.rightChild sub tree
		else {
			Node successor = getSuccessor(current);
			if(current == null)
				root = successor;
			else if(isLeftChild)
				parent.leftchild = successor;
			else
				parent.rightchild = successor;
			successor.leftchild = current.leftchild;
		}
	}

	public Node getSuccessor(Node delNode) {
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.rightchild;
		while(current != null) {
			successorParent = successor;
			successor = current;
			current = current.leftchild;
		}
		if(current != delNode.rightchild) {
			successorParent.leftchild = successor.rightchild;
			successor.rightchild = delNode.rightchild;
		}
		return successor;
	}


}