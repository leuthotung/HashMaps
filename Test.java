import java.util.*;
public class Test {

	public static void main(String[] args) {
		Random rand = new Random();
		
		Element [] e = new Element[10000];
		for(int i =0;i<10000;i++) {
			e[i] = new Element(rand.nextInt(10000)+0, rand.nextInt(10000)+0);
		}
		SeparateChaining map = new SeparateChaining(128);
		
	
		
	
//Step 6
		for(int i =0; i < 10000; i++) {
		
			long startTime = System.nanoTime();
            map.put(e[i].getKey(), e[i].value);
            long endTime = System.nanoTime();
            System.out.println("Time needed to run put #" + (i+1) + ": " + (endTime - startTime) );
        	startTime = System.nanoTime();
            map.get(e[i].getKey());
            endTime = System.nanoTime();
            System.out.println("Time needed to run get key #" + (i+1) + ": " + (endTime - startTime) );
        	if(map.size() == map.capacity/2) {
				SeparateChaining temp = new SeparateChaining(map.capacity*2);
				temp.size = map.size;
				
				temp.collisions = map.collisions;
				temp.numbinBucket = map.numbinBucket;
				for( int k=0; k<map.capacity;k++) {
					temp.reput(e[i].getKey(), e[i].value);
				}
				map = temp;
				
				
			}
		}
	
	}

}
