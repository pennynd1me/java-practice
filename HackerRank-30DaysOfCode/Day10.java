import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int consecutive1 = 0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String strBinary = Integer.toBinaryString(n);
        String[] strArray = strBinary.split("0");
        for(int i = 0; i < strArray.length; i++) {
        	if(consecutive1 < strArray[i].length()) {
        		consecutive1 = strArray[i].length();
        	}
        }
        System.out.println(consecutive1);
        scanner.close();
    }
}
