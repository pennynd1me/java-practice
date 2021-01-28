public class Test14 {
	public static void main(String[] args) {
		String mesg = "100/200";
		String[] arr = mesg.split("/");
		System.out.println("정수값 합계: " + (Integer.parseInt(arr[0]) + Integer.parseInt(arr[1])));
		System.out.println("정수값 평균: " + (Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]))/arr.length);
	}
}