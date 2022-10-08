# Two Point

- 투포인터는 리스트에 순차적으로 접근해야 할 때 두 개의 점의 위치를 기록하면서 처리하는 알고리즘이다.

- 투포인터의 경우에는 2가지 방법이 있다.

- 1)배열의 첫번째 원소와 배열의 마지막 원소에서 시작하는 경우(반대 진행방향)

- 2)둘 다 첫번째 원소에서 시작하는 경우(같은 진행방향)

- 정렬되어있는 두 리스트의 합집합에도 사용됨. 병합정렬(merge sort)의 counquer 영역의 기초가 되기도 합니다.

1번의 경우
<pre>
<code>
	public static void main(String[] args) {
		//case01.두 배열이 동시에 시작하는 경우
		int[]arr = {1,2,3,4,2,5,3,1,1,2};
		
		int n = 10;//배열길이
		
		int m = 5;//구간합
		
		int left = 0;//왼쪽
		int right = 0;//오른쪽
		int sum = 0;//양쪽의 구간합
		int cnt = 0;//횟수
	
		while(true) {
			if(sum >= m) {
				//
				sum -= arr[left++];
			}else if(right == n)
				break;
			else {
				//
				sum += arr[right++];
			}if(sum == m) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}

</code>
</pre>

2번의 경우

<pre>
<code>
public static void main(String[] args) {
		//케이스2
		//양쪽에서 시작을 할때
		int n = 5;
		int[]arr = new int[] {-99,-2,-1,4,6};
		
		//오름차순으로 정렬
		Arrays.sort(arr);
		
		int[]res = new int[2];
		
		//l,f 투 포인터가 각 양쪽 끝에서 가운데 방향으로 탐색
		int l = 0;
		int r = n-1;
		int min = Integer.MIN_VALUE;
		
		while(l < r) {
			int sum = arr[l] + arr[r];
			
			if(min > Math.abs(sum)) {
				min = Math.abs(sum);
				
				res[0] = arr[l];
				res[1] = arr[r];
				
				if(sum ==0) {
					break;
				}
			}
			
			if(sum < 0) {
				l++;
			}else {
				r--;
			}
		}
		System.out.println(res[0]+" "+res[1]);
	}
</code>
</pre>
