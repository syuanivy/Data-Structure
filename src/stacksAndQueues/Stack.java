package stacksAndQueues;
import linkedLists.MyLinkedList;
import linkedLists.MyLinkedList.LinkedListNode;


//implement a stack using linkedlist

public class Stack<E> extends MyLinkedList<E>{
	MyLinkedList.LinkedListNode<E> top;
	Integer size;
	
	public Stack(){
		top=null;
		size=0;
	}

	
	E pop(){
		if (top==null) return null;
		E off=top.data;
		top=top.next;
		size-=1;
		return off; 
	}
	//return the node
	MyLinkedList.LinkedListNode<E> popNode(){
		if (top==null) return null;
		MyLinkedList.LinkedListNode<E> off=top;
		top=top.next;
		size-=1;
		return off; 
	}
	
	void push(E x){
		MyLinkedList.LinkedListNode<E> new_top= new MyLinkedList.LinkedListNode<E>(x);
		new_top.next=top;
		top=new_top;
		size+=1;
	}
	
	E peek(){
		return top.data;
	}
	
	boolean isEmpty(){
		if(top==null) return true;
		else return false;
	}
	

}
