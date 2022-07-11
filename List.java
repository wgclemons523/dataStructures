import java.util.LinkedList;

public class List {
	Node head; //head of list
	
	class Node  {
		int data;
		Node next;
		
		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public void deleteNode(int key) {
		Node temp = head, prev = null;
		//linked list is empty
		if(temp == null) {
			return;
		}
		
		if(temp != null && temp.data == key) {
			temp = temp.next;
			return;
		}
		
		while(temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		//key not found in list
		if(temp == null) {
			return;
		}
		//unlink the node from list
		prev.next = temp.next;
	}
	
	public void push(int newData) {
		//Allocate the Node & Put in the Data
		Node newNode = new Node(newData);
		//Make next of new Node as head
		newNode.next = head;
		//Move the head to point to new Node
		head = newNode;
	}
	
	public void insertAfter(Node prevNode, int newData) {
		//Empty LinkedList
		if(prevNode == null) {
			return;
		}
		//Allocate the Node & Put in the Data
		Node newNode = new Node(newData);
		//Make next of new node point to next of prevNode
		newNode.next = prevNode.next;
		//Make next of prevNode point to newNode
		prevNode.next = newNode;
	}
	
	public void append(int newData) {
		Node end = new Node(newData);
		
		if(head == null) {
			head = new Node(newData);
			return;
		}
		end.next = null;
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = end;
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ll = new List();
		
		ll.append(6);
		ll.push(7);
		ll.push(1);
		ll.append(4);
		ll.insertAfter(ll.head.next, 8);
		ll.deleteNode(4);
		
		Node tnode = ll.head;
		while(tnode != null) {
			System.out.println(tnode.data + "");
			tnode = tnode.next;
		}
	}

}
