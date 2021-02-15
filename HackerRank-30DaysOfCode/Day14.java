import java.util.Scanner;

class Difference {
	private int[] elements;
	public int maximumDifference;

	public Difference(int[] a) {
		this.elements = a;
	}

	void computeDifference() {
		int max = elements[0];
		int min = elements[0];
		for (int i = 0; i < elements.length; i++) {
			if (max < elements[i]) {
				max = elements[i];
			}
			if (min > elements[i]) {
				min = elements[i];
			}
		}
		maximumDifference = -1 * (min - max);
	}
}

public class Day14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}