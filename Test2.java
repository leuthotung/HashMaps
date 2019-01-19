import java.util.Random;
public class Test2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int numbofElements=50;
		// TODO Auto-generated method stub
		Element [] e = new Element[150];
		for(int i =0;i<150;i++) {
			e[i] = new Element(rand.nextInt(10000)+0, rand.nextInt(10000)+0);
		}
		SeparateChaining map = new SeparateChaining(100);	
		LinearProbing map2 = new LinearProbing(100);
		QuadraticProbing map3 = new QuadraticProbing(101);
		while(numbofElements<=50) {
		for(int i =0; i < numbofElements; i++) {
			long startTime = System.nanoTime();
            map.put(e[i].getKey(), e[i].value);
           long endTime = System.nanoTime();
            
          System.out.println("Time needed to run put #" + (i+1) + " in SeperateChaining: " + (endTime - startTime) +" nanoseconds");
          
           
            
		}
		for(int i =0; i < numbofElements; i++) {
			long startTime = System.nanoTime();
            map2.put(e[i].getKey(), e[i].value);
            long endTime = System.nanoTime();
            System.out.println("Time needed to run put #" + (i+1) + " in LinearProbing " + (endTime - startTime)+" nanoseconds" );
		}
		/*for(int i =0; i < numbofElements; i++) {
			long startTime = System.nanoTime();
            map3.put(e[i].getKey(), e[i].value);
            long endTime = System.nanoTime();
            System.out.println("Time needed to run put #" + (i+1) + "in QuadraticProbing " + (endTime - startTime) );
		}
		*/
		numbofElements+=25;
	}
	}

}
