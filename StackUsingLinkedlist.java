
public class StackUsingLinkedlist {
	private class Node {
		int data;
		Node link; //reference variable Node Type
	}
	
	Node top;
	//Constructor
	StackUsingLinkedlist() {
		this.top = null;
	}
	
	public void push(int x) {//Insert at beginning
		Node temp = new Node();
		//check if stack is full Then inserting an element would lead to stack overflow
		if(temp == null) {
			System.out.print("\nHeap Overflow");
			return;
		}
		//initialize data into temp data field
		temp.data = x;
		//put top reference into temp link
		temp.link = top;
		//update top reference
		top = temp;
	}
	
	//Utility function to check if the stack is empty or not
	public boolean isEmpty() {
		return top == null;
	}
	
	public void pop() {//Remove at the beginning
		//check for stack underflow
		if(top == null) {
			System.out.print("\nStack Unverflow");
			return;
		}
		//update the top pointer to point to the next node
		top = (top).link;
	}
	//Utility function to return top element in a stack
	public int peek() {
		//Check for empty stack
		if(!isEmpty()) {
			return top.data;
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingLinkedlist obj = new StackUsingLinkedlist();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		
		if(obj.top == null) {
			System.out.println("Stack Underflow");
			return;
		} else {
			Node temp = obj.top;
			while(temp != null) {
				System.out.printf("%d->", temp.data);
				temp = temp.link;
			}
		}
		System.out.printf("\nTop element is %d\n", obj.peek());
		obj.pop();
        System.out.printf("\nTop element is %d\n", obj.peek());
	}

}
