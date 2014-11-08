package treesAndGraphs;

public class BinaryTree<E> extends BinaryTreeNode<E> {
	BinaryTreeNode<E> root;
	int size;// how to construct a tree and keep track of size?
	
	public void preorder(){
		root.preorder();
	}
	
	public void postorder(){
		root.postorder();
	}
	
	public void inorder(){
		root.inorder();
	}
	
	public void levelorder(){
		root.levelorder();
	}

}
