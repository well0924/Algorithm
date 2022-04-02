package Algorithm;

import java.util.Scanner;

public class ConST {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		String input2 = sc.next();
		StringBuffer sb1 = new StringBuffer(input1);
		StringBuffer sb2 = new StringBuffer(input2);
		
		int a = Integer.parseInt(sb1.reverse().toString());
		int b = Integer.parseInt(sb2.reverse().toString());
		
		if(a>b) {
			System.out.println(a);
		}else if(a<b) {
			System.out.println(b);
		}
		sc.close();
	}
}
