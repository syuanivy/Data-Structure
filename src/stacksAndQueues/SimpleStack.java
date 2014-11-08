package stacksAndQueues;
import linkedLists.MyNode;


public class SimpleStack {

		MyNode top;
		int size;
		
		public SimpleStack(){
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
		
		boolean isEmpty(){
			if (top==null){
				return true;
			}else{
				return false;
			}
		}
		// a static method to sort the stack in ascending order, top being the biggest
		public SimpleStack sortStack(){
			SimpleStack buffer = new SimpleStack();// use a buffer stack hold the sorted elements
			while(this.top!=null){// before all elements are in the sorted buffer stack
				if(buffer.top==null || this.top.data>buffer.top.data){
					buffer.push(this.pop());
				}else{
					int temp = this.pop();
					while(buffer.top!=null && temp<buffer.top.data ){
						this.push(buffer.pop());
					}
					buffer.push(temp);
				}
			}
			return buffer;
		}

}
