public class FromSwitchToIf4 {
	public static void main(String[] args) {
		int score = (int)(Math.random() * 10) + 1;
		score *= 100;
		String msg = "당신의 점수는 " + score + "이고, 상품은 ";
		/* 예제 (break 문이 없으므로 조건문 모두 실행)
		switch(score) {
		case 1000:
			msg += "자동차, ";
		case 900:
			msg += "TV, ";
		case 800:
			msg += "노트북, ";
		case 700:
			msg += "자전거, ";
		default :
			msg += "볼펜";
		}
		*/
		//로직
		if(score >= 1000) {
			msg += "자동차, ";
		}
		if(score >= 900) {
			msg += "TV, ";
		}
		if(score >= 800) {
			msg += "노트북, ";
		}
		if(score >= 700) {
			msg += "자전거, ";
		}
		if(score >= 0) {
			msg += "볼펜";
		}
		System.out.println(msg + "입니다.");
	}
}