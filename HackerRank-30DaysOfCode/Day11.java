import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day11 {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = new int[6][6];
		int tempsum = 0;
		int maxsum = 0;
		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}
		/*
-1 -1 0 -9 -2 -2
-2 -1 -6 -8 -2 -5
-1 -1 -1 -2 -3 -4
-1 -9 -2 -4 -4 -5
-7 -3 -3 -2 -9 -9
-1 -3 -1 -2 -4 -5
		*/
		maxsum = -64;
		for (int k = 0; k < 4; k++) {
			for (int l = 0; l < 4; l++) {
				tempsum = 0;
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						if(i == 1) {
							if(j == 1) {
								tempsum += arr[k + i][l + j];
							}
						}else{
							tempsum += arr[k + i][l + j];
						}
					}
				}
				maxsum = Math.max(tempsum, maxsum);
			}
		}
		System.out.println(maxsum);
		scanner.close();
	}
}
