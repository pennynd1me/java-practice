import java.io.IOException;

public class FromDoWhileToWhile { //과제19
	public static void main(String[] args) throws IOException {
		int input = 0;
		System.out.println("문장을 입력하세요.");
		System.out.println("입력을 마치려면 x를 입력하세요.");
		/* 예제
		do {
			input = System.in.read();
			System.out.println((char)input);
		} while(input != -1 && input != 'x');
		*/
		while(input != -1 && input != 'x') {
			input = System.in.read();
			System.out.println((char)input);
		}
	}
}
