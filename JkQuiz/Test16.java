public class Test16 {
	public static void main(String[] args) {
		int inx = 15;
		// 1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		if(10 < inx && inx < 20){
		System.out.println("true1");
		}
		char ch1 = ' ';
		// 2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		if(ch1 != 32 && ch1 != 9){
		System.out.println("true2");
		}
		char ch2 = 'x';
		// 3. char형 변수 ch가 ‘x’ 또는 ‘X’일 때 true인 조건식
		if(ch2 == 'x' || ch2 == 'X'){
		System.out.println("true3");
		}
		char ch3 = '0';
		// 4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
		if(48 <= ch3 && ch3 <= 57){
		System.out.println("true4");
		}
		char ch4 = 'a';
		// 5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		if((65 <= ch4 && ch4 <= 90)||(97 <= ch4 && ch4 <= 122)){
		System.out.println("true5");
		}
		int year = 400;
		// 6. int형 변수 year가 400으로 나눠 떨어지거나 또는 4로 나눠 떨어지고
		//	100으로 나눠 떨어지지 않을 때 true인 조건식
		if((year%400 == 0)||(year%4 == 0 && year%100 != 0)){
		System.out.println("true6");
		}
		boolean powerOn = false;
		// 7. boolean형 변수 powerOn가 false일 때 true인 조건식
		if(powerOn == false){
		System.out.println("true7");
		}
		String str = "yes";
		// 8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
		if(str.equals("yes")){
		System.out.println("true8");
		}
	}
}