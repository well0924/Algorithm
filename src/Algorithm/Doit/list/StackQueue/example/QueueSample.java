package Algorithm.Doit.list.StackQueue.example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSample {
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		//객체 삽입
		queue.offer(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		
		//head에 위치한 객체 리턴
		queue.peek();
		System.out.println(queue);
		queue.element();
		System.out.println(queue);
		//주어진 객체를 삭제
		queue.poll();
		System.out.println(queue);
		queue.remove(3);
		
		System.out.println(queue);
	}
}
