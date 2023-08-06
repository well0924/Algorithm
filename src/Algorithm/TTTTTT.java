package Algorithm;

public class TTTTTT {
	public static void main(String[] args) {
		int[]numbers = {1,2,3,4,5,6,7};
		int max =0;
		int[]answer = {};
		
		for(int i=0;i<numbers.length;i++) {
			max=numbers[i]*2;
			for(int j = 0; j<numbers.length;j++) {
				answer = numbers;
				System.out.println(answer.toString());
			}
			System.out.println(max);
	//		System.out.print(numbers);
		}
		System.out.println(max);
	}
}
