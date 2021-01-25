public class FromSwitchToIf6 { //과제13
	public static void main(String[] args) {
		int score = 100;
		char grade = ' ';
		/* 예제
		switch(score/10) {
		case 10 :
		case 9 :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		case 6 :
			grade = 'D';
			break;
		default :
			grade = 'F';
		}
		*/
		if(score/10 == 10 || score/10 == 9) {
			grade = 'A';
		} else if(score/10 == 8) {
			grade = 'B';
		} else if(score/10 == 7) {
			grade = 'C';
		} else if(score/10 == 6) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("당신의 학점은 " + grade + "입니다.");
	}
}