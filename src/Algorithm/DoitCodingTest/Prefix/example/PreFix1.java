package Algorithm.DoitCodingTest.Prefix.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PreFix1 {
	public static void main(String[] args) throws IOException {
		
		//bufferedReader 선언
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//특정 문자에 따라 문자열을 나누고 싶을 때 사용. tokenizer객체 생성.
		StringTokenizer stringtokenizer = new StringTokenizer(bufferedReader.readLine());
		
		//데이터의 개수
		int sumNo = Integer.parseInt(stringtokenizer.nextToken());
		//질의 개수
		int answer = Integer.parseInt(stringtokenizer.nextToken());
		
		long[]s = new long[sumNo+1];
		//tokenizer객체 생성.
		stringtokenizer = new StringTokenizer(bufferedReader.readLine());
		
		//데이터의 개수만큼 구간합 공식을 적용.
		for(int i=1; i<=sumNo;i++) {
			//구간 합공식 적용
			s[i] = s[i-1] + Integer.parseInt(stringtokenizer.nextToken());
		}
		//입력한 질의의 수만큼 돌린다.
		for(int q = 0; q < answer;q++) {
			
			stringtokenizer = new StringTokenizer(bufferedReader.readLine());
			
			int i = Integer.parseInt(stringtokenizer.nextToken());
			int j = Integer.parseInt(stringtokenizer.nextToken());
			//i ~ j 의 구간합을 출력을 한다.
			System.out.println(s[j]-s[i-1]);
		}
	}
}
