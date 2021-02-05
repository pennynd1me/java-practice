import java.util.ArrayList;
import java.util.List;

public class CalculatorMain {
	public static void main(String[] args) {
		String op1 = args[0];
		String op = args[1];
		String op2 = args[2];

		int digitgap = 0;
		int sum = 0;
		int overTen = 0;
		int underZero = 0;

		boolean isop1Decimal = false;
		boolean isop2Decimal = false;
		boolean isop2Bigger = false;

		List<Character> op1Int = new ArrayList<>();
		List<Character> op1Frac = new ArrayList<>();
		List<Character> op2Int = new ArrayList<>();
		List<Character> op2Frac = new ArrayList<>();
		List<Character> resultInt = new ArrayList<>();
		List<Character> resultFrac = new ArrayList<>();

		// 정수형, 소수형인지 검증하여 list에 값 add하기
		if (op1.contains(".")) {
			for (int i = 0; i < op1.indexOf("."); i++) {
				op1Int.add(op1.charAt(i));
			}
			for (int i = op1.indexOf(".") + 1; i < op1.length(); i++) {
				op1Frac.add(op1.charAt(i));
			}
			isop1Decimal = true;
		} else {
			for (int i = 0; i < op1.length(); i++) {
				op1Int.add(op1.charAt(i));
			}
		}

		if (op2.contains(".")) {
			for (int i = 0; i < op2.indexOf("."); i++) {
				op2Int.add(op2.charAt(i));
			}
			for (int i = op2.indexOf(".") + 1; i < op2.length(); i++) {
				op2Frac.add(op2.charAt(i));
			}
			isop2Decimal = true;
		} else {
			for (int i = 0; i < op2.length(); i++) {
				op2Int.add(op2.charAt(i));
			}
		}
		// op2가 더 큰 수 인지 비교(뺄셈용)
		if (op1Int.size() < op2Int.size()) {
			isop2Bigger = true;
		} else if (op1Int.size() == op2Int.size()) {
			for (int i = 0; i < op1Int.size(); i++) {
				if (isop2Bigger) {
					break;
				}
				isop2Bigger = op1Int.get(i) < op2Int.get(i) ? true : false;
			}
		}
		// 정수 자리수 0 채우기
		digitgap = Math.max(op1Int.size(), op2Int.size()) - Math.min(op1Int.size(), op2Int.size());
		if (op1Int.size() < op2Int.size()) {
			for (int i = 0; i < digitgap; i++) {
				op1Int.add(0, '0');
			}
		} else {
			for (int i = 0; i < digitgap; i++) {
				op2Int.add(0, '0');
			}
		}
		// 소수 자리수 0 채우기
		digitgap = Math.max(op1Frac.size(), op2Frac.size()) - Math.min(op1Frac.size(), op2Frac.size());
		if (op1Frac.size() < op2Frac.size()) {
			for (int i = 0; i < digitgap; i++) {
				op1Frac.add('0');
			}
		} else {
			for (int i = 0; i < digitgap; i++) {
				op2Frac.add('0');
			}
		}
		// 연산하여 resultList에 값 넣기
		// 덧셈 연산
		if (op.equals("add")) {
			// 소수부 연산
			for (int i = op1Frac.size() - 1; i >= 0; i--) {
				sum = op1Frac.get(i) - '0' + op2Frac.get(i) - '0' + overTen;
				overTen = sum / 10;
				sum = sum % 10;
				resultFrac.add(0, (char) (sum + '0'));
			}
			// 정수부 연산
			for (int i = op1Int.size() - 1; i >= 0; i--) {
				sum = op1Int.get(i) - '0' + op2Int.get(i) - '0' + overTen;
				overTen = sum / 10;
				sum = sum % 10;
				resultInt.add(0, (char) (sum + '0'));
			}
			if (op1Int.get(0) - '0' + op2Int.get(0) - '0' + overTen >= 10) {
				resultInt.add(0, '1');
			}
			// 뺄셈 연산
		} else if (op.equals("sub")) {
			if (isop2Bigger) {
				// op2가 더 크다면, 큰수(op2)에서 작은수(op1)를 빼고 앞에 -만 추가
				// 소수부 연산
				for (int i = op1Frac.size() - 1; i >= 0; i--) {
					sum = op2Frac.get(i) - op1Frac.get(i) + underZero;
					if (sum < 0) {
						underZero = -1;
						sum = sum + 10;
					} else {
						underZero = 0;
					}
					resultFrac.add(0, (char) (sum + '0'));
				}
				// 정수부 연산
				for (int i = op1Int.size() - 1; i >= 0; i--) {
					sum = op2Int.get(i) - op1Int.get(i) + underZero;
					if (sum < 0) {
						underZero = -1;
						sum = 10 - Math.abs(sum);
					} else {
						underZero = 0;
						sum = sum % 10;
					}
					resultInt.add(0, (char) (sum + '0'));
				}
				resultInt.add(0, '-');
			} else {
				// op1가 더 크다면, 큰수(op1)에서 작은수(op2)를 뺀다.
				// 소수부 연산
				for (int i = op1Frac.size() - 1; i >= 0; i--) {
					sum = op1Frac.get(i) - op2Frac.get(i) + underZero;
					if (sum < 0) {
						underZero = -1;
						sum = sum + 10;
					} else {
						underZero = 0;
					}
					resultFrac.add(0, (char) (sum + '0'));
				}
				// 정수부 연산
				for (int i = op1Int.size() - 1; i >= 0; i--) {
					sum = op1Int.get(i) - op2Int.get(i) + underZero;
					if (sum < 0) {
						underZero = -1;
						sum = 10 - Math.abs(sum);
					} else {
						underZero = 0;
						sum = sum % 10;
					}
					resultInt.add(0, (char) (sum + '0'));
				}
			}
			// 출력
			System.out.print("  ");
			op1Int.forEach(System.out::print);
			if (isop1Decimal == true || isop2Decimal == true) {
				System.out.print(".");
			}
			op1Frac.forEach(System.out::print);
			System.out.println();
			if (op.equals("add")) {
				System.out.print("+ ");
			} else if (op.equals("sub")) {
				System.out.print("- ");
			}
			op2Int.forEach(System.out::print);
			if (isop1Decimal == true || isop2Decimal == true) {
				System.out.print(".");
			}
			op2Frac.forEach(System.out::print);
			System.out.println();
			for (int i = 0; i < Math.max(op1.length(), op2.length()) + 4; i++) {
				System.out.print("-");
			}
			System.out.println();
			if (overTen == 1 || isop2Bigger) {
				System.out.print(" ");
			} else {
				System.out.print("  ");
			}
			resultInt.forEach(System.out::print);
			if (isop1Decimal == true || isop2Decimal == true) {
				System.out.print(".");
			}
			resultFrac.forEach(System.out::print);
		}
	}
}