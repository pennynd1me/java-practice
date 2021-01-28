import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 정수 입력하세요.");
		int a = sc.nextInt();
		System.out.println("2. 정수 입력하세요.");
		int b = sc.nextInt();
		sc.close();
		System.out.println("정수 " + a + "과 정수 " + b + "의 합계: " + (a+b));
	}
}