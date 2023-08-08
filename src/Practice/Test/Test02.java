package Practice.Test;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		//가지고 있는 돈
		int myMoney = 500000;
		//장을 볼 목록
		int[]itemsList= {20000, 5000, 10000, 200000, 100000, 50000, 10000, 2000, 3500, 50000};
		
		int result= Arrays.stream(itemsList).reduce(myMoney, (a,b)-> a-b);
		
		System.out.println("거스름돈:" + result);
	}
}
