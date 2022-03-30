package Algorithm.sort;

import java.util.Arrays;

public class SelectSort {
	static void swap(int[]arr,int num1,int num2) {
		int tmp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = tmp;
	}
	
	static void selectSort(int[]arr,int size) {
//		for(int i=0;i<size-1;i++) {
//			int min=i;
//			for(int j=i+1;j<size;j++) {
//				if(arr[j]<arr[min]) {
//					min=j;
//				}
//			}
//			swap(arr, min, i);
		for(int i=0;i<size-1;i++) {
			int  min = i;
			for(int j=i+1; j<size; j++) {
				if(arr[j]<arr[min]) {
					min =j;
				}
			}
			swap(arr,min,i);
			System.out.println(Arrays.toString(arr));
			System.out.println("회전:"+i);
		}
	}
	public static void main(String[] args) {
		int[] number = {5,2,1,3,4,5};
		//선택정렬
		System.out.println("정렬전:"+Arrays.toString(number));
		selectSort(number, number.length);
		System.out.println("정렬후:"+Arrays.toString(number));
		
	}
}
