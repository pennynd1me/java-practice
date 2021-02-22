import java.util.Scanner;

public class Day20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int numSwaps = 0;
		// Write Your Code
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp; 
					numSwaps++;
				}
			}
			if (numSwaps == 0) {
				break;
			}
		}
		int firstElement = a[0];
		int lastElement = a[a.length-1];
		System.out.println("Array is sorted in " + numSwaps + " swaps.");
		System.out.println("First Element: " + firstElement);
		System.out.println("Last Element: " + lastElement);
	}
}