package recursionAndDP;

public class Pile {
	Disk top;
	
	public Pile(){
		top = null;
	}
	
	public class Disk{
		int data;
		Disk above;
		Disk below;
		
		public Disk(int d){
			data = d;
			above= null;
			below = null;
		}
	}
	
	public void push(int d){
		Disk newTop = new Disk(d);
		newTop.below=top;
		top=newTop;
	}
	
	public int pop(){
		int off = top.data;
		top =top.below;
		return off;
	}
	
	public void printPile(){
		Disk current = top;
		if (current==null) System.out.println("Empty Pile!");
		while(current!=null){
			System.out.print(current.data);
			current=current.below;
			System.out.println();
		}
	}
	
	public static void transfer(Pile p1, Pile p2, Pile p3){
		//Towers of Hanoi, p1 full, p2, p3 empty,move to p3
		// check at p2 position.
		while(p1.top!=null || p2.top!=null){// do following until p1 and p2 are empty
			if ( p1.top!=null && (p2.top==null|| p1.top.data<p2.top.data) ){
				p2.push(p1.pop());
			}else{
				p1.push(p2.pop());
			}
			if( p2.top!=null && (p3.top==null || p2.top.data<p3.top.data) ){
				p3.push(p2.pop());
			}else{
				p2.push(p3.pop());
			}
			
		}
		System.out.println("Pile1:");
		p1.printPile();
		System.out.println("Pile2:");
		p2.printPile();
		System.out.println("Pile3:");
		p3.printPile();
		
	}

}
