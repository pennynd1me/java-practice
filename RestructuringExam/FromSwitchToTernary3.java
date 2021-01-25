public class FromSwitchToTernary3 {
	public static void main(String[] args) {
		int score = 1;
		String msg = "";
		/* 예제 (break 문이 없으므로 이후 조건문을 모두 실행)
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
		msg = (score == 1) ? "당신의 점수는 100이고, 상품은 자전거입니다." + "\n" + "당신의 점수는 200이고, 상품은 TV입니다." + "\n" + "당신의 점수는 300이고, 상품은 노트북입니다." + "\n" + "당신의 점수는 400이고, 상품은 자동차입니다."
				: (score == 2) ? "당신의 점수는 200이고, 상품은 TV입니다." + "\n" + "당신의 점수는 300이고, 상품은 노트북입니다." + "\n" + "당신의 점수는 400이고, 상품은 자동차입니다."
				: (score == 3) ? "당신의 점수는 300이고, 상품은 노트북입니다." + "\n" + "당신의 점수는 400이고, 상품은 자동차입니다."
				: (score == 4) ? "당신의 점수는 400이고, 상품은 자동차입니다."
				: "죄송하지만 당신의 점수에 해당 상품이 없습니다.";
		System.out.println(msg);
	
	}
}