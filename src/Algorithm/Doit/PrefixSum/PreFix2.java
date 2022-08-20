package Algorithm.Doit.PrefixSum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PreFix2 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		//이차원 배열의 수
		int n = Integer.parseInt(st.nextToken());
		//질의수
		int quest = Integer.parseInt(st.nextToken());
		
		int[][]A = new int[n+1][n+1];
		
		for(int i=1;i<=n;i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j = 1; j<=n;j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int D[][] = new int[n+1][n+1];
		
		for(int i=1; i<= n;i++) {
			for(int j = 1; j<=n; j++) {
				D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] +A[i][j];
			}
		}
		
		for(int i=0; i<quest;i++) {
			st = new StringTokenizer(bf.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int result = D[x2][y2] - D[x1 - 1][y2] - D[x2][y1-1] + D[x1-1][y1-1];
			System.out.println(result);
		}
	}
}
