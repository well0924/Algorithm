package Algorithm.recursion;

import java.util.Scanner;

public class Factorial {
	
	public static int factorial(int num) {
		if(num ==1){
			return 1;
		}
		
		return num * factorial(num-1);
	}
	
	public static int fibonachi(int num) {
		if(num ==1) {
			return 1;
		}else if(num== 2) {
			return 1;
		}
		return fibonachi(num-1) + fibonachi(num-2);
	}
	public static void main(String[] args) {
		Scanner  sc  = new Scanner(System.in);
		System.out.print("팩토리얼숫자 입력:");
		int input = sc.nextInt();
//		int result = factorial(input);
//		System.out.println(result);
		int result2= fibonachi(input);
		System.out.println(result2);
	}
}
