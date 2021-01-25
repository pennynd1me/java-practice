public class Q16FromWhileToDoWhile {//과제16
	public static void main(String[] args) {
		/* 예제
		int i = 2;
		while(i <= 9) {
			int j = 1;
			while(j <= 9) {
				System.out.println(i + "*" + j + "=" + i*j);
				j++;
			}
			i++;
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