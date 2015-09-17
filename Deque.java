import java.util.Iterator;

public class Deque <Item> implements Iterable<Item> {

	private Node first, last;
	
	private class Node {
		Item item;
		Node next;
	}
	
	
	public Deque() {
		// construct an empty deque
		
		
	}
	
	
	public boolean isEmpty() {
		// is the deque empty?
		
		
		return false;
	}
	
	
	public int size() {
		// return the number of items on the deque
		
		return 0;
	}
	
	
	public void addFirst(Item item) {
		// add the item to the front
		
		
	}
	
	
	public void addLast(Item item) {
		// add the item to the end
		
		
	}
	
	
	public Item removeFirst() {
		// remove and return the item from the front
		
		
		return null;
	}
	
	
	public Item removeLast() {
		// remove and return the item from the end
		
		
		return null;
	}
	
	
	@Override
	public Iterator<Item> iterator() {
		// return an iterator over items in order from front to end
		return new ListIterator();
	}
	
	
	private class ListIterator implements Iterator<Item> {

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
