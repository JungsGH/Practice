/*백준 10871번 X보다 작은 수*/

package project;

import java.util.Scanner;

public class practice_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 수열 A에 입력받을 정수
		int X = sc.nextInt(); // 입력받은 정수가 X보다 작으면 출력
		
		int[] A = new int[N];
		
		for(int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
		
		}
		sc.close();
		
		for(int i = 0; i<A.length; i++) {
			if(A[i] < X) {
				System.out.println(A[i]);
			}
		}
		
	}
}

