// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {

	    String name1 = args[0];  //name no1, a string received via input
		String name2 = args[1]; //name no2, a string received via input
		String name3 = args[2]; //name no3, a string received via input
		int value = Integer.parseInt(args[3]); //the bill, an int received via input
		double eachpay = (double)(value); //converts the restaurant bill into a double
		eachpay = Math.ceil(eachpay / 3); //divides the bill into 3 and rounds up the answer

		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + eachpay + " Shekels each.");
		//receives the input and prints the outcome
	}
}
