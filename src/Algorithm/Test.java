package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	
	public static void swap(int[]arr,int num1,int num2) {
		int tmp = arr[num1];
		
		arr[num1] = arr[num2];
		arr[num2] = tmp;
	}
	
	
	public static void BubbleSort(int[]arr, int size) {
		for(int i =0; i< size-1 ; i++) {
			for(int j=0;j<size-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	public static void sort(int[]arr) {
		BubbleSort(arr, arr.length);
	}
	
	public static void main(String[] args) {
		
		int[]numbers = {4,3,20,5,8};
	}
}
