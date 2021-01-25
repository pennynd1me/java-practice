public class FromIfToTernary { //과제2
	public static void main(String[] args) {
		for(int score = 79; score <= 100; score++) {
		//int score = 82;
		String grade = "";
		/* 예제
		if (score >= 90) {
			grade = "A";
			if(score >= 98) {
				grade += "+";
			} else if(score < 94) {
				grade += "-";
			}
		} else if (score >= 80) {
			grade = "B";
			if(score >= 88) {
				grade += "+";
			} else if(score < 84) {
				grade += "-";
			}
		} else {
			grade = "C";
		}
		*/
		//로직
		grade = (score >= 80)
				? (score >= 90)
				? "A" + ( (score < 94) ? "-" : (score >= 98) ? "+" : "" )
				: "B" + ( (score < 84) ? "-" : (score >= 88) ? "+" : "" )
				: "C" ;
		//출력
		System.out.println("당신의 점수는 " + score + "입니다.");
		System.out.println("당신의 학점은 " + grade + "입니다.");
		}
	}
}