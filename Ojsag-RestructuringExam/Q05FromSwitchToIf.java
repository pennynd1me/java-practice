public class Q05FromSwitchToIf { //과제5
	public static void main(String[] args) {
		//'A', 'B', 'C', 'D'중의 하나를 얻을 수 있다.
		char ch = (char)(Math.random() * 4 + 'A');
		int score = 0;
		/* 예제
		switch(ch) {
		case'A' :
			score = 90;
			break;
		case'B' :
			score = 80;
			break;
		case'C' :
			score = 70;
			break;
		case'D' :
			score = 60;
			break;
		}
		*/
		if(ch == 'A') {
			score = 90;
		} else if(ch == 'B') {
			score = 80;
		} else if(ch == 'C') {
			score = 70;
		} else if(ch == 'D') {
			score = 60;
		}
		System.out.println("당신의 점수는 " + score + "점 이상입니다.");
	}
}