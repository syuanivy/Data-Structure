package treesAndGraphs;

/**
 * Created by ivy on 11/6/14.
 */
public class Vertex {

        public int color;
        public int count;
        public Vertex next;
        public Vertex parent;
        public String name;

        public Vertex(String name){
            this.name = name;
            this.next = null;
            this.parent = null;
        }

}
