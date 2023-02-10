package Algorithm.DoitCodingTest.TwoPoint.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Fine {
	public static void main(String[] args) throws Exception{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		int result = 0;
		
		long[]A = new long[n];
		
		StringTokenizer st  = new StringTokenizer(bf.readLine());
		
		for(int i = 0; i< n ; i++) {
			A[i] = Long.parseLong(st.nextToken());
		}
		//오름차순으로 정렬
		Arrays.sort(A);
		
		for(int i=0;i<n;i++) {
			
			long find = A[i];
			int m =0;
			int j = n - 1;
			
			while(m<j) {
				
				if(A[m]+A[j]==find) {
					
					if(m != i && j != i) {
						result++;
						break;
					
					}else if(m == i) {
						m++;
					
					}else if(j == i) {
						j--;
					
					}
				}else if(A[m] + A[j] <find) {
					m++;
				
				}else {
					j--;
				
				}
			}
		}
		System.out.println(result);
		bf.close();
	}
}
