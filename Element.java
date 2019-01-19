
public class Element {
	int key;
	Object value;
	Element next;
	public Element(int key, Object value) {
		this.key = key;
		this.value = value;
	}
	public int getKey() {
		return key;
	}
	public Object getValue() {
		return value;
	}
		 public int hashCode() {
			 String s = ""+key;
			    int h=0;
			    for (int i=0; i < s.length(); i++) {
			      
			      h = (h << 5) | (h >>> 27);
			      h += (int) s.charAt(i);  	 
			  	  }
			    return h;
	}
}
	

