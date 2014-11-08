//import java.util.*;
//import java.io.*;

import treesAndGraphs.Node;
import treesAndGraphs.PATHCOUNT;
import treesAndGraphs.Vertex;

import java.util.ArrayList;

import static treesAndGraphs.Cyclic.isCyclic;
import static treesAndGraphs.PATHCOUNT.countPATH;
import static treesAndGraphs.SINK.findSINK;

public class Test {
	
	public static void main(String[] args) throws Exception{
        //test COUNTPATH and Cyclic
        ArrayList<Node> G = new ArrayList<Node>(6);
        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex s = new Vertex("s");
        Vertex P = new Vertex("P");
        Vertex Q = new Vertex("Q");
        Vertex t = new Vertex("t");
        G.add(0, new Node(A));
        G.get(0).next = new Node(s);
        G.get(0).next = new Node(B);


        G.add(1, new Node(B));
        G.get(1).next = new Node(A);
        G.get(1).next = new Node(s);


        //    G.get(1).next = new Node(Q);
        G.add(2, new Node(s));
        G.get(2).next = new Node(A);
        G.get(2).next = new Node(B);

        //    G.get(2).next.next = new Node(P);
    //    G.get(2).next.next.next = new Node(t);
    //    G.get(2).next.next.next.next = new Node(B);
        G.add(3, new Node(P));
    //    G.get(3).next = new Node(t);
    //    G.get(3).next.next = new Node(Q);
    //    G.get(3).next.next.next = new Node(B);

        G.add(4, new Node(Q));
     //   G.get(4).next = new Node(t);
        G.add(5, new Node(t));
    //    G.get(5).next = new Node(B);

        //int n = countPATH(G, s, t);
        boolean flag =isCyclic(G);
        System.out.println(flag);







        /*// test SINK
        int G[][] = {{0,0,1,0,0,1},{1,1,1,0,1,1},{0,0,0,0,0,1},{0,0,1,0,1,1},{0,0,1,0,0,1},{0,0,0,0,0,0}};
        int s = findSINK(G);
        System.out.print(s);

*/



	/*
		//test queues of cats and dogs
		CatQueue cats = new CatQueue();
		Cat tom = new Cat();
		tom.name = "Tom";
	//	Dog chopper = new Dog("Chopper");
		//Cat jerry = new Cat("Jerry");
		cats.enqueueCat(tom);
		
		Cat jerry = new Cat();
		jerry.name = "Jerry";
		cats.enqueueCat(jerry);
		
		Cat levy = new Cat();
		levy.name = "Levy";
		cats.enqueueCat(levy);
		cats.printCats();
		
		System.out.println(levy.order);
		
		cats.dequeueCat();
		cats.printCats();
		System.out.println(levy.order);
		
		
	*/
	/*
		// test SimpleStack and  sortStack method
		SimpleStack stack = new SimpleStack();
		stack.push(5);
		stack.push(2);
		stack.push(4);
		stack.push(1);
		stack.push(3);
		stack.peek();
		SimpleStack sorted = stack.sortStack();
		sorted.peek();
		sorted.pop();
		sorted.peek();
	*/	
	/*
		// test of MyQueue, using two stacks to implement a queue
		MyQueue q = new MyQueue(); 
		q.enqueue(1);
		q.enqueue(2);
		
		q.peek();
		
		q.dequeue();
		System.out.println(q.length);
		q.peek();
		
		q.enqueue(3);
		q.enqueue(4);
	
		System.out.println(q.length);
		q.peek();
	*/
		/*
		//test Pile of Disks, 
		
		Pile p1 = new Pile();
		Pile p2 = new Pile();
		Pile p3 = new Pile();
		p1.push(5);
		p1.push(4);
		p1.push(3);
		p1.push(2);
		p1.push(1);
		p1.printPile();
		
		Pile.transfer(p1,p2,p3);
*/
		/*
	    SetOfStacks stacks = new SetOfStacks();
	    stacks.pushToSet(8);
	    System.out.println(stacks.getTop());

		stacks.pushToSet(7);
		System.out.println(stacks.getTop());
		
		stacks.pushToSet(9);
		System.out.println(stacks.getTop());
		
        
		stacks.pushToSet(5);
		System.out.println(stacks.getTop());
		
		stacks.pushToSet(4);
		System.out.println(stacks.getTop());
		
		stacks.pushToSet(2);
		System.out.println(stacks.getTop());
		
		
		
		stacks.pushToSet(13);
		System.out.println(stacks.getTop());
	    System.out.println(stacks.pointer);
	    
	   
	    stacks.current.top.printList();

		System.out.println(stacks.popOut());
		System.out.println(stacks.getTop());
		System.out.println(stacks.pointer);
		System.out.println(stacks.popOut());
		System.out.println(stacks.getTop());
		System.out.println(stacks.popOut());
		System.out.println(stacks.getTop());
	
	    System.out.println(stacks.popAt(0));
	    System.out.println(stacks.getTop());
	    System.out.println(stacks.pointer);
	    */
		/*
		// Use a single array to implement three stacks.
		// First, try to use an array to implement one stack
		//to implement a stack, you need push, pop
		//Then, try to use StackArray to implement 3 stacks
		
		 Stack3 stacks = new Stack3();
			
		 stacks.push(0, 3);
		 stacks.push(1, 5);
		 stacks.push(2, 7);
		 stacks.push(2, 22);

		 stacks.printPointer();
		 System.out.println();
		 stacks.printBuffer();
		 System.out.println();
		 System.out.println(stacks.pop(2));
		 System.out.println(stacks.peek(2));
		*/
	
	/*stack.push(5);
		stack.push(8);
		stack.push(7);
		stack.push(9);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		*/		
	    /* Test: 2D array problems
	    //reverseNullEnd("I LOVE U");
		int[][] image = new int[3][3];
		image[0][0]=1;
		image[0][1]=4;
		image[0][2]=6;
		image[1][0]=3;
		image[1][1]=0;
		image[1][2]=5;
		image[2][0]=4;
		image[2][1]=5;
		image[2][2]=7;
		printMatrix(image);
		printMatrix(setZero(image));
		*/
		
		/*// Test : integer MyLinkedList
		MyLinkedList<Integer> testlist1= new MyLinkedList<Integer>();
		testlist1.addFirst(9);
		testlist1.addFirst(9);
		//testlist1.addLast(9);
		testlist1.printMyLinkedList();
		System.out.println("+");
       	//testlist.addLast(20);
		MyLinkedList<Integer> testlist2= new MyLinkedList<Integer>();
		testlist2.addFirst(9 );
		testlist2.insertBefore(9, 9);
		testlist2.addFirst(9);
		testlist2.printMyLinkedList();
		//MyLinkedList<Integer> result = MyLinkedList.sumDigits(testlist1, testlist2);
		//result.printMyLinkedList();
		*/		
		/* Test: String LinkedList
		String[] array={"How","I","met","your","mother"} ;
		MyLinkedList<String> testlist= MyLinkedList.array2List(array);
		testlist.insertAfter("mother", "mother");
		testlist.insertBefore("I","???");
		testlist.insertBefore("How","???");
		testlist.insertAfter("mother", "???");
		testlist.printMyLinkedList();
		MyLinkedList<Integer> l= MyLinkedList.partitionX(testlist, 5);
	    l.printMyLinkedList();
		System.out.println(testlist.size());		
		testlist.deleteDups();
	    testlist.printMyLinkedList();
	    System.out.println(testlist.size());
	    String s=testlist.kthToLast(4);
	    MyLinkedList.LinkedListNode<String> n=testlist.findFirst("mother");
		boolean d = testlist.deleteNode(testlist.findFirst("mother"));
		System.out.println(d);
		testlist.printMyLinkedList();
		*/
		
		/* Test MyNode: sumDigit and sumDigit1
		MyNode h1 = new MyNode(9);
		MyNode n = new MyNode(9);
		h1 = MyNode.addToList(h1, n);
		MyNode n1 = new MyNode(9);
		h1 = MyNode.addToList(h1, n1);
		h1.printList();
		
		System.out.print(" + ");
		
		MyNode h2 = new MyNode(1);
		//MyNode m = new MyNode(1);
		//h2 = MyNode.addToList(h2, m);
		h2.printList();
		
		System.out.print(" = ");	
		
		MyNode h3 = sumDigit(h1, h2);
		h3.printList();
			
		 */
				
	}
}
