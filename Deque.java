import java.util.Iterator;

public class Deque<Item> implements Iterable<Item> {

	private Node first, last;
	
	private class Node {
		private Item item;
		private Node next;
	}
	
	
	public Deque() {
		// construct an empty deque
		this.first = null;
		this.last = null;		
	}
	
	
	public boolean isEmpty() {
		// is the deque empty?
		return first == null;
	}
	
	
	public int size() {
		// return the number of items on the deque
		int count = 0;
		Node temp = first;
		
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		
		return count;
	}
	
	
	public void addFirst(Item item) {
		// add the item to the front
		
		if (item == null) {
			throw new java.lang.NullPointerException();
		}
		
		if (isEmpty()) {
			first = new Node();
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
		
		if (item == null) {
			throw new java.lang.NullPointerException();
		}
		
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		
		if (isEmpty())  first = last;
		else            oldlast.next = last;
	}
	
	
	public Item removeFirst() {
		// remove and return the item from the front
		
		if (isEmpty()) {
			throw new java.util.NoSuchElementException();
		}
		
		Item item = first.item;
		first = first.next;
		if (isEmpty())  last = null;
		
		return item;
	}
	
	
	public Item removeLast() {
		// remove and return the item from the end
		
		if (isEmpty()) {
			throw new java.util.NoSuchElementException();
		}
		
		Item item = last.item;
		Node temp = first;
		
		if (temp.next == null) {
			first = null;
			last = null;
		}
		else {
			while (temp.next.next != null) {
				temp = temp.next;
			}
			
			last = temp;
			last.next = null;
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
			
			if (!hasNext()) {
				throw new java.util.NoSuchElementException();
			}
			
			Item item = current.item;
			current = current.next;
			return item;
		}
		
		public void remove() {
			throw new java.lang.UnsupportedOperationException();
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque test = new Deque();
//		System.out.println(test.isEmpty());
//		System.out.println(test.size());
//		
		test.addFirst(1);
//		System.out.println(test.isEmpty());
//		System.out.println(test.size());
//		
		test.addLast(2);
//		System.out.println(test.isEmpty());
//		System.out.println(test.size());
//		
//		test.addLast(null);
//		System.out.println(test.isEmpty());
//		System.out.println(test.size());
//		
//		test.removeLast();
//		System.out.println(test.isEmpty());
//		System.out.println(test.size());
//		
//		test.removeLast();
//		System.out.println(test.isEmpty());
//		System.out.println(test.size());
//		
//		test.removeLast();
//		System.out.println(test.isEmpty());
//		System.out.println(test.size());
		
		Iterator i = test.iterator();
		
		while (i.hasNext())
			System.out.println(i.next());

	}
}
