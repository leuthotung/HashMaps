public class MyArrayList <E> {
	private E[] data;
	private int size = 0;

	public MyArrayList(int x) {
		data = (E[]) new Object [x];
		
	}
	public boolean add(E e) {
		if(size ==data.length)
			resize(2*data.length);
		data[size]=e;
		size++;
		
		return true;
	}
	protected void resize(int capacity) {
		E[] temp = (E[]) new Object[capacity];
		for(int i =0;i<size;i++) {
			temp[i]=data[i];
		}
		data = temp;
	}
	public void set(int index, E element) throws IndexOutOfBoundsException{
		if (index <0|| index> size) {
			throw new IndexOutOfBoundsException("Invalid Index");
		}
		if(size ==data.length)
			resize(2*data.length);
		else {
		for(int i =size-1; i>= index; i--) 
			data[i+1]= data[i];
			
			data [index]= element;
			size ++;
		}
	}
	
	public E get(int index) throws IndexOutOfBoundsException{
		E get = data[index];
		return get;
	}
	
	

	public int size() {
		return size;
	}
	
	
}
