

public class QuadraticProbing extends AbstractMap{
	public QuadraticProbing(int cap) {
		size=0;
		capacity=cap;
		bucketArray = new MyArrayList<Element>(cap);
		for(int i=0;i<capacity;i++)
			bucketArray.add(null);
        collisions = 0;
        numbProbe = 0;
		}
	public void put(int key,Object value) {
		Element newElement =  new Element(key, value);
		int index = compress(newElement.hashCode());
		Element space = bucketArray.get(index);
		if(space!= null)
			collisions++;
		
		while(space!= null&& space.key !=key &&space.value.equals("AVAILABLE")==false ) {
			int i =0;
			index = (index+i*i)%capacity;
			 space = bucketArray.get(index);
			 i++;
			 numbProbe++;
			
		}
		if (space == null|| space.value.equals("AVAILABLE") ) {
			
			space = newElement;
			bucketArray.set(index, space);
			
		}
		size++;
		 	System.out.println("Size of the QuadraticProbing Hashtable: " + capacity);
	        System.out.println("Number of elements: " + size);
	        System.out.println("Number of collisions: "+ collisions);
	        System.out.println("Number of probing attempts: "+ numbProbe);
		
	}
	public Object get(int key) {
		Element e = new Element (key,1);
		int index = compress(e.hashCode());
		int p = 0;
		while(p != capacity) {
		Element	head = bucketArray.get(index);
		if (head== null)
			return null;
		else if (head.key == key)
				return head.value;
		else
			index = (index+1)%capacity;
		p= p+1;
		}
		return null;
	}
	public Object remove(int key) {
		Element e = new Element (key,1);
		
		int index = compress(e.hashCode());
		Element head = bucketArray.get(index);
		while(head!=null) {
			int i =0;
			if (head.key == key) {
				Element temp = head;
				head = new Element(key,"AVAILABLE");
				bucketArray.set(index, head);
				size--;
				return temp.value;	
				
			}
			index = (index+i*i)%capacity;
			head = bucketArray.get(index);
			i++;
				
		}
		return null;
	}
	

}
