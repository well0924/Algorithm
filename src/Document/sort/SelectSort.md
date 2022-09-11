# 선택정렬


#1. 개념

- 선택정렬은 가장 작은 요소부터 선택해 알맞은 위치로 옮겨서 순서대로 정렬하는 알고리즘

#2. 특징

- 장점

	 구현이 쉽다.

    내림차순으로 정렬되어있는 요소를 오름차순으로 재정렬할 때 효율이 좋다.

    비교 횟수는 많지만, 실제로 교환하는 횟수는 적다. 교환이 많이 일어나는 자료상태라면 효율적이다.
    
- 단점

	 서로 떨어져 있는 요소를 교환하기 때문에 안정적이지 않다
	 
	 이미 정렬된 상태에서 소수의 자료가 추가된 후 재정렬 하면 비효율적이다.

	 시간복잡도 O(n2) 로 인하여 정렬 시간이 오래 걸림.
	     
#3. 구현

<pre>
<code>
public class SelectSort {
	
	static void swap(int[]arr,int num1,int num2) {
		int tmp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = tmp;
	}
	
	static void selectSort(int[]arr,int size) {

		for(int i=0;i<size-1;i++) {
			int  min = i;
			for(int j=i+1; j<size; j++) {
				if(arr[j]<arr[min]) {
					min =j;
				}
			}		
			swap(arr,min,i);
		}
		
	}
	public static void main(String[] args) {
		
		int[] number = {5,2,1,3,4,5};

		selectSort(number, number.length);
		
		System.out.println(Arrays.toString(number));
		
	}
}
</code>
</pre>
