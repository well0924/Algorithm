package Algorithm.sort;

import java.util.Arrays;

public class MergeSort {
	
	static int[] buff;
	
	static void mergeSort(int[]arr) {
		buff = new int[arr.length];
		mergeSort(arr, 0, arr.length-1);
	}
	
	static void mergeSort(int[]arr,int left, int right) {
		if(left<right) {
			int center = left + (right-left)/2;
			mergeSort(arr, left, center);
			mergeSort(arr, center+1,right);
			merge(arr,left, center, right);
		}
	}
	
	static void merge(int[]arr, int left,int center,int right) {
		int p =0;
		int j=0;
		int k = left;
		int i;
		for(i=left;i<=center;i++) {
			buff[p++] = arr[i];
		}
		
		while(i<=right && j<p) {
			arr[k++] = (buff[j]<=arr[i])? buff[j++] :arr[i++];
		}
		
		while(j<p) {
			arr[k++] = buff[j++];
		}
	}
	
	public static void main(String[] args) {
		int [] arr = {3,1,2,6,7,4};
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
