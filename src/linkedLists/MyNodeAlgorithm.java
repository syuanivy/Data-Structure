package linkedLists;
import java.util.*;
public class MyNodeAlgorithm {
	//create new nodes
	public static MyNode sumDigit(MyNode h1, MyNode h2)
	{
		MyNode h3 = null; 
		int c = 0;
		
		MyNode n1=h1, n2=h2, n3=h3; // n3 is the tail of h3
		
		while(n1!=null && n2!=null){
			int value = n1.get() + n2.get() + c;
			c = (value>=10) ? 1 : 0;
			value = value % 10;
			MyNode n_new = new MyNode(value);
			
			if(h3==null){
				h3 = n_new;
			}
			else{
				n3.next = n_new;
			}
			n3 = n_new;
			
			n1 = n1.next;
			n2 = n2.next;
		}
		
		if(n1==null && n2==null){
			if (c == 0)
				return h3;
			else{
				MyNode n_new = new MyNode(c);
				n3.next = n_new;
				return h3;
			}
		}
		else{
			MyNode nn = (n1!=null)? n1 : n2;
			while(nn!=null){
				int value = nn.get() + c;
				c = (value>=10) ? 1 : 0;
				value = value % 10;

				MyNode n_new = new MyNode(value);
				
				n3.next = n_new;
				n3 = n_new;
				nn = nn.next;
			}
			if(c!=0){
				MyNode n_new = new MyNode(c);
				n3.next = n_new;
				return h3;
			}
		} 
			
		return h3;
	}

	// use old nodes when the other list runs out.
	public static MyNode sumDigit1(MyNode h1, MyNode h2)  // use current node
	{
		MyNode h3 = null; 
		int c = 0;
		
		MyNode n1=h1, n2=h2, n3=h3; // n3 is the tail of h3
		
		while(n1!=null && n2!=null){
			int value = n1.get() + n2.get() + c;
			c = (value>=10) ? 1 : 0;
			value = value % 10;
			MyNode n_new = new MyNode(value);
			
			if(h3==null){
				h3 = n_new;
			}
			else{
				n3.next = n_new;
			}
			n3 = n_new;
			
			n1 = n1.next;
			n2 = n2.next;
		}
		
		if(n1==null && n2==null){
			if (c == 0)
				return h3;
			else{
				MyNode n_new = new MyNode(c);
				n3.next = n_new;
				return h3;
			}
		}
		else{
			MyNode nn = (n1!=null)? n1 : n2;
			while(nn!=null){
				int value = nn.get() + c;
				c = (value>=10) ? 1 : 0;
				value = value % 10;
				//nn.set(value);
				nn.data=value;
				n3.next = nn;
				n3 = nn;
				nn = nn.next;
			}
		} 
			
		return h3;
	}
	
	
	//Find the connection node in a corrupt/circled linked list
	public static MyNode cirNode(MyNode head){
		Hashtable<MyNode, Boolean> table= new Hashtable<MyNode, Boolean>();
		MyNode n = head;
		while(n!=null){
			if(table.containsKey(n)){
				n.print();
				return n;
			}else{
				table.put(n, true);
				n=n.next;	
			}
		}
		System.out.println("Not Circular!");
		return null;
	}
	
	//Check if a list is a palindrome.
	public static boolean palindrome(MyNode head){
		// create a new list which reverses the  old list by creating a node prev
		MyNode current= head;
		MyNode prev= null;
		
		while(current!=null){
			MyNode new_node=new MyNode();
			new_node.data= current.data;
			new_node.next=prev;
			prev=new_node;
			current=current.next;
		}
		
		//prev.printList();//prev=new_node is the reversed new list's head.
		//compare each
		MyNode n1= head;
		MyNode n2= prev;
		while(n1!=null){
			if(n1.data!=n2.data){
				System.out.println("No Palindrome!");
				return false;
			}
			n1=n1.next;
			n2=n2.next;
		}
		
		System.out.println("Palindrome!");
		return true;
	}
	// reverse  without creating a whole new list, unlike in above method palindrom
	public static MyNode reverse(MyNode head){
		MyNode current= head;
		MyNode prev= null;
		MyNode next= current.next;
		if(current==null||current.next==null) return head;
		while (current.next!=null){
			current.next=prev;
			prev=current;
			current=next;
			next=next.next;
		}
		current.next=prev;
		return current;
	}
/*
	public static void main(String[] args)
	{
		MyNode h1 = new MyNode(3);
		MyNode n = new MyNode(4);
		h1 = MyNode.addToList(h1, n);
		MyNode n1 = new MyNode(5);
		h1 = MyNode.addToList(h1, n1);
		h1= MyNode.addToList(h1, new MyNode(4));
		h1=MyNode.addToList(h1, new MyNode(6));
		//MyNode bad= cirNode(h1);
		//palindrome(h1);
		reverse(h1).printList();
		
	}
*/
}
