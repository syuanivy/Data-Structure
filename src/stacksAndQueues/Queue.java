package stacksAndQueues;
import linkedLists.MyLinkedList;
import linkedLists.MyLinkedList.LinkedListNode;

//implement queue with linkedList
public class Queue<E> extends MyLinkedList<E>{
	public MyLinkedList.LinkedListNode<E> first;//first in the list
	public MyLinkedList.LinkedListNode<E> last;//last in the list
	public Integer size;
	
	public Queue(){
		first=null;
		last=null;
		size=0;
	}
	//add items to the last
	public void enqueue(E item){
		if(first==null){
			first= new MyLinkedList.LinkedListNode<E>(item);
			last=first;
			size++;
		}else{
			MyLinkedList.LinkedListNode<E> n=first;
			while(n.next!=null){
				n=n.next;
			}
			n.next=new MyLinkedList.LinkedListNode<E>(item);
		}
		size+=1;
	}
	
	public E dequeue(){
		if (first==null) return null;
		MyLinkedList.LinkedListNode<E> off= new MyLinkedList.LinkedListNode<E> (first.data);
		first=first.next;
		size-=1;
		return off.data; 
	}
	
	
	
}
