# 삽입정렬


# 1.개념

- 삽입정렬은 선택한 요소를 그보다 더 앞쪽의 이미 정렬된 배열 부분과 비교하여 알맞은 위치이 '삽입' 하는 작업을 반복하여 정렬

# 2.특징

- 장점

	구현이 쉽다.
	
	선택정렬이나 버블정렬과 같은 O(n2) 알고리즘과 비교하여 빠르고, 안전한 정렬이다.

	대부분의 레코드가 이미 정렬되어있을 경우 매우 효율적일 수 있다
	
- 단점
	
	많은 레코드들의 이동을 포함한다.
	
	레코드 수가 많고 레코드 크기가 클 경우 적합하지 않다.
	
	평균~최악의 경우 시간복잡도 O(n2) 로 인하여 정렬 시간이 오래 걸림.
	
# 3.구현소스


<pre>
<code>
public class InsertSort {
	
	static void swap( int[]arr, int num1, int num2) {
		
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
</code>
</pre>