import java.util.ArrayList;
public abstract class AbstractMap {
int size = 0;
int capacity; 
int collisions;
int numbinBucket;
int numbProbe;
 MyArrayList<Element> bucketArray;
 
/*public AbstractMap() {
	bucketArray = new ArrayList<>();
	
}*/
public int size() {
	return size;
}
public boolean isEmpty() {
	return size==0;
}
public int compress(int hashcode) {
	
	 
	int index = hashcode % capacity;
	return index;
}
}
