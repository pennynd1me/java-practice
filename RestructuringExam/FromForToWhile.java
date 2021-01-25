public class FromForToWhile {//과제21
	public static void main(String[] args) {
		int sum = 0;
		/* 예제
		int i;
		for(i = 1; i <= 10; i++) {
			sum += i;
		}
		*/
		int i = 1;
		while(i <= 10) {
			sum += i++;
		}
		System.out.println((i - 1) + " 까지의 합: " + sum);
	}
}