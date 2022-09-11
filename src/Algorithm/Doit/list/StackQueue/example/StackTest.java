package Algorithm.Doit.list.StackQueue.example;

import java.util.Scanner;

public class StackTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StackSample01 s = new StackSample01(64);//최대 64개까지 푸시할수 있는 스택
		
		while(true) {
			System.out.println("현재 데이터의 수:"+s.size()+"/"+s.capacity());
			System.out.println("(1)푸시 (2)팝 (3)피크 (4)덤프 (0)종료:");
			
			int num = sc.nextInt();
			//종료를 누르면 종료
			if(num ==0) break;
			
			int x;
			switch(num) {
				case 1: System.out.print("데이터:");
						x= sc.nextInt();
						try {
							s.push(x);
						} catch (StackSample01.OverflowIntStackException e) {
							e.printStackTrace();
						}
						break;
				case 2:
						try {
							x = s.pop();
							System.out.println("팝한 데이터는"+x+"입니다.");
						} catch (StackSample01.OverflowIntStackException e) {
							e.printStackTrace();
						}
						break;
				case 3:
						try {
							x = s.peek();
							System.out.println("픽한 데이터는"+x+"입니다.");
						} catch (StackSample01.EmptyIntStackException e) {
							e.printStackTrace();
							System.out.println("스택이 비어 있습니다.");
						}
						break;
				case 4:
					   s.dump();
					   break;
			}
		}
		sc.close();
	}
}
