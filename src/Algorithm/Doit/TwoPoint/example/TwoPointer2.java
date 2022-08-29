package Algorithm.Doit.TwoPoint.example;

import java.util.Arrays;

public class TwoPointer2 {
	public static void main(String[] args) {
		//케이스2
		//양쪽에서 시작을 할때
		int n = 5;
		int[]arr = new int[] {-99,-2,-1,4,6};
		
		//오름차순으로 정렬
		Arrays.sort(arr);
		
		int[]res = new int[2];
		
		//l,f 투 포인터가 각 양쪽 끝에서 가운데 방향으로 탐색
		int l = 0;
		int r = n-1;
		int min = Integer.MIN_VALUE;
		
		while(l < r) {
			int sum = arr[l] + arr[r];
			
			if(min > Math.abs(sum)) {
				min = Math.abs(sum);
				
				res[0] = arr[l];
				res[1] = arr[r];
				
				if(sum ==0) {
					break;
				}
			}
			
			if(sum < 0) {
				l++;
			}else {
				r--;
			}
		}
		System.out.println(res[0]+" "+res[1]);
	}
}
