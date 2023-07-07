package collectionframework;

import java.util.concurrent.ArrayBlockingQueue;

public class queue {
	//size limitation

	public static void main(String[] args) {
		ArrayBlockingQueue<Integer>i=new ArrayBlockingQueue<>(5); 
				//Add		
				i.add(3);
				i.add(65);
				i.add(52);
				i.add(25);
				i.add(17);
				System.out.println(i);
				
			//Retrieve --only head 
				System.out.println(i.peek());
				
			//remove
				i.remove(3);
				System.out.println(i);
				
			//iterate
				for(Integer x:i) {
					System.out.println(x);
				}
				/*
				  * Not index based
				  * Can add duplicates
				  * 
				  * */
				  
				
	}

}
 