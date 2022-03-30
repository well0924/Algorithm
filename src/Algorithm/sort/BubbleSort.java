package Algorithm.sort;

import java.util.Arrays;

public class BubbleSort {
	
	static void swap(int[]arr,int num1,int num2) {
		int tmp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = tmp;
	}
	//
	static void bubleSort(int[]arr, int size) {
		
		for(int i=0;i<size-1;i++) {
			for(int j =0 ;j<size-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	static void Sort(int[]arr) {
		bubleSort(arr, arr.length);
	}
	
	public static void main(String[] args) {
		//버블정렬
		int[]numbers = {7,10,2,9,4,6};
		System.out.println(Arrays.toString(numbers));
		System.out.println();
		Sort(numbers);
		System.out.println();
		System.out.println(Arrays.toString(numbers));
	}
}
