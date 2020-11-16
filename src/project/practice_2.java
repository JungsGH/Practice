/* 10950¹ø A+B-3 */
package project;

import java.util.Scanner;

public class practice_2 {
	public static void main(String[] args) {
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		sc.close();
		
		for(int T = 0; T < testcase; T++) {
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			result = A + B;
			System.out.println(result);
			
		}
		
	}
}
