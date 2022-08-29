package Algorithm.Doit.TwoPoint.example;

public class TwoPointer {
	//투 포인터
	//두 배열에서 검색시 쉽고 효율적인 방법으로 사용할때 
	//1.배열의 첫번째 원소와 배열의 마지막 원소에서 시작하는 경우(반대 진행방향)
	//2.둘 다 첫번째 원소에서 시작하는 경우(같은 진행방향)
	
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
}
