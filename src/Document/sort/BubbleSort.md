# 버블 정렬 

# 1.개념
	
- 버블정렬은 서로 인접한 두 원소를 검사하여 정렬하는 알고리즘

# 2.특징

- 장점  

      구현이 쉽다.


- 단점 
      
      최선이든 최악이든 시간복잡도 O(n2) 로 인하여 정렬 시간이 오래 걸린다. 따라서, 효율적인 정렬방법으로 사용되지 않음.
        
        
      하나의 요소가 끝에서 끝으로 이동하기 위해서 배열의 모든 다른 요소들과 교환되어야 한다.


      특정 요소가 최종 정렬 위치에 이미 있는 경우라도 교환되는 일이 발생한다.

# 3.구현

<pre>
<code>
public class Main{

	static void swap(int[]arr,int num1,int num2) {
		int tmp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = tmp;
	}
	
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
	
	public static void main(String[] args)throws Exception{
		//버블정렬
		int[]numbers = {7,10,2,9,4,6};
		System.out.println(Arrays.toString(numbers));
		System.out.println();
		Sort(numbers);
		System.out.println();
		System.out.println(Arrays.toString(numbers));		
	}
}

</code>
</pre>