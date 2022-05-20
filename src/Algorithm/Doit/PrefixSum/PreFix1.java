package Algorithm.Doit.PrefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PreFix1 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stringtokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int sumNo = Integer.parseInt(stringtokenizer.nextToken());
		int answer = Integer.parseInt(stringtokenizer.nextToken());
		long[]s = new long[sumNo+1];
		
		stringtokenizer = new StringTokenizer(bufferedReader.readLine());
		
		for(int i=1; i<=sumNo;i++) {
			//구간 합공식 적용
			s[i] = s[i-1] + Integer.parseInt(stringtokenizer.nextToken());
		}
		
		for(int q = 0; q < answer;q++) {
			stringtokenizer = new StringTokenizer(bufferedReader.readLine());
			int i = Integer.parseInt(stringtokenizer.nextToken());
			int j = Integer.parseInt(stringtokenizer.nextToken());
			System.out.println(s[j]-s[i-1]);
		}
	}
}
