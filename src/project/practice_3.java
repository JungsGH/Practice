/*���� 10871�� X���� ���� ��*/

package project;

import java.util.Scanner;

public class practice_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // ���� A�� �Է¹��� ����
		int X = sc.nextInt(); // �Է¹��� ������ X���� ������ ���
		
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

