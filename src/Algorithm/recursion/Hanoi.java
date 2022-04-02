package Algorithm.recursion;

import java.util.Scanner;

public class Hanoi {
	static StringBuilder sb = new StringBuilder();
	
	public static void move(int num,int start, int end ,int sub) {
		
		if( num==1) {
			sb.append(start+" "+sub+"\n");
		}else {
			move(num-1,start,sub,end);
			 sb.append(start + " " + sub + "\n");
			move(num-1,end,start,sub);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input  = sc.nextInt();
		sb.append((int)(Math.pow(2,input)-1)).append('\n');
		move(input,1,3,2);
		System.out.println(sb);
		
	}
}
