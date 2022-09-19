package Algorithm.Doit.list.Array;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		//n개의 숫자가 공백 없이 써 있다. 이 수자를 모두 합해 출력하는 프로그램을
		//작성하기.
		
		//1.스캐너로 숫자를 받는다.(타입은 문자열)
		//2.받은 값을 배열로 변환한다.(문자열을 캐릭터로 변환배열)
		//3.반복문을 돌려서 합을 구한다.(그전에 반복문으로 배열에 넣는다.->형변환으로 배열의 합을 구한다.)
		Scanner sc = new Scanner(System.in);
		
		String input2 =sc.nextLine();
		
		//캐릭터 배열로 변환
		char[] in =input2.toCharArray();
		//반복문으로 배열
		int sum= 0;
	
		for(int i =0; i<in.length;i++) {
			sum += in[i]-'0';
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
