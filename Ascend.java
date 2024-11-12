// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		
		int lim = Integer.parseInt(args[0]); //receives an integer (lim > 0) via input
		int a = (int)(Math.random() * (lim + 1));
		int b = (int)(Math.random() * (lim + 1));
		int c = (int)(Math.random() * (lim + 1)); 
		//receives three random integers in the range of 0-lim
		
		int maxab = Math.max(a, b); 
		int maxac = Math.max(a, c); 
		int maxbc = Math.max(b, c); 
		int mid = Math.min(maxab, Math.min(maxac, maxbc)); 
		//finds the middle value (easier with if tho)

		System.out.println(a + " " + b + " " + c); //prints the three ints with a first and c last
		System.out.println(Math.min(a, Math.min(b, c)) + " " + mid + " " + 
		Math.max(a, Math.max(b, c))); //prints the three ints in increasing order
	}
}
