/* ���� 3052 ������
 * �� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. 
 * ���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 
 * �� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�.
 * �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է� : 39, 40, 41, 42, 43, 44, 82, 83, 84, 85
 * ������ : 42
 * ��� : 6
 * 
 * */

package project;

import java.util.ArrayList;
import java.util.Scanner;

public class practice_8 {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			for(int i = 0; i < 10; i++) {
				int a = (sc.nextInt()) % 42;
				if(list.indexOf(a) < 0) {
					list.add(a);
					
				}
			}
			
			System.out.println(list.size());
			
		}

}
