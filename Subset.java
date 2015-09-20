import edu.princeton.cs.algs4.StdIn;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = Integer.parseInt(args[0]);
		int N = 0;
		
//		for (N = 0; !StdIn.isEmpty(); N++);
//		String[] s = new String[N];
//		
//		for (int i = 0; !StdIn.isEmpty(); i++) {
//			s[i] = StdIn.readString();
//		}
		
		RandomizedQueue r = new RandomizedQueue();
		
		while (!StdIn.isEmpty()) {
			r.enqueue(StdIn.readString());
			N++;
		}
		
		for (int i = 0; i < k; i++) {
			System.out.println(r.dequeue());
		}
		
	}

}
