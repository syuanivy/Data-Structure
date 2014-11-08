package recursionAndDP;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Seam {
	
	public Integer findMinSeam(int[][] d){
		int m = d.length;   //rows
		int n = d[1].length;    //columns
		int[][] d_seam = new int[m][n];  // cache subproblem results
		// Base case when there is only one row
		if (m==1){
			List list = Arrays.asList(d[m]);
			return (Integer) Collections.min(list);
		}
		//Recursive case
	    for (int i = 1; i<=m; i++){
			for (int j = 1; j<=n ; j++){
				int[] tops = new int[3];
				List l_tops = Arrays.asList(tops);
				int minabove = (Integer) Collections.min(l_tops);
				d_seam[i][j] = d[i][j] + minabove;
			}
		}
		return 0;
	}
	
	

}
