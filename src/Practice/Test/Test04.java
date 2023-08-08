package Practice.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test04 {
	
	public static void main(String[] args) {
		//list에 들어가 있는 목록에 .java를 붙일 것.
		List<String>list = Arrays.asList("sample01","sample02","sample03","sample04");
		
		List<String> result=list.stream()
				.map(x->x+".java")
				.collect(Collectors.toList());
		
		System.out.println(result);
		
	}
}
