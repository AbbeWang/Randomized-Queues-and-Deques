import java.util.Iterator;

public class Deque <Item> implements Iterable<Item> {

	private Node first, last;
	
	private class Node {
		Item item;
		Node next;
	}
	
	
	public Deque() {
		// construct an empty deque
		this.first = new Node();
		this.last = new Node();		
	}
	
	
	public boolean isEmpty() {
		// is the deque empty?
		return first == null;
	}
	
	
	public int size() {
		// return the number of items on the deque
		
		return 0;
	}
	
	
	public void addFirst(Item item) {
		// add the item to the front
		
		if (isEmpty()) {
			first.item = item;
			first.next = null;
			last = first;
		}
		else {
			Node oldfirst = first;
			first = new Node();
			first.item = item;
			first.next = oldfirst;
		}
	}
	
	
	public void addLast(Item item) {
		// add the item to the end
		
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		
		if (isEmpty())  first = last;
		else            oldlast.next = last;
	}
	
	
	public Item removeFirst() {
		// remove and return the item from the front
		
		Item item = first.item;
		first = first.next;
		if (isEmpty())  last = null;
		
		return item;
	}
	
	
	public Item removeLast() {
		// remove and return the item from the end
		
		Item item = last.item;
		Node temp = first;
		
		Iterator<Item> i = iterator();
		while (i.hasNext()) {
			temp = temp.next;
		}
		
		return item;
	}
	
	
	@Override
	public Iterator<Item> iterator() {
		// return an iterator over items in order from front to end
		return new ListIterator();
	}
	
	
	private class ListIterator implements Iterator<Item> {
		
		private Node current = first;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current != null;
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
