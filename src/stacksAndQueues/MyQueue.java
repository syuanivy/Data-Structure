package stacksAndQueues;
import linkedLists.MyNode;



//Use two stacks to implement a queue
public class MyQueue {
	private Stack tops;
	private Stack bottoms;
	int length;
	
	private class Stack{
		MyNode top;
		int size;
		
		private Stack(){
			top=null;
			size=0;
		}
		void push(int d){
			MyNode newTop = new MyNode(d);
			newTop.next=top;
			top=newTop;
			size++;
		}
		
		int pop(){
			int off = top.data;
			top =top.next;
			size--;
			return off;
		}
		
		void peek(){
			System.out.println(top.data);
		}

	}
	
	public MyQueue(){
		tops= new Stack();
		bottoms = new Stack();
		length=0;
	}

	void enqueue(int d){
		if(bottoms.top==null && tops.top==null){
			tops.top = new MyNode(d);
			length++;
		}else{// reverse bottoms
			while (bottoms.top!=null){
				tops.push(bottoms.pop());
			}
			tops.push(d);
			length++;
		}
	}

	int dequeue() throws Exception{
		if (tops.top==null && bottoms.top==null) {
			throw new Exception("Empty MyQueue!");
		}else{
			//reverse tops into bottoms;
			while(tops.top!=null){
				bottoms.push(tops.pop());
			}
			// pop the bottom out
			length--;
			return bottoms.pop();	
		}
		
	}
	
	void peek(){
		if(length==0){
			System.out.println("Empty MyQueue!");
		}else{
			if(tops.top==null){
				bottoms.peek();
			} else{// reverse to bottoms
				while (tops.top!=null){
					bottoms.push(tops.pop());
				}
				bottoms.peek();
			}
			
			
			
		}
		
	}
}
