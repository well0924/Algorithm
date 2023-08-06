package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class ConST {
	 
	public int solution(String my_string) {
	        int answer = 0;
	        String str = my_string
	            .replaceAll("[^0-9]","");
	        String[]strArr = new String[str.length()];    
	        strArr = str.split("");
	        
	        for(int i=0;i<strArr.length;i++){
	            answer += Integer.parseInt(strArr[i]);
	        }
	        return answer;
    }
	 
	public static void main(String[] args) {
		int sum = 0;
		String asdd = "aAb1B2cC34oOp";
		String str = asdd.replaceAll("[^0-9]","");
		System.out.println(str);
		String []strArr = new String[str.length()];
		strArr = str.split("");
		System.out.println(Arrays.toString(strArr));
		
		for(int i=0;i<strArr.length;i++) {
			sum += Integer.parseInt(strArr[i]);
		}
		System.out.println(sum);
	}
}
