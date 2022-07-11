
public class Queue {
	
	class QNode {
		int key;
		QNode next;
		
		public QNode(int k) {
			key = k;
			this.next = null;
		}
	}
	
	QNode front, rear;
	public Queue() {
		this.front = this.rear = null;
	}
	
	//Method to add an key to the queue
	void enqueue(int key) {
		//Create a new LL Node
		QNode temp = new QNode(key);
		//If Queue is empty then new node is front and rear both
		if(this.rear == null) {
			this.front = this.rear = temp;
			return;
		}
		// Add the new node at the end of the queue and change the rear
		this.rear.next = temp;
		this.rear = temp;
	}
	//Method to remove a key from the queue
	void dequeue() {
		//If queue is empty return null
		if(this.front == null) {
			return;
		}
		//Store previous front and move front one node ahead
		QNode temp = this.front;
		this.front = this.front.next;
		//If front becomes null then change rear also as null
		if(this.front == null) {
			this.rear = null;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.dequeue();
		q.dequeue();
		System.out.println("Queue Front : " + q.front.key);
		System.out.println("Queue Rear : " + q.rear.key);
	}

}
