/**
 * @author Delaware Technical Community College
 * A simple implementation of the Queue ADT using a nested Node class and a doubly linked list
 * @param <T>
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
		if (front==null){ System.out.println("Underflow!");}
		Node n = front.getNext();
		if(n != null){ n.setPrev(null);}
		if(n == null) back = null;
		front = n;
		return null;
	}

	public T getFront() {
		// TODO Implement getFront
		
		return null;
	}

	public boolean isEmpty() {
		// TODO Implement isEmpty
		
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Implement toString method
		
		return "";
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
