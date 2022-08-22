package Algorithm;

import java.util.Scanner;

public class ConST {
	
	public static String solution(String s) {
	    StringBuffer sb1 = new StringBuffer(s);
	    String answer = sb1.reverse().toString();
	    System.out.println(answer);
	    return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		
		solution(input1);
		sc.close();
	}
}
