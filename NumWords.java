// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {

		int num = Integer.parseInt(args[0]); //receives an integer via input

		System.out.println(num / 100 + " hundreds, " + (num / 10) % 10 + " tens, and " + num %  10 + " ones.");
		// will receive the input and print the outcome
	}
}
