import java.util.Scanner;

interface AdvancedArithmetic {
	int divisorSum(int n);
}

class Calculator2 implements AdvancedArithmetic {
	int sum;
	public int divisorSum(int n) {
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
}

public class Day19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic myCalculator = new Calculator2();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
	}
}
