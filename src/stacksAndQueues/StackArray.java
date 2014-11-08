package stacksAndQueues;
//Use an array to implement a stack
public class StackArray {
	int top;
	int size;
	private int[] array = new int[15];
	
	
	public StackArray(){
		array[0]=-10000000;
		size = 0;
		top =array[0];
		
	}
	
    public void push(int d){
    	if (size==array.length){
    		System.out.println("Full Stack!");
    		return;
    	}else{
    		array[size]=d;
    		size++;
    		top= array[size-1];	
    	}
    }
    
    public int pop(){
    	if (size==0){
    		System.out.println("Empty Stack");
    		return -10000000;
    	}
    	
    	int popped = top;
    	//System.out.println(size);
    	size--;
    	System.out.println("size="+size);
    	if (size==0){
    		top=-10000000;
    	} else{
    		top = array[size-1];
        	System.out.println("top="+top);
    	}
    	return popped;
    }
    
    public int peek(){
    	return top;
	  
	}
	

}
