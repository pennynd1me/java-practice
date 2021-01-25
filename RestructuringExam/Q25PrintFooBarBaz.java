public class Q25PrintFooBarBaz { //과제25
	public static void main(String[] args) {
		for(int i = 1; i <= 105; i++) {
			String msg = "";
			if(i%3 == 0) {
				msg += " foo";
			}
			if(i%5 == 0) {
				msg += " bar";
			}
			if(i%7 == 0) {
				msg += " baz";
			}
			System.out.println(i + msg);
		}
		System.out.println("\n" + "and so on.");
	}
}