package Algorithm.Doit.sort.example;

import java.util.Arrays;

public class InsertSort {
	
	static void swap(int[]arr,int num1, int num2) {
		int tmp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = tmp;
	}
	
	public static void InsertSorts(int[]arr, int size) {
		for (int end = 1; end < arr.length; end++) {
            int i = end;
            while (i > 0 && arr[i - 1] > arr[i]) {
            	System.out.println(Arrays.toString(arr));
            	swap(arr, i - 1, i);
                i--;
            }
        }
	}
	
	public static void main(String[] args) {
		//삽입정렬
		int[]numbers = {3,1,2,6,7,5,4};
		
		InsertSorts(numbers, numbers.length);
		
		for(int output:numbers) {
			System.out.print(output+" ");
		}
	}
}
