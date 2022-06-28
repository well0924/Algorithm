package Algorithm.Doit.PrefixSum;

import java.util.Scanner;

public class Sum2 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		long[]s = new long[n];
		long[]c = new long[m];
		
		long ans = 0;
		
		s[0] = sc.nextInt();
		
		for(int i=1; i<n;i++) {//수열 합 만들기.
			s[i] = s[i-1]+sc.nextInt();
		}
		
		for(int i=0; i<n;i++) {
			int reminder = (int)(s[i] % m);
			if(reminder == 0) ans++;
			c[reminder]++;
		}
		
		for(int i=0;i<m;i++) {
			if(c[i]>1) {
				ans = ans +(c[i]*(c[i]-1)/2);
			}
		}
		System.out.println(ans);
	}
}
