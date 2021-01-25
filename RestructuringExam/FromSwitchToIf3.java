public class FromSwitchToIf3 {//과제7
	public static void main(String[] args) {
		int score = 5;
		/* 예제 (break가 없으므로 이후 조건문을 모두 실행한다.)
		switch(score*100) {
		case 100:
			System.out.println("당신의 점수는 100이고, 상품은 자전거입니다.");
		case 200:
			System.out.println("당신의 점수는 200이고, 상품은 TV입니다.");
		case 300:
			System.out.println("당신의 점수는 300이고, 상품은 노트북입니다.");
		case 400:
			System.out.println("당신의 점수는 400이고, 상품은 자동차입니다.");
			break;
		default:
			System.out.println("죄송하지만 당신의 점수에 해당 상품이 없습니다.");
		}
		*/
		if(score == 1) {
			System.out.println("당신의 점수는 " + 100 + "이고, 상품은 " + "자전거" + "입니다.");
			System.out.println("당신의 점수는 " + 200 + "이고, 상품은 " + "TV" + "입니다.");
			System.out.println("당신의 점수는 " + 300 + "이고, 상품은 " + "노트북" + "입니다.");
			System.out.println("당신의 점수는 " + 400 + "이고, 상품은 " + "자동차" + "입니다.");
		} else if(score == 2) {
			System.out.println("당신의 점수는 " + 200 + "이고, 상품은 " + "TV" + "입니다.");
			System.out.println("당신의 점수는 " + 300 + "이고, 상품은 " + "노트북" + "입니다.");
			System.out.println("당신의 점수는 " + 400 + "이고, 상품은 " + "자동차" + "입니다.");
		} else if(score == 3) {
			System.out.println("당신의 점수는 " + 300 + "이고, 상품은 " + "노트북" + "입니다.");
			System.out.println("당신의 점수는 " + 400 + "이고, 상품은 " + "자동차" + "입니다.");
		} else if(score == 4) {
			System.out.println("당신의 점수는 " + 400 + "이고, 상품은 " + "자동차" + "입니다.");
		} else {
			System.out.println("죄송하지만 당신의 점수에 해당 상품이 없습니다.");
		}
	}
}