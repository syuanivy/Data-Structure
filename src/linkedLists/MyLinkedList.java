package linkedLists;
import java.util.*;
import java.lang.Integer;
public class MyLinkedList<E>{// Practice generic type<E>
	//inner helper class Node
	 public static class LinkedListNode<E>{
		 public E data;
		 public LinkedListNode<E> next;
		
		 public LinkedListNode(){//null Node
			 this.data=null;
			 this.next=null;
		 }
		 public LinkedListNode(E val){//NO <E> after the constructor!!!
			this.data=val;
			this.next=null;
		}			
		 
		 public LinkedListNode(E val, LinkedListNode<E> next){// with next node known
			 this.data=val;
			 this.next=next;
		 }
		
    }
	
	//declare class variables
	public  LinkedListNode<E> head;
    //private LinkedListNode<E> tail;
    // private int size;
	
	//constructor of the list
	public MyLinkedList(){//create an empty list
		head=null;
		//tail=new LinkedListNode<E>();
		//head.next=tail;
		//size=0;
	}
	public MyLinkedList(E ob){// create a list with a head node, whose data is null;
		head= new LinkedListNode<E> (ob, null);
	}
	public MyLinkedList (LinkedListNode<E> node){
		head=node;
	}
	
	//class methods	
	//Print the list
	public void printMyLinkedList(){
		LinkedListNode<E> current = head;
		
		while(current!=null){
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	//Add to head
	public void addFirst(E ob){
		this.head = new LinkedListNode<E>(ob, head);
	}
	//Add to tail
	public void addLast(E ob){
		if (head==null){
			this.addFirst(ob);//empty list
			return;
		} 
		LinkedListNode<E> current = head;
		while (current.next!=null){
			current=current.next;
		}//current is the tail now
		current.next = new LinkedListNode<E>(ob);
	}
	// a class method of arrayToList
	public static<E> MyLinkedList<E> array2List(E[] arrayData){
		MyLinkedList<E> testlist = new MyLinkedList<E>();
		for(int i=0; i<arrayData.length; i++){
			testlist.addLast(arrayData[i]);
		}
        return testlist;
	}
	
	
	
	//an object method to create a list with an array of data// needs a list to start with
	public MyLinkedList<E> arrayToList(E[] arrayData){
		this.destroy();
		for(int i=0; i<arrayData.length; i++){
			this.addLast(arrayData[i]);
		}
		return this;
	}	
	//find an object in a list, return its first appearance position, or return null if not found
	public LinkedListNode<E> findFirst(E ob){
		int index=0;
		LinkedListNode<E> current = head;
		while(current!=null){
			if (current.data==ob)return current; 
			current=current.next;
			index+=1;
		}
		return null;
	}
	//to insert an object before an element, assuming it appears only once in the list
	public void insertBefore(E key, E toInsert ){
		if(head.data==key) {
			this.addFirst(toInsert);
			return;
		}
		LinkedListNode<E> current = head;
		while (current.next!=null){
			if (current.next.data==key){
			    current.next = new LinkedListNode<E>(toInsert, current.next);
			    return;
			}
			current=current.next;
		}
	}
	//to insert an object before an element, assuming it appears only once
	public void insertAfter(E key, E toInsert){
		LinkedListNode<E> current = head;
		while(current!=null){
			if(current.data==key){
				current.next=new LinkedListNode<E>(toInsert,current.next);
				return;
			}
			current=current.next;
		}
	}
	// to delete an object
	public void delete(E key){
		if(head.data==key){
			head=head.next;
			return;
		} 
		LinkedListNode<E> current=head;
		while(current.next!=null){
			if(current.next.data==key){
				current.next=current.next.next;
				return;
			}
			current=current.next;
		}
	}
	
	public void destroy(){
		if(head== null)
			return;
		else
		   head = null;
	}
	
	//to return size of the list
	public Integer size(){
		Integer size=0;
		LinkedListNode<E> current = head;
		while(current!=null){
			size+=1;
			current=current.next;
		}
		return size;
	}
	//to remove duplications in the list, O(1) space and O(n^2)time
	public void removeDups(){
		if(head==null) return;
		LinkedListNode<E> current = head;
		while(current!=null){
			LinkedListNode<E> runner= current;
			while(runner.next!=null){
				if(runner.next.data == current.data){
					runner.next=runner.next.next;
				}else{
					runner=runner.next;	
				}
			}
			current=current.next;
		}
	}	
	// to remove duplications with a hashtable implementation, O(n)time
	
	public void deleteDups(){
		Hashtable<E,String> table= new Hashtable<E,String>(); // key is node.data; val is boolean, I changed it to String b/c it has to be an ob type instead of primitive type
		LinkedListNode<E> current=head;
	    LinkedListNode<E> previous= null;// prev of head;
	    while(current!=null){
	    	if(table.containsKey(current.data)){
	    		previous.next=current.next;//delete current
	    	}else{
	    		table.put(current.data, "true");//save the data as key
	    		previous=current;
	    	}
	    	current=current.next;
	    }
		
	}
	//to find the kth to last element(kth last element, k=0 meaning last, k=1 meaning second last) of a singly linked list
	public E kthToLast(int k){
		if (k<=0) return null;
		LinkedListNode<E> p1=head;
		LinkedListNode<E> p2=head;
		
		for (int i=0;i<k;i++){
			if(p2==null) return null;
			p2=p2.next;//move p2 k elements away from p1.	
		}
		if(p2==null) return null;
		while(p2.next!=null){
			p1=p1.next;
			p2=p2.next;
		}	
		return p1.data;
	}
	//to delete a node, given only access to that node
	public boolean deleteNode(LinkedListNode<E> node){
		if(node==null)return false;//failure
		node.data=node.next.data;//copy node.next.data over to the node to delete
		node.next=node.next.next;// remove node.next
		return true;
	}
	
	//class method to specify the type of the list to be integer
    public static MyLinkedList<Integer> partitionX(MyLinkedList<Integer> l, Integer x){
		MyLinkedList<Integer> beforeX= new MyLinkedList<Integer>();
		MyLinkedList<Integer> afterX= new MyLinkedList<Integer>();
		LinkedListNode<Integer> current=l.head;
		while(current!=null){
			if(current.data.compareTo(x)<0) {
				beforeX.addLast(current.data);
			}
			if(current.data.compareTo(x)==0){
				afterX.addFirst(current.data);
			} 
			
			if(current.data.compareTo(x)>0) {
				afterX.addLast(current.data);	 
			}
			current=current.next;
		}
		// fuse the two list
		current=beforeX.head;
		if (current==null) return afterX;
		while(current.next!=null){
			current=current.next;
		}
		current.next=afterX.head;
		return beforeX;
	}
    
}

