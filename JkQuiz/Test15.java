import java.util.Scanner;

public class Test15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 정수 입력하세요.");
		int a1 = sc.nextInt();
		System.out.println("2. 정수 입력하세요.");
		int a2 = sc.nextInt();
		System.out.println("3. 정수 입력하세요.");
		int a3 = sc.nextInt();
		sc.close();
		System.out.println("정수 " + a1 +"과 " + "정수 " + a2 + ", 정수 " + a3 + "중에서 최대값: " + ((Math.max(a1, a2) > a3)? Math.max(a1, a2) : a3));
		
	}
}