public class FromSwitchToIf3_1 {
	public static void main(String[] args) {
		int noOfDays = 28;
		switch (noOfDays) // Switch expression (javagoal.com 예제)
		{
		// Case statements
		case 28:
			System.out.println("Only February month has 28 days");
			// NOTE: There is no break statement after the case 28
		case 30:
			System.out.println("April, June, August, October, December has 30 days");
			break;
		case 31:
			System.out.println("January, March, May, July, September, November has 31 days");
			break;
		// Default case statement
		default:
			System.out.println("Please enter valid no of days");
		}
		System.out.println("------------------");
		// FromSwitchToIf
		if (noOfDays == 28) {
			System.out.println("Only February month has 28 days");
			System.out.println("April, June, August, October, December has 30 days");
		} else if (noOfDays == 30) {
			System.out.println("April, June, August, October, December has 30 days");
		} else if (noOfDays == 31) {
			System.out.println("January, March, May, July, September, November has 31 days");
		} else {
			System.out.println("Please enter valid no of days");
		}
		System.out.println("------------------");
		// Declaring a variable for switch expression
		int noOfMonth = 2;
		switch (noOfMonth) // Switch expression
		{
		// Case statements
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 11:
			System.out.println("It has 31 days");
			break;
		case 2:
			System.out.println("It has 28 days");
			break;
		case 4:
		case 6:
		case 8:
		case 10:
		case 12:
			System.out.println("It has 30 days");
			break;
		// Default case statement
		default:
			System.out.println("Please enter valid input");
		}
		System.out.println("------------------");
		if(noOfMonth == 1 || noOfMonth ==  3 || noOfMonth ==  5 || noOfMonth ==  7 || noOfMonth ==  9 || noOfMonth ==  11) {
			System.out.println("It has 31 days");
		} else if(noOfMonth == 2) {
			System.out.println("It has 28 days");
		} else if(noOfMonth == 4 || noOfMonth == 6 || noOfMonth == 8 || noOfMonth == 10 || noOfMonth == 12) {
			System.out.println("It has 30 days");
		} else {
			System.out.println("Please enter valid input");
		}
	}
}