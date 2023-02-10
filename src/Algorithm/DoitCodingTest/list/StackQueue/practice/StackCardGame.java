package Algorithm.DoitCodingTest.list.StackQueue.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackCardGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer>myQueue = new LinkedList<>();
		
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {//카드를 큐에 저장하기.
			myQueue.add(i);
		}
		
		while(myQueue.size()>1) {//카드가 1장이 남을때까지
			myQueue.poll();//맨위의 카드를 버림
			myQueue.add(myQueue.poll());//맨 위의 카드를 가장 아래 카드 밑으로 이동
		}
		System.out.println(myQueue.poll());//마지막 카드 출력
		sc.close();
	}
}
