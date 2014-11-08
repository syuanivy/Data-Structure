package stacksAndQueues;
import linkedLists.MyNode;

//modify Stack to have a min function that also operates on O(1) time
public class StackMin {
	MyNode top;
	int size;
	MyNode min;// use a separate linkedlist to record the min at each state of the data stack
	
	public StackMin(){
		top=null;
		size=0;
		min=null;
	}

	public void push (int d){
		MyNode newTop = new MyNode(d);
		newTop.next = top;
		top=newTop;
		size++;
		
		MyNode newMin = new MyNode(d);
		if(min==null){
			min=newMin;
			return;
		}else if (newMin.data >= min.data){// min remains the same
				newMin.data = min.data;//create a new node with the same min value;	
		}
		newMin.next=min;
		min=newMin;
		
	}
	
	public int pop() throws Exception{
		if (size==0){
			throw new Exception("Empty Stack!");
		}
		int oldTop= top.data;
		top=top.next;
		size--;
		min=min.next;
		return oldTop;
	}
	
	public int peek()throws Exception{
		if (size==0){
			throw new Exception("Empty Stack!");
		}
		return top.data;
	}

}
