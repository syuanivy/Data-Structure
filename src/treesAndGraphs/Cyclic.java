package treesAndGraphs;

import java.util.ArrayList;

/**
 * Created by ivy on 11/7/14.
 */
public class Cyclic {

    public static boolean isCyclic(ArrayList<Node> G){
        for(Node u:G){
            u.data.color = -1;
            u.data.parent = null;
        }
        boolean flag = false;
        for(Node u:G){
            flag = dfsCyclic(G,u.data,flag);
            if(flag) return true;
        }
        return false;
    }

    public static boolean dfsCyclic(ArrayList<Node> G, Vertex s, Boolean flag){
        if(flag) return true;
        s.color = 0;
        int i = 0;
        while(G.get(i).data != s){
            i++;
        }
        Node current = G.get(i).next;
        while(current!= null){
            System.out.println(G.get(i).data.name+" to " + current.data.name);
            if(G.get(i).data.parent == null) System.out.println(G.get(i).data.parent+" is parent");
            else System.out.println(G.get(i).data.parent.name +" is parent");
            if(current.data.color == 0 & current.data != G.get(i).data.parent){
                System.out.println(current.data.name+" visited");
                flag = true;
                return flag;
            }else if(current.data.color == -1){
                current.data.parent = G.get(i).data;
                System.out.println("keep DFS on "+current.data.name);
                flag = dfsCyclic(G,current.data,flag);
            }
            current = current.next;
        }
        System.out.println(s.name+ " "+flag);
        s.color = 1;
        return flag;

    }
}
