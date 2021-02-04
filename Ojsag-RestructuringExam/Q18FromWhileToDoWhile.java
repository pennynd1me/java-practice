public class Q18FromWhileToDoWhile { //과제18
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
		int i = 0;
		do {
			sum += ++i;
			System.out.println(i + "-" + sum);
		} while(sum + i <= 100);
	}
}