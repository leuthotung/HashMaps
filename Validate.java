import java.util.Random;
	public class Validate {

		public static void main(String[] args) {
			Random rand = new Random();
			int numbofElements=50;
			
			Element [] e = new Element[150];
			for(int i =0;i<50;i++) {
				e[i] = new Element(rand.nextInt(10000)+0, rand.nextInt(10000)+0);
			}
			SeparateChaining map = new SeparateChaining(100);	
			LinearProbing map2 = new LinearProbing(100);
			QuadraticProbing map3 = new QuadraticProbing(100);
		
			for(int i =0; i < numbofElements; i++) {
			/*	 map2.put(e[i].getKey(), e[i].value); 
			   System.out.println( map.get(e[i].getKey()));
			   System.out.println( map.remove(e[i].getKey()));
			   System.out.println( map.get(e[i].getKey()));
			       
			       
				 map2.put(e[i].getKey(), e[i].value); 
		       System.out.println( map2.get(e[i].getKey()));
		       System.out.println( map2.remove(e[i].getKey()));
		       System.out.println( map2.get(e[i].getKey()));*/
				
	          map3.put(e[i].getKey(), e[i].value); 
	           System.out.println( map3.get(e[i].getKey()));
	           System.out.println( map3.remove(e[i].getKey()));
	           System.out.println( map3.get(e[i].getKey()));
	           
	            
			}
		
		}

	}


