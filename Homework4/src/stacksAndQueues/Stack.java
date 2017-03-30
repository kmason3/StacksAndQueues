package stacksAndQueues;

public class Stack {
	// Variables
	private Node top = null;

	/**
	 * Tests if stack is empty
	 * 
	 * @return true if stack is empty
	 */
	public boolean isEmpty() {
		return this.top == null;
	}

	/**
	 * Looks at top node
	 * 
	 * @return top node
	 */
	public Node peek() {
		return this.top;
	}

	/**
	 * adds to stack
	 * 
	 * @param input
	 */
	public void push(String input) {
		Node newNode = new Node(input);

		
			newNode.setNext(this.top);
			this.top = newNode;
		
	}
	/**
	 * Shows and removes top node
	 * @return top node
	 */
	public Node pop() {

		if (isEmpty()) {
			return null;
		}

		else {
			Node temp = top;
			this.top = top.getNext();
			return temp;
		}

	}
	/**
	 * Prints stack
	 */
	public void print() {

		if (isEmpty()) {
			System.out.println("Stack is Empty.");
		}

		else {
			Node temp = this.top;

			while (temp != null) {
				temp.print();
				temp = temp.getNext();
			}
			System.out.println("");
		}
	}

}
