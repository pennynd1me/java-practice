public class Q14FromSwitchToTernary { //과제14
	public static void main(String[] args) {
		int score = 89;
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
		grade = (score/10 == 10 || score/10 == 9) ? 'A'
				: (score/10 == 8) ? 'B'
				: (score/10 == 7) ? 'C'
				: (score/10 == 6) ? 'D'
				: 'F';
		System.out.println("당신의 학점은 " + grade + "입니다.");
	}
}