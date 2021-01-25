import java.io.IOException;

public class FromDoWhileToFor { //과제20
	public static void main(String[] args) throws IOException {
		System.out.println("문장을 입력하세요.");
		System.out.println("입력을 마치려면 x를 입력하세요.");
		/* 예제
		int input = 0;
		do {
			input = System.in.read();
			System.out.println((char)input);
		} while(input != -1 && input != 'x');
		*/
		for(int input = 0; input != -1 && input != 'x';) {
			input = System.in.read();
			System.out.println((char)input);
		}
		
	}
}
