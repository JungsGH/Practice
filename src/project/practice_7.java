/*백준 2577 숫자의 개수 */

package project;

import java.util.Scanner;

public class practice_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int value = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		String str = Integer.toString(value); // int형을 String으로 타입을 변환
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
 *  : 각 자리의 문자를 뽑기 (char타입으로 return)
 *  cf) - '0' or -48을 연산에 포함시켜야함 (아니면 아스키코드에 대응하는 문자가 나옴)
 * 
 * */ 


