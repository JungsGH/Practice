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
 * : ���ڵ��� �о���� Reader ��ü�� �μ��� ����
 * 
 * String readLine()
 * : �ؽ�Ʈ�� ���ڿ� �� ���� �н��ϴ�. ���� ������ �����ϴ� String�� �����մϴ�.
 * 
 * String Tokenizer(String str, String delim)
 * : ���ڿ��� ������ �����ڷ� ������ StringTokenizer�� �����Ѵ�.
 * (������ -> ��ū���� ���� x)
 * 
 * boolean hasMoreTokens()
 * : ��ū�� �����ִ��� �˷���
 * 
 * */
