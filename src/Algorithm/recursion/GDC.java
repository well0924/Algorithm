package Algorithm.recursion;

import java.util.Scanner;

public class GDC {
	//최대공약수
	public static int GDCM(int num1,int num2) {
		if(num2 == 0) {
			return num1;
		}else {
			return GDCM(num2, num1%num2);
		} 
	}
	//최소 공배수
	public static int LCMM(int num1,int num2) {
		return num1*num2/GDCM(num1, num2);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("최대공약수:"+GDCM(num1, num2));
		System.out.println("최소공배수:"+LCMM(num1, num2));
	}
}
