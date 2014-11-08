package treesAndGraphs;

/**
 * Created by ivy on 11/6/14.
 */
public class SINK {
    public static boolean isSINK(int[][]G, int s){
        int n=G.length;
        int i=0;
        int j=0;
        while(j<n){
            if(G[s][j]==1) return false;
            else j++;
        }
        while(i<n){
            if(G[i][s]==0 && i!=s) return false;
            else i++;
        }
        return true;

    }
    public static int findSINK(int[][]G){

        int n=G.length;
        int i=0;
        int j=0;
        while(j <n & i < n ) {
            if(G[i][j]==0) j++;
            else i++;
        }
        if(i==n) return -1;
        else {
            boolean confirmed = isSINK(G, i);
            if (confirmed) return i;
            else return -1;
        }

    }
    public static int findSINK2(int[][] G){
        int n=G.length;
        int s=0;
        int i=0;
        int j=0;
        while(j <n-1 & G[i][j] ==0){
            j++;
            while(i < n-1 && ( G[i][j]==1 || (i==j && G[i][j]==0))){
                i++;
            }
            if(i==n-1 && G[i][j]==1){
                s = j;
                i= s-1;
                while(i>=0 && G[i][j]==1){
                    i--;
                }
                if(i==-1){
                    i=s;
                    while(j>=0 && G[i][j]==0){
                        j--;
                    }
                    if(j==-1){
                        return s;
                    }
                }
            }
        }
        if(j==n-1 & G[i][j] == 0){
            s=i;
            j=s-1;
            while(j>=0 && G[i][j]==0){
                j--;
            }
            if(j==-1){
                j=s;
                while(i>=0 && G[i][j]==1){
                    i--;
                }
                if(i==-1){
                    return s;
                }
            }
        }
        return -1;
    }


}
