import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주소를 입력하시오.");
		String str = sc.next();
		String[] array = str.split(" ");
		sc.close();
		System.out.println("도명: " + array[0]);
		System.out.println("시명: " + array[1]);
		System.out.println("구명: " + array[2]);
	}
}