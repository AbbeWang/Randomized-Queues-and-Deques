import java.util.Iterator;

public class RandomizedQueue<Item> implements Iterable<Item> {
	
	public RandomizedQueue() {
		// construct an empty randomized queue
		
	}
	
	public boolean isEmpty() {
		// is the queue empty?
		
		
		return false;
	}
	
	public int size() {
		// return the number of items on the queue
		
		
		return 0;
	}
	
	
	public void enqueue(Item item) {
		// add the item
		
	}
	
	public Item dequeue() {
		// remove and return a random item
		
		
		return null;		
	}
	
	public Item sample() {
		// return (but do not remove) a random item
		
		return null;
	}

	
	@Override
	public Iterator<Item> iterator() {
		// return an independent iterator over items in random order
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
			
			if (!hasNext()) {
				throw new java.util.NoSuchElementException();
			}
			
			return null;
		}
		
		public void remove() {
			throw new java.lang.UnsupportedOperationException();
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
