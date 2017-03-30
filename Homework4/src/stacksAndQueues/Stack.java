package stacksAndQueues;

public class Stack {
	
	private Node top = null;
	
	public boolean isEmpty(){
		return this.top == null;
	}
	
	public Node peek(){
		return this.top;
	}
	
	public void push(String input){
		Node newNode = new Node(input);
		
		newNode.setNext(this.top);
		this.top = newNode;
		
	}
	
	public Node pop(){
		
		if(isEmpty()){
			return null;
		}
		
		else{
			Node temp = top;
			this.top = top.getNext();
			return temp;
		}
		
	}
	
	public void print(){
		
		if(isEmpty()){
			System.out.println("Stack is Empty.");
		}
		
		else{
			Node temp = this.top;
			
			while(temp != null){
				System.out.println(temp.getData());
				temp = temp.getNext();
			}
			System.out.println("");
		}
	}

}
