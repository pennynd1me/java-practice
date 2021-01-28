public class Test13 {
	public static void main(String[] args) {
		String mesg = "     홍길동/이순신/유관순     ";
		
		System.out.println("문자열 길이(공백포함): " + mesg.length());
		System.out.println("공백제거: " + mesg.replaceAll(" ", ""));
		System.out.println("공백제거된 문자열 길이: " + mesg.replaceAll(" ", "").length());
		System.out.println("부분열: " + mesg.substring(5, 12));
		System.out.println("홍길동 출력: " + mesg.substring(5, mesg.indexOf("/")));
		System.out.println("유관순 출력: " + mesg.substring(mesg.lastIndexOf("/") + 1, 16));
	}
}