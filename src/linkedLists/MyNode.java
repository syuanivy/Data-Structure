package linkedLists;
public class MyNode {
	public int data;
	public MyNode next;
	
	public MyNode (int d){
		data = d;
		next = null;
	}
	
	public MyNode (){
		data = -1000000;
		next = null;
	}
	
	public void print(){
		System.out.print( data );//cannot call a method on NULL!
	}
	
	public void set(int d){
		data = d;
	}
	
	public int get(){
		return data;
	}
	
	
	public static MyNode addToList(MyNode head, MyNode n) // append n to the list
	{
		if (head==null){
			return n;
		}
		
		MyNode p = head;
		while(p.next!=null){
			p = p.next;
		}
		p.next = n;
		return head;
	}
	
	public void printList() // treat this node as the head of a linked list
	{
		MyNode n = this;//THIS CANNOT BE NULL!!!
		while(n!=null){
			n.print();
			n = n.next;
		}System.out.println("");
	}
}

