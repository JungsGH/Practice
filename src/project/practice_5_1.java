package project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class practice_5_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int index = 0;
		int[] arr = new int[N];
		while(st.hasMoreTokens()) {
			arr[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[N-1]);
		

	}

}

/*BufferedReader
 * : 문자들을 읽어들일 Reader 객체를 인수로 받음
 * 
 * String readLine()
 * : 텍스트의 문자열 한 줄을 읽습니다. 행의 내용을 포함하는 String을 리턴합니다.
 * 
 * String Tokenizer(String str, String delim)
 * : 문자열을 지정된 구분자로 나누는 StringTokenizer를 생성한다.
 * (구분자 -> 토큰으로 간주 x)
 * 
 * boolean hasMoreTokens()
 * : 토큰이 남아있는지 알려줌
 * 
 * */
