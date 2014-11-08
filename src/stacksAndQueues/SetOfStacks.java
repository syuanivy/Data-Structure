package stacksAndQueues;

import java.util.*;

import linkedLists.MyNode;
//Use dynamically resizing array to implement a set of stacks with each stack having a capacity
public class SetOfStacks {
	int capacity=3;
	ArrayList<StackMin> sets = new ArrayList<StackMin>();
	int pointer;
	StackMin current ;// for convenience, it is actually redundant with pointer
	
	public SetOfStacks(){
		pointer=0;
		current = new StackMin();
		sets.add(current);
	}

	
	public int getTop()throws Exception{
		current=sets.get(pointer);
		if (current.top==null){
			throw new Exception("Empty SetOfStacks");
		}
		return current.top.data;
	}
	
	public void pushToSet (int d){
		current=sets.get(pointer);
		if (current.size < capacity){
			current.push(d);
		}else{
			pointer+=1;
			StackMin newCurrent = new StackMin();
			newCurrent.push(d);
			//newCurrent.top.next=current.top;
			current = newCurrent;
			sets.add(current);
		}
	}
	
	
	public int popOut() throws Exception{
		current=sets.get(pointer);
		if (current.size==0){
			throw new Exception("Empty SetOfStacks!");
		}
		if(current.size>1){
           return current.pop();			
		}else if(current.size ==1){
			int oldTop=current.top.data;
			pointer-=1;
			if(pointer==-1){
				current.top = null;
				pointer=0;//reset the sets
				return oldTop;
			}else{
				current = sets.get(pointer);
				return oldTop;	
			}
			
		}
		return -1000000;
	}
	
	public int popAt(int d) throws Exception{
		if (pointer<d){
			throw new Exception("Out of Index!");
		}
		if (pointer==d){
			return this.popOut();
		}
		if(pointer>d){
			int off = sets.get(d).pop();
			this.shiftToGap(d);// gap at the top of d th stack
			return off;
		}
		return -1000000;
	}	
	
	public void shiftToGap(int d) throws Exception{
		for (int i=d+1; i<=pointer; i++){
			int temp = this.popBottom(i);
			this.sets.get(i-1).push(temp);
		}
	}
	
	public int popBottom(int d) throws Exception{
		MyNode current = this.sets.get(d).top;
		if (current.next == null){// only one element in the stack
			pointer-=1;
			return sets.get(d).pop();
		}
		while (current.next.next!= null){
			current=current.next;
		}
		int bottom = current.next.data;
		current.next=null;
		this.sets.get(d).size-=1;
		return bottom;
	}

}
