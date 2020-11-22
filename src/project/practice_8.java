/* 백준 3052 나머지
 * 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 
 * 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
 * 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다.
 * 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
 * 
 * 입력 : 39, 40, 41, 42, 43, 44, 82, 83, 84, 85
 * 나머지 : 42
 * 출력 : 6
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
