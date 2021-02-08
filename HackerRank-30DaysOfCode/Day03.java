import java.util.Scanner;

public class Day03 {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		if (N%2 == 0) {
			if(6 <= N && N <= 20) {
				System.out.println("Weird");
			}else if(2 <= N && N <= 5 || N > 20) {
				System.out.println("Not Weird");
			}
		} else {
			System.out.println("Weird");
		}
		
		scanner.close();
	}

}