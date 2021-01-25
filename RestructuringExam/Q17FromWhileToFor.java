public class Q17FromWhileToFor { //과제17
	public static void main(String[] args) {
		/*
		int sum = 0;
		int i = 0;
		while(sum + i <= 100) {
			sum += ++i;
			System.out.println(i + "-" + sum);
		}
		*/
		int sum = 0;
		for (int i = 1; sum + i <= 100; ++i) {
			sum += i;
			System.out.println(i + "-" + sum);
		}
	}
}