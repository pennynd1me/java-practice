public class FromSwitchToIf {
	public static void main(String[] args) {
		/* 예제
		switch(score*100) {
		case 100:
			System.out.println("당신의 점수는 100이고, 상품은 자전거입니다.");
			break;
		case 200:
			System.out.println("당신의 점수는 200이고, 상품은 TV입니다.");
			break;
		case 300:
			System.out.println("당신의 점수는 300이고, 상품은 노트북입니다.");
			break;
		case 400:
			System.out.println("당신의 점수는 400이고, 상품은 자동차입니다.");
			break;
		default :
			System.out.println("죄송하지만 당신의 점수에 해당 상품이 없습니다.");
		*/
		//로직
		int score = (int)(Math.random() * 10) + 1;
		if(score == 1) {
			System.out.println("당신의 점수는 " + (score * 100) + "이고, 상품은 " + "자전거" + " 입니다.");
		} else if(score == 2) {
			System.out.println("당신의 점수는 " + (score * 100) + "이고, 상품은 " + "TV" + " 입니다.");
		} else if(score == 3) {
			System.out.println("당신의 점수는 " + (score * 100) + "이고, 상품은 " + "노트북" + " 입니다.");
		} else if(score == 4) {
			System.out.println("당신의 점수는 " + (score * 100) + "이고, 상품은 " + "자동차" + " 입니다.");
		} else {
			System.out.println("죄송하지만 당신의 점수에 해당 상품이 없습니다.");
		}
	}
}