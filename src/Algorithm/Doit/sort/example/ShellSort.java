package Algorithm.Doit.sort.example;

import java.util.Arrays;

public class ShellSort {
	static void shellSort(int[]arr) {
		for(int i=arr.length/2;i>0;i/=2) {
			for(int j =i;j<arr.length;j++) {
				int idx= j-i;
				int tmp = arr[j];
				
				while((idx>=0)&&(arr[idx]>tmp)) {
					arr[idx +i] = arr[idx];
					idx -= i;
				}
				arr[idx +i] =tmp;
			}
		}
	}
	
	public static void main(String[] args) {
		int []arr = {3,1,2,6,7,5,4};
		shellSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
