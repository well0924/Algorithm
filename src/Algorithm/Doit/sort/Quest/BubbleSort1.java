package Algorithm.Doit.sort.Quest;

import java.util.Scanner;

public class BubbleSort1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		//입력된 수만큼 배열의 길이 맞추기
		int[]ArrNum = new int[num];
		//길이만큼 숫자 넣기.
		for(int i=0;i<num;i++) {
			ArrNum[i] =sc.nextInt();
		}
		
		//버블 정렬시작하기.
		for(int i =0; i<num-1;i++) {
			for(int j =0; j<num-1-i;j++) {
				if(ArrNum[j]>ArrNum[j+1]) {
					int tmpnum = ArrNum[j];
					ArrNum[j] = ArrNum[j+1];
					ArrNum[j+1] = tmpnum;
				}
			}
		}
		//정렬후 반복문으로 출력하기.
		for(int i =0; i< num;i++) {
			System.out.print(ArrNum[i]);
		}
		
		sc.close();
	}
}
