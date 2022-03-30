package Algorithm.recursion;

import java.util.Scanner;

public class Fibonacchi {
	
	public static int fibonacchi(int num) {
		if(num ==1) {
			return 1;
		}else if(num ==2) {
			return 1;
		}
		return fibonacchi(num-1)+fibonacchi(num-2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(fibonacchi(input));
	}
}
