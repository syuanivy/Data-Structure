package treesAndGraphs;

import stacksAndQueues.Queue;


public class BinaryTreeNode<E> {
	E entry;
	BinaryTreeNode<E> parent;
	BinaryTreeNode<E> left;
	BinaryTreeNode<E> right;
	//boolean visited;
	
	public void visit(){
		E read = this.entry;
		System.out.println(read.toString());
		//visited = true;
	}
	
	public void inorder(){
		if(left!=null){
			left.inorder();
		}
		this.visit();
		if(right!=null){
			right.inorder();
		}
	}
	
	public void preorder(){
		if(left!=null){
			left.preorder();
		}
		if(right!=null){
			right.preorder();
		}
		
	}
	public void postorder(){
		if(left!=null){
			left.postorder();
		}
		this.visit();
		if(right!=null){
			right.postorder();
		}
	}
	//Use a queue to implement level order. A kind of BFS-Breadth First Search
	public void levelorder(){
		Queue<BinaryTreeNode<E>> queue = new Queue<BinaryTreeNode<E>>();
		queue.enqueue(this);
		//dequeue and visit
		while(queue.first!=null){
			BinaryTreeNode<E> n = queue.dequeue();
			n.visit();
			//enqueue its chirldren
			if(left!=null){
				queue.enqueue(left);
			}
			if(right!=null){
				queue.enqueue(right);
			}
		}
	}


}
