/*���� 2577 ������ ���� */

package project;

import java.util.Scanner;

public class practice_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int value = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		String str = Integer.toString(value); // int���� String���� Ÿ���� ��ȯ
		sc.close();
		
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for(int j = 0; j < str.length(); j++) {
				if((str.charAt(j) - '0') == i) {
					count++;
				}
			}
			
			System.out.println(count);
			
		}
		
	}

}

/* String.charAt()
 *  : �� �ڸ��� ���ڸ� �̱� (charŸ������ return)
 *  cf) - '0' or -48�� ���꿡 ���Խ��Ѿ��� (�ƴϸ� �ƽ�Ű�ڵ忡 �����ϴ� ���ڰ� ����)
 * 
 * */ 


