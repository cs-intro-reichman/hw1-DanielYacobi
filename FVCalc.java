// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		
		int currentValue = Integer.parseInt(args[0]); //invested sum, assumed to be an nonnegative int
		double rate = Double.parseDouble(args[1]); //the annual interest rate, assumed to be an percentage (0-100)
		int n = Integer.parseInt(args[2]); //number of years, assumed to be an nonnegative int
		int futureValue = (int)(currentValue * Math.pow(1 + rate * 0.01, n)); //currentValue ⋅ (1 + rate) times n

		System.out.println("After " + n + " years, a $" + currentValue + " saved at " + rate +
		"% will yield $" + futureValue); // receives the input and prints the outcome (not written correctly in pdf)
	}
}