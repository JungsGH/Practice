/*น้มุ 10952 A+B-5*/

package project;

import java.util.Scanner;

public class practice_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			int A=sc.nextInt();
			int B=sc.nextInt();
		
			if(A==0 && B==0){
				sc.close();
				break;
			}
			System.out.println(A+B);
		}
		
	}
}
