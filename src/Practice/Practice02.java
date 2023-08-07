package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice02 {
	//추가적으로 스트림에 관련된 메서드 공부하기.
	//참고한 블로그:https://p829911.tistory.com/21
	public static void main(String[] args) {
		 String[] alphabetList = new String[]{"ABCAAC","AABBCC","CCCCCC","CCBBAA","CCCAAA"};

		    // 1. alphabetList 각각의 스트링에 있는 고유한 알파벳 개수가 들어있는 
		    // List<Long> 형태의 배열을 반환하시오.
		 	Arrays.stream(alphabetList).map(s->Arrays.stream(s.split("")).distinct().count()).collect(Collectors.toList()).forEach(System.out::println);
		    //System.out.println("Question.01:"+result1);
		    
		    // 2. alphabetList 각각의 스트링에 대해 알파벳을 키로, 
		    // 키에 해당하는 알파벳 개수를 값으로 하는
		    // List<Map<String, Long>> 형태의 배열을 반환하시오.
		    List<Map<String, Long>> answer2 = Arrays.stream(alphabetList)
		    		.map(s->
		    				Arrays.stream(s.split(""))
		    				.collect(
		    						Collectors
		    							.groupingBy(
		    									Function.identity(),Collectors.counting())))
		    		.collect(Collectors.toList());
		    System.out.println(answer2);		

		    // 3. alphabetList 각각의 스트링에 대해 알파벳을 키로, 
		    // 키에 해당하는 알파벳의 index 배열을 값으로 하는
		    // List<Map<String, List<Integer>>> 형태의 배열을 반환하시오.
		    List<Map<String, List<Integer>>> answer3 = Arrays.stream(alphabetList)
		    	    .map(s -> s.split(""))
		    	    .map(s -> IntStream.range(0, s.length)
		    	        .boxed()
		    	        .collect(Collectors.groupingBy(i -> s[i])))
		    	    .collect(Collectors.toList());
		    
		    System.out.println(answer3);
	}
}
