public class Q24FromForToDoWhile {//과제24
	public static void main(String[] args) {
		/* 예제
		int i;
		for(i = 1; i <= 10; i++) {
			sum += i;
		}
		*/
		int i = 2;
		do {
			int j = 1;
			while(j <= 9) {
				System.out.println(i + "*" + j + "=" + i*j);
				j++;
			}
			i++;
		} while(i <= 9);
	}
}