package Algorithm.Programers.level1;

import java.util.Scanner;

public class watermelon {
	//프로그래머스 레벨1 수박수박수박수박수
	public static String output(int n) {
		String result = "";
		
		for(int i =0 ; i < n; i++) {
			if(i%2==0) {//짝수일 경우
				result += "수";
			}else{//홀수인 경우
				result += "박";
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number  =  sc.nextInt();
		
		System.out.println(output(number));
		
		sc.close();
	}
}
