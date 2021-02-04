import java.util.ArrayList;
import java.util.List;

public class Calculator {
	public static void main(String[] args) {
		String op1 = "123456789012345678901234567890.123";
		String op2 = "12345678901234567890.987654";
		
		String[] op1arr = op1.split("\\.");
		String[] op2arr = op2.split("\\.");
		//arr[0] = 정수부(decimal integer)
		//arr[1] = 소수부(decimal fraction)
 
		List<Integer> op1Int = new ArrayList<Integer>();
		List<Integer> op1Frac = new ArrayList<Integer>();
		List<Integer> op2Int = new ArrayList<Integer>();
		List<Integer> op2Frac = new ArrayList<Integer>();
		List<Integer> resultInt = new ArrayList<Integer>();
		List<Integer> resultFrac = new ArrayList<Integer>();

		//List에 값 add
		for(int i = 0; i < op1arr[0].length(); i++) {
			op1Int.add((int) op1arr[0].charAt(i) - '0');
			// char 를 int로 강제 형 변환(ASCII) 후 '0'(48)을 빼줌
		}
		for(int i = 0; i < op1arr[1].length(); i++) {
			op1Frac.add((int) op1arr[1].charAt(i) - '0');
		}
		for(int i = 0; i < op2arr[0].length(); i++) {
			op2Int.add((int) op2arr[0].charAt(i) - '0');
		}
		for(int i = 0; i < op2arr[1].length(); i++) {
			op2Frac.add((int) op2arr[1].charAt(i) - '0');
		}
		//정수부 0 추가
		int gap;
		if(op1Int.size() > op2Int.size()) {
			gap = op1Int.size() - op2Int.size();
			for(int i = 0; i < gap; i++) {
				op2Int.add(0, 0);
			}
		}
		else if(op1Int.size() == op2Int.size()){
			gap = 0;
		}
		else {
			gap = op2Int.size() - op1Int.size();
			for(int i = 0; i < gap; i++) {
				op1Int.add(0, 0);
			}
		}
		//소수부 0 추가
		if(op1Frac.size() > op2Frac.size()) {
			gap = op1Frac.size() - op2Frac.size();
			for(int i = 0; i < gap; i++) {
				op2Frac.add(0);
			}
		}
		else if(op1Frac.size() == op2Frac.size()){
			gap = 0;
		}
		else {
			gap = op2Frac.size() - op1Frac.size();
			for(int i = 0; i < gap; i++) {
				op1Frac.add(0);
			}
		}
		//정수부 덧셈
		for(int i = 0; i < Math.max(op1arr[0].length(), op2arr[0].length()); i++) {
			int temp = op1Int.get(i) + op2Int.get(i);
			if(temp >= 10) {
				if(i == 0) {
					resultInt.add(0, 1);
					resultInt.add(temp-10);
				}else {
					resultInt.set(i-1, resultInt.get(i-1)+1);
					resultInt.add(temp-10);
				}
			} else {
				resultInt.add(temp);
			}
		}
		//소수부 덧셈
		for(int i = 0; i < Math.max(op1arr[1].length(), op2arr[1].length()); i++) {
			int temp = op1Frac.get(i) + op2Frac.get(i);
			if(temp >= 10) {
				if(i == 0) {
					resultInt.set(resultInt.size()-1, resultInt.get(resultInt.size()-1)+1);
					resultFrac.add(temp-10);
				}
				else {
					resultFrac.set(i-1, resultFrac.get(i-1)+1);
					resultFrac.add(temp-10);
				}
			} else {
				resultFrac.add(temp);
			}
		}
		//출력
		System.out.print("  ");
		for(int print: op1Int) {
			System.out.print(print);
		}
		System.out.print(".");
		for(int print: op1Frac) {
			System.out.print(print);
		}
		System.out.println();
		System.out.print("+ ");
		for(int print: op2Int) {
			System.out.print(print);
		}
		System.out.print(".");
		for(int print: op2Frac) {
			System.out.print(print);
		}
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.print("  ");
		for(int print: resultInt) {
			System.out.print(print);
		}
		System.out.print(".");
		for(int print: resultFrac) {
			System.out.print(print);
		}
	}
}