
/*
 *   Nathan Nasteff
 *   Delaware Tech
 *   Spring 2019
 */


public class LinkedQueue<T> implements QueueInterface<T> {
	Node front;
	Node back;
	
	public LinkedQueue() {
		front = null;
		back = null;
	}
	
	public void enqueue(T obj) {
		if (isEmpty()) {
			Node node = new Node(obj, null, null);
			front = node;
			back = node;
		} else {
			Node node = new Node(obj, null, back);
			back.setNext(node);
			back = node;
		}
	}

	public T dequeue() {
		// TODO Implement dequeue
		// Now we have to be careful to make sure we think of the various scenarios
		// and update the prev and next links accordingly
		T t = front.data;
		if (front.getNext() != null) {
			front = front.next;
			return t;
		}
		else {
			System.out.println("No elements found!");
			back = null;
			front.setData(null);
			return null;
		}

	}

	public T getFront() {
		// TODO Implement getFront
		if (front != null){ return front.data; }
		else return null;

	}

	public boolean isEmpty() {
		// TODO Implement isEmpty
		return front == null;
	}
	
	@Override
	public String toString() {
		String s = "";
		Node n = front;
		while(n != null) {
			if (n.data != null){
				s += n.data + "\n";
				n = n.next;
			}
			else{
				s += "Empty Container\n";
				n = n.next;
			}
		}
		return s;
	}
	
	// Nested class Node
	// For queues, it is helpful to implement this as a doubly linked list
	// Therefore, we keep track of both next and previous nodes
	private class Node {
		T data;
		Node next;
		Node prev;
		
		// Constructor for inner class Node
		Node(T data, Node next, Node prev) {
			this.data = data;
			this.next = next;
			this.prev = prev;
		}
		
		// Setters & Getters for inner class Node
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public Node getPrev() {
			return prev;
		}
		public void setPrev(Node prev) {
			this.prev = prev;
		}
	}

}
