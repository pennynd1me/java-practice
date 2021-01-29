import java.util.Scanner;

public class Day6 {

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int T = scanner.nextInt();
		String s;
		String s1 = "";
		String s2 = "";

		for(int i = 0; i < T; i++) {
			s = scanner.next();
			for(int j = 0; j < s.length(); j++) {
				if(j%2 == 0) {
					s1 += s.charAt(j);
				}else {
					s2 += s.charAt(j);
				}
			}
			System.out.println(s1 + " " + s2);
			s1 = ""; s2 = "";
		}
		scanner.close();
	}
}