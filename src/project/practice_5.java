/*10818�� �ּ�, �ִ� */
package project;

import java.util.Scanner;

public class practice_5 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int N = sc.nextInt();
	int[] inputdata = new int[N];
	
	for(int i = 0; i < N; i++) {
		inputdata[i] = sc.nextInt();
	}
	sc.close();
	
	int max = inputdata[0];
	int min = inputdata[0];
	
	for(int i = 0; i < N; i++) {
		if(max < inputdata[i]) {
			max = inputdata[i];
		}
		if(min > inputdata[i]) {
			min = inputdata[i];
		}
		
	}
	
	System.out.print(min +" ");
	System.out.println(max);
	
	}

}

/*Arrays.sort() �޼ҵ� 
 * : �迭�� ����� ���� ���� ������������ ����
 * 
 * in.close();
		Arrays.sort(inputdata);
		System.out.print(inputdata[0] + " " + inputdata[N - 1]);
 * 
 * -> ��� ���� import java.util.Arrays; ���
 * 
 * */ 




