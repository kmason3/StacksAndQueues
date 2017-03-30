package stacksAndQueues;

public class Main {
	
	public static void transStackToQueue(Stack from, Queue to){
		while(!from.isEmpty()){
			String temp = from.pop().getData();
			to.enqueue(temp);
		}
	}
	
	public static void main(String[]args){
		
			
		Stack test = new Stack();
		
		test.push("a");
		test.push("b");
		test.push("c");
		test.push("d");
		test.push("e");
		
		test.print();
		
//		test.pop();
		
//		test.print();
//		test.peek().print();
//		System.out.println("");
		
		Queue test1 = new Queue();
		
//		test1.enqueue("a");
//		test1.enqueue("b");
//		test1.enqueue("c");
//		test1.enqueue("d");
//		test1.print();
//		test1.dequeue();
//		test1.print();
		
		transStackToQueue(test, test1);
		test1.print();
		
	}

}
