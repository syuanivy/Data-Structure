package treesAndGraphs;

/**
 * Created by ivy on 11/6/14.
 */
public class Node {
    public Vertex data;
    public Node next;
    public Node(Vertex v){
     this.data = v;
     this.next = null;
    }

    public void printAdjList(){
        System.out.print(this.data.name+": ");
        Node n =this.next;
        while(n!=null){
            System.out.print(n.data.name);
        }
    }
}

