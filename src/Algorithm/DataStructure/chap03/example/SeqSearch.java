package Algorithm.DataStructure.chap03.example;

import java.util.Scanner;

public class SeqSearch {
	//요솟수가 n인 배열에 key와 같은 요소를 선형 검색합니다.
	static int seqSearch(int[]a,int n,int key) {
		int i=0;
		while(true) {
			if(i == n) {
				return -1;//검색 실패
			}
			if(a[i]== key) {//검색에 성공을 한경우 인덱스를 반환한다.
				return i;
			}
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요솟수:");
		
		int num = sc.nextInt();
		int[]x = new int[num];
		
		for(int i = 0; i<num;i++) {
			System.out.print("["+i+"]:");
			x[i]= sc.nextInt();
		}
		
		System.out.println("검색할 값:");
		int key = sc.nextInt();
		
		int idx = seqSearch(x, num, key);
		
		if(idx ==-1) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println(key+"은(는) x["+idx+"]에 있습니다.");
		}
	}
}
