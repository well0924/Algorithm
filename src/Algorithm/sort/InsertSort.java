package Algorithm.sort;

import java.util.Arrays;

public class InsertSort {
	static void swap(int[]arr,int num1, int num2) {
		int tmp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = tmp;
	}
	
	static void InsertSort(int[]arr, int size) {
		for (int end = 1; end < arr.length; end++) {
            int i = end;
            System.out.println(Arrays.toString(arr));
            while (i > 0 && arr[i - 1] > arr[i]) {
            	swap(arr, i - 1, i);
                System.out.println(Arrays.toString(arr));
                i--;
            }
        }
	}
	public static void main(String[] args) {
		//삽입정렬
		int[]numbers = {2,1,5,4,3};
		
		InsertSort(numbers, numbers.length);
		
		for(int output:numbers) {
			System.out.print(output+" ");
		}
	}
}
