package stacksAndQueues;

public class Stack3 {
	int stackSize=5;
	int[] buffer = new int[stackSize*3];
	int[] stackPointer = {-1,-1,-1};
	
	////Do not have to have a constructor!!!!
	
	public void printBuffer(){
		for (int i=0; i< buffer.length;i++){
			System.out.println(buffer[i]);
		}
	}

	public void printPointer(){
		for (int i=0; i< 3;i++){
			System.out.println(stackPointer[i]);
		}
	}
		
	public void push(int stackNum, int d) throws Exception{
		//check if we have space
		if(stackPointer[stackNum]==stackSize-1){
			throw new Exception("Out of space.");
		}
		//if there is available space, increment stack pointer and then update top value
		stackPointer[stackNum]++;
		buffer[absIndex(stackNum)]=d;
	}
	
	public int pop(int stackNum) throws Exception{
		if(stackPointer[stackNum]==-1){
			throw new Exception("Empty stack;");
		}
		//else decrement stack pointer and update top value, return the previous top
		int oldTop= buffer[absIndex(stackNum)];
		stackPointer[stackNum]--;
		return oldTop;
	}
	
	public int peek(int stackNum){
		return buffer[absIndex(stackNum)];
	}
	public int absIndex(int stackNum){
		return stackNum*stackSize+stackPointer[stackNum];
	}

}
