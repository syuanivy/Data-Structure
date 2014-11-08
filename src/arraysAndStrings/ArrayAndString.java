package arraysAndStrings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;


public class ArrayAndString {

	public static boolean[][] detectZero(int[][] matrix){
		int r= matrix.length;
		int c= matrix[0].length;
		boolean[][] zeroPosition= new boolean[r][c];
		for (int i=0;i<r;i++){
			for (int j=0;j<c;j++){
				if(matrix[i][j]==0) zeroPosition[i][j]= true;
			}
		}
		return zeroPosition;
	}
	
	public static int[][] setZero(int[][] matrix){
		int r= matrix.length;
		int c= matrix[0].length;
		boolean[] zeroR= new boolean[r];
		boolean[] zeroC= new boolean[c];
		for (int i=0;i<r;i++){
			for (int j=0;j<c;j++){
				if(matrix[i][j]==0) {
					zeroR[i]=true;
					zeroC[j]=true;
				}			
			}
		}
		for (int i=0; i< matrix.length;i++){
			for (int j=0; j<matrix[0].length; j++){
				if (zeroR[i]||zeroC[j]){
						matrix[i][j]=0;
					}
			}
		}
		return matrix;
	}
	
	public static void printMatrix(int[][] matrix){
		int r= matrix.length;
		int c= matrix[0].length;
		for (int i=0;i<r;i++){
			for (int j=0;j<c;j++){
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("");
		}
	}
	public static int[][] rotate90(int[][] image){
		int row = image.length;
		int column = image[0].length;
		int[][] rotate = new int[column][row];
		for (int i =0; i< column; i++){
			for (int j=0; j<row; j++){
				rotate[i][j]= image[j][i];
			}
		}
		return rotate;
	}
	public static String compress(String s){
		StringBuilder compress = new StringBuilder();
		compress.append(s.charAt(0));
		Integer count=1;
		for (int i=1; i<s.length();i++){
			if(s.charAt(i)!=s.charAt(i-1)){
				compress.append(Integer.toString(count));
				compress.append(s.charAt(i));
				count=1;
			}else{
				count++;
			} 		
		}
		compress.append(count);
		String counted = compress.toString();
		for (int i=0; i<counted.length()/2;i++){
			if(counted.charAt(2*i+1)!='1') {
				return counted;
			}
		}
		return s;
		
	}
	public static String replaceSpace(String s){
		char[] s_array = s.toCharArray();
		int l = s.length();
		//int countSpace = 0;
		//for (int i=0; i<l; i++){
			//if (s_array[i] == ' ') countSpace++;
		//}
		char[] s_replace = new char[l*3];//if all characters are space, the working array will be 3 times the old length
		int num = 0;
		for (int i=0; i<l; i++){
			if(s_array[i]==' '){
				s_replace[i+2*num]='%';
				s_replace[i+2*num+1]='2';
				s_replace[i+2*num+2]='0';
				num++;
			}else{
				s_replace[i+2*num]=s_array[i];
			}	
		}
		char[] s_replaced = Arrays.copyOfRange(s_replace, 0, l+2*num);
		return new String(s_replaced);
	}
	
	
	public static boolean isPermutation (String s1, String s2){
		if (s1.length()!=s2.length()) return false;
		
		char[] array1=s1.toCharArray();
		char[] array2=s2.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);// of coz need to import java.util.Arrays
				
		return Arrays.equals(array1, array2);// create two new sorted strings and use s1.equals(s2);	
	}
	
	public static void reverseNullEnd(String s){
		int end= s.length()-1;
		char[] temp= s.toCharArray();//toCharArray
		int forward =end;
		for (int backward=0; backward<forward; backward++){
			temp[forward]= temp[backward];//temp[end]= temp[0];
			temp[backward]=temp[forward-1];// temp[0]= temp[end-1]; swap the second last and the first character
			forward--;
		}
		s= new String(temp);
		System.out.println(s);

	}
	
	public static void reverse(String s){
		int l= s.length();
		char[] reversed= new char[l];
		int j=0;
		for (int i=l-1;i>=0;i--){
			reversed[j]=s.charAt(i);
			j++;
		}
		s= new String(reversed);
		System.out.println(s);
	}
	
	public static void simpleIO(String[] args) throws IOException{
		BufferedReader keyboard = new BufferedReader (new InputStreamReader (System.in));
		
		System.out.println(keyboard.readLine());
		
	}
	
	public static HashMap<Integer, String> buildMap(String[] words){
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for (String s : words) map.put(Arrays.asList(words).indexOf(s), s);
		return map;	
	} 

}
