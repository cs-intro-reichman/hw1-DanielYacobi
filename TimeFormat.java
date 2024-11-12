// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {

		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1)); //between 0-23
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4)); //between 0-59

		if (hours > 12) //checks whether hours > or <= 12 to change the display of hours if the condition is met
			System.out.print("" + (hours - 12)); //prints the subtraction of hours by 12
		else
			System.out.print("" + hours); //prints hours
		
		if (minutes < 10) //checks whether minutes < or >= 10 to change the display of minutes if the condition is met
			System.out.print(":0" + minutes); //prints minutes with ":0" before
		else 
			System.out.print(":" + minutes); //prints minutes with ":" before
		
		if (hours<12) //checks whether hours is < or >= 12, which will add "AM" or "PM" respectively
			System.out.print(" AM"); //prints "AM" at the end
		else
			System.out.print(" PM"); //prints "PM" at the end
		}
}