public class Q12FromSwitchToTernary { //과제12
	public static void main(String[] args) {
		int score = 60;
		char grade = ' ';
		/* 예제
		switch(score) {
		case 100: case 99: case 98: case 97: case 96:
		case 95: case 94: case 93: case 92: case 91:
		case 90:
			grade = 'A';
			break;
		case 89: case 88: case 87: case 86:
		case 85: case 84: case 83: case 82: case 81:
		case 80:
			grade = 'B';
			break;
		case 79: case 78: case 77: case 76:
		case 75: case 74: case 73: case 72: case 71:
		case 70:
			grade = 'C';
			break;
		case 69: case 68: case 67: case 66:
		case 65: case 64: case 63: case 62: case 61:
		case 60:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		*/
		//로직
		grade = (100 >= score && score >= 90) ? 'A'
				: (89 >= score && score >= 80) ? 'B'
				: (79 >= score && score >= 70) ? 'C'
				: (69 >= score && score >= 60) ? 'D'
				: 'F';
		System.out.println("당신의 학점은 " + grade + "입니다.");
	}
}