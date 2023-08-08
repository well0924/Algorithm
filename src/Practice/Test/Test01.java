package Practice.Test;

import java.util.stream.IntStream;

public class Test01 {
	public static void main(String[] args) {
		//람다,스트림을 활용해서 구구단을 작성하시오.
		
		//단순 for문을 활용
		for(int i =1;i<=9;i++) {
			for(int j = 1;j<=9;j++) {
				System.out.println( i+"*"+j+ "="+i*j);
			}
			System.out.println();
		}
		
		//스트림을 활용해서 구구단 출력
		IntStream.rangeClosed(2, 9)
		.forEach(x->IntStream.rangeClosed(1, 9)
				.forEach(
						y->System.out.println(x+"*"+y+"="+x*y)
						)
				);
		
	}
}
