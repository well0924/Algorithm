package Algorithm.Doit.ArrayAndList;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		//입력받은 수만큼 배열에 집어넣기.
		int[] numbers  = new int[input];
		//숫자 집어넣기.
		for(int i=0;i<numbers.length;i++ ) {
			 numbers[i] = sc.nextInt();
		}
		
		int sum = 0;
		int max = 0;
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>max) {
				max = numbers[i];
			}
			sum += numbers[i];
		}
		double result = sum*100.00/max/input;
		System.out.println(result);
	}
}
