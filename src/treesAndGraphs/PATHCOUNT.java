package treesAndGraphs;

import java.util.ArrayList;

/**
 * Created by ivy on 11/6/14.
 */
public class PATHCOUNT {
    public static int countPATH(ArrayList<Node> G, Vertex s, Vertex t){
        for(Node u:G){
            u.data.color = -1;
            if(u.data==t)  u.data.count =1;
            else u.data.count =0;
        }
        dfsVISIT(G,s,t);
        return s.count;
    }

    public static void dfsVISIT(ArrayList<Node> G, Vertex s, Vertex t){
        s.color = 0;
        int i = 0;
        while(G.get(i).data != s){
            i++;
        }
        Node current = G.get(i).next;
        while(current!= null){
            if(current.data == t){
                current.data.color = 1;
            }else if(current.data.color == -1){
                dfsVISIT(G,current.data,t);
            }
            s.count += current.data.count;
            current = current.next;
        }
        s.color = 1;

    }

}
