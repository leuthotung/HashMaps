//import java.util.*;
public class SeparateChaining extends AbstractMap{
		public SeparateChaining(int cap) {
		bucketArray = new MyArrayList<>(cap);
		capacity = cap;
		size = 0;
		collisions = 0;
		numbinBucket = 0;
		
		for (int i = 0; i< capacity;i++) {
			bucketArray.add(null);
		}
		}
		
		/*public void resize(int capacity) {
			ArrayList<Element> temp = new ArrayList<>(capacity);
			for(int i =0;i<capacity;i++) {
				temp.set(i,bucketArray.get(i));
			}
			bucketArray = temp;
		}*/
		public Object remove(int key) {
			int bucketIndex = compress(key);
			Element head = bucketArray.get(bucketIndex);
			Element prev = null;
		
			while(head!= null) {
				if(head.key== key)
					break;
				prev =head;
				head = head.next;	
			}
			if (head == null) {
				return null;
			}
			
			
			if (prev!= null)
				prev.next = head.next;
			else 
				bucketArray.set(bucketIndex, head.next);
			return head.value;
			}
		
		public Object get(int key) {
			int index = compress(key);
			Element head = bucketArray.get(index);
			while (head != null) {
				if (head.key== key) 
					return head.value;
					head = head.next;
				
			}
			return null;
		}
		public void put(int key,Object value) {
			/*if(size == capacity/2) {
				resize(capacity*2);
				capacity = capacity*2;
			
			}*/
			 int bucketIndex = compress(key); 
		        Element head = bucketArray.get(bucketIndex); 
		  
		        // Check if key is already present 
		        if (head!= null)
		        	collisions++;
		        while (head != null) 
		        { 
		            if (head.key==key)
		            { 
		                head.value = value; 
		                
		                size++;
		                System.out.println("Size of the SeparateChaining Hashtable: " + capacity);
				        System.out.println("Number of elements: " + size);
				        System.out.println("Number of collisions: "+ collisions);
				        System.out.println("Number of items in the bucket: " +numbinBucket);
		                return; 
		            } 
		            
		            numbinBucket++;
		            head = head.next; 
		          
		            
		        } 
		  
		        // Insert key in chain 
		        size++; 
		        head = bucketArray.get(bucketIndex); 
		        Element newNode = new Element(key, value); 
		        newNode.next = head; 
		        bucketArray.set(bucketIndex, newNode);
		        System.out.println("Size of the table: " + capacity);
		        System.out.println("Number of elements: " + size);
		        System.out.println("Number of collisions: "+ collisions);
		        System.out.println("Number of items in the bucket: " +numbinBucket);
		}
		public void reput(int key,Object value) {
			/*if(size == capacity/2) {
				resize(capacity*2);
				capacity = capacity*2;
			
			}*/
			 int bucketIndex = compress(key); 
		        Element head = bucketArray.get(bucketIndex); 
		  
		        // Check if key is already present 
		        if (head!= null)
		        	
		        while (head != null) 
		        { 
		            if (head.key==key)
		            { 
		                head.value = value; 
		                
		               
		                return; 
		            } 
		            
		           
		            head = head.next; 
		            
		            
		        } 
		  
		        // Insert key in chain 
		       
		        head = bucketArray.get(bucketIndex); 
		        Element newNode = new Element(key, value); 
		        newNode.next = head; 
		        bucketArray.set(bucketIndex, newNode);
		       
		}
}
