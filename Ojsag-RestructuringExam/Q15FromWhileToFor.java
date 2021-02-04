public class Q15FromWhileToFor {//과제15
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
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
	}
}