package stacksAndQueues;

public class Queue extends Stack {

	private Node front;
	private Node back;

	public boolean isEmpty() {
		return front == null && back == null;
	}

	public void enqueue(String input) {
		Node newNode = new Node(input);

		if (isEmpty()) {

			this.front = newNode;
			this.back = newNode;
		}

		else {
			this.back.setNext(newNode);
			this.back = newNode;
		}
	}

	public void print() {

		if (isEmpty()) {
			System.out.println("Queue is Empty.");
		}

		else {
			Node temp = this.front;

			while (temp != null) {
				System.out.println(temp.getData());
				temp = temp.getNext();
			}
			// System.out.println(this.back.getData());
			System.out.println("");
		}
	}

}
