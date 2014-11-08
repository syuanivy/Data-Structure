package treesAndGraphs;
//Each tree node in a binary heap has 2 references: key, object
//Same as in a binary search tree
//A binary heap is a complete binary tree, all levels except for the bottom
//has to be full. 
//Entries of a binary heap satisfy the heap-order property:
//No children has keys less than its parent's. 
//But unlike binary search tree, left does not have to be smaller than right
public class BinaryHeapNode<E> extends BinaryTreeNode<E> {// also used for binary search tree
	Integer key;
	
	//APIs for binary heap
	public E min(){
		return this.entry;// the root has the smallest key
	}
	
	public void insert(Integer k, E item){
		
	}
	
	public E removeMin(){
		return this.entry;
	}
	
	public BinaryHeapNode<E> bottomUp(E[] array){
		return null;	
	}
	
	//APIs for binary search tree
	public E find(E item){
		return item;
	}
	
	public E first(){ //find the object with the smallest key
		return null;
	}

	public E last(){ //find the object with the largest key
		return null;
	}
	
	public void insert (E object, Integer k){
		
	}
	
	public E remove(E item){
		return item;
	}
	
	

}
