package treesAndGraphs;
//Each tree node in a binary heap has 2 references: key, object
//Same as in a binary search tree
//A binary heap is a complete binary tree, all levels except for the bottom
//has to be full. 
//Entries of a binary heap satisfy the heap-order property:
//No children has keys less than its parent's. 
//But unlike binary search tree, left does not have to be smaller than right
public class BinaryHeap<E>  {
	BinaryHeapNode<E> min;
	int size;

}
