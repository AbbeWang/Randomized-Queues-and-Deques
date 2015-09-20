import java.util.Iterator;
import edu.princeton.cs.algs4.StdRandom;

public class RandomizedQueue<Item> implements Iterable<Item> {
	
	private int N;
	private Item[] s;
	
	public RandomizedQueue() {
		// construct an empty randomized queue
		this.s = (Item[]) new Object[1];
		s[0] = null;
		this.N = 0;
	}
	
	public boolean isEmpty() {
		// is the queue empty?
		
		
		return N == 0;
	}
	
	public int size() {
		// return the number of items on the queue
		
		
		return N;
	}
	
	
	public void enqueue(Item item) {
		// add the item
		if (item == null) {
			throw new java.lang.NullPointerException();
		}
		
		if (N == s.length)
			resize(2 * s.length);
		
		s[N++] = item;
	}
	
	private void resize(int capacity) {
		// TODO Auto-generated method stub
		Item[] copy = (Item[]) new Object[capacity];
		for (int i = 0; i < N; i++)
			copy[i] = s[i];
		s = copy;
	}

	public Item dequeue() {
		// remove and return a random item
//		Item item = s[--N];
//		s[N] = null;
		
		if (isEmpty()) {
			throw new java.util.NoSuchElementException();
		}
		
		Iterator<Item> i = iterator();
		Item item = null;
		
		while (i.hasNext()) {
			item = i.next();
		}
		
		s[--N] = null;
		
		if (N > 0 && N == s.length/4)
			resize(s.length/2);
	
		return item;		
	}
	
	public Item sample() {
		// return (but do not remove) a random item
		if (isEmpty()) {
			throw new java.util.NoSuchElementException();
		}
		
		Iterator<Item> i = iterator();
		Item item = null;
		
		while (i.hasNext()) {
			item = i.next();
		}
		
		return item;
	}

	
	@Override
	public Iterator<Item> iterator() {
		// return an independent iterator over items in random order
		
//		if (N != 0)  StdRandom.shuffle(s, 0, N-1);

		return new ListIterator();
	}
	
	
	private class ListIterator implements Iterator<Item> {
		
		private int m = 0;
		private Item[] randoms;
		
		public ListIterator() {
			this.randoms = s;
			if (N != 0)  StdRandom.shuffle(randoms, 0, N-1);
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return m != N;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			
			if (!hasNext()) {
				throw new java.util.NoSuchElementException();
			}
			
//			StdRandom.shuffle(s, 0, N-1);
			
			Item item = randoms[m];
			m++;
			return item;
		}
			
		public void remove() {
			throw new java.lang.UnsupportedOperationException();
		}
	}

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RandomizedQueue test = new RandomizedQueue();

		
//		System.out.println(test.isEmpty());
//		System.out.println(test.size());
//		
		test.enqueue(5);
//		System.out.println(test.isEmpty());
//		System.out.println(test.size());
//		
		test.enqueue(4);
//		System.out.println(test.isEmpty());
//		System.out.println(test.size());
//		
		test.enqueue(3);
//		System.out.println(test.isEmpty());
//		System.out.println(test.size());
//		
		test.enqueue(2);
//		System.out.println(test.isEmpty());
//		System.out.println(test.size());
//		
		test.enqueue(1);
//		System.out.println(test.isEmpty());
//		System.out.println(test.size());
//		
//		System.out.println(test.dequeue());
		
//		System.out.println(test.sample());
//		System.out.println(test.sample());
//		System.out.println(test.sample());
//		System.out.println(test.sample());
//		
//		System.out.println(test.dequeue());
//		System.out.println(test.dequeue());
//		System.out.println(test.dequeue());
//		System.out.println(test.dequeue());
//		System.out.println(test.dequeue());
//		System.out.println(test.dequeue());
		
		Iterator i = test.iterator();
		while (i.hasNext())
			System.out.println(i.next());

		Iterator j = test.iterator();
		while (j.hasNext())
			System.out.println(j.next());


		}
}
