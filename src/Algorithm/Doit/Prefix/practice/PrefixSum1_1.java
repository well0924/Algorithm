package Algorithm.Doit.Prefix.practice;

import java.util.Scanner;

public class PrefixSum1_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//배열의 수
		int n = sc.nextInt();
		//구간 질의 수
		int m = sc.nextInt();
		//배열
		int[]arr = new int[n+1];
		
		arr[0] = 0;
		
		//배열을 넣어서 
		for(int i=1;i<=n;i++) {
			arr[i] = arr[i-1]+sc.nextInt();
		}
		
		for(int i=0; i<m;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(arr[b]-arr[a-1]);
		}
		
		sc.close();
	}
}
