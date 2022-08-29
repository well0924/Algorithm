package Algorithm.Doit.slidingWindow;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DNApassword {
	//데이터 저장
	static int checkArr[];
	//현재 상태 배열
	static int myArr[];
	//문자와 관련된 개수를 충족했는지 판단하는 변수
	static int checkSecret;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		//문자열의 길이
		int S = Integer.parseInt(st.nextToken());
		//부분 문자열의 길이
		int P = Integer.parseInt(st.nextToken());
		//결과값
		int Result = 0;
		
		char[] A= new char[S];
		checkArr = new int[4];
		myArr = new int[4];
		
		checkSecret = 0;
		
		A = bf.readLine().toCharArray();
		st = new StringTokenizer(bf.readLine());
		
		for(int i = 0; i<4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if(checkArr[i] == 0) 
				checkSecret++;
			
		}
		//초기P부분 문자열 처리 부분
		for(int i = 0; i < P; i++) {
			Add(A[i]);
		}
		
		if(checkSecret == 4) 
			Result++;
		
		//슬라이딩 윈도우 처리 부분
		for(int i= P; i< S; i++) {
			int j = i-P;
			Add(A[i]);
			Remove(A[j]);
			//4자리수와 관련된 크기가 모두 충족될 때 유효한 비밀번호
			if(checkSecret == 4) 
				Result ++;	
		}
		System.out.println(Result);
		bf.close();
	}
	//문자 더하기 함수
	private static void Add(char c) {
		switch(c) {
			case 'A': 
				myArr[0]++;
				if(myArr[0] == checkArr[0]) 
					checkSecret++;
				break;
			case 'C':
				myArr[1]++;
				if(myArr[1] == checkArr[1]) 
					checkSecret++;
				
				break;
			case 'G':
				myArr[2]++;
				if(myArr[2] == checkArr[2]) 
					checkSecret++;
				
				break;
			
			case 'T':
				myArr[3]++;
				if(myArr[3]==checkArr[3]) 
					checkSecret++;
				
				break;
		}
	}
	
	//문자 빼기 함수
	private static void Remove(char c) {
		switch(c) {
			case 'A': 
				if(myArr[0] == checkArr[0]) 
					checkSecret--;
				myArr[0]--;
			break;
		
			case 'C':
				if(myArr[1] == checkArr[1])
					checkSecret++;
				myArr[1]--;
			break;
		
			case 'G':
				if(myArr[2] == checkArr[2])
					checkSecret--;
				myArr[2]--;
			break;
		
			case 'T':
				if(myArr[3]==checkArr[3])
					checkSecret--;
				myArr[3]--;
			break;
		}
	}
}
