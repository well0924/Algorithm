package Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import Practice.Domain.Trader;
import Practice.Domain.Transaction;

public class Practice01 {
	//참고한 블로그
	//https://p829911.tistory.com/21
	public static void main(String[] args) {
			
			Trader raoul = new Trader("Raoul", "Cambridge");
	        Trader mario = new Trader("Mario", "Milan");
	        Trader alan = new Trader("Alan", "Cambridge");
	        Trader brian = new Trader("Brian", "Cambridge");

	        List<Transaction> transactions = Arrays.asList(
	            new Transaction(brian, 2011, 300),
	            new Transaction(raoul, 2012, 1000),
	            new Transaction(raoul, 2011, 400),
	            new Transaction(mario, 2012, 710),
	            new Transaction(mario, 2012, 700),
	            new Transaction(alan, 2012, 950)
	        );
	        
	        // 1. 2011년에 일어난 모든 트랜잭션을 찾아 값을 오름차순으로 정렬하시오.
	        // CODE

	        transactions.stream()
	        .filter(t->t.getYear()==2011)
	        .map(Transaction::getValue)
	        .sorted()
	        .forEach(t->System.out.println("Question.01::"+t));
	        
	        // 2. 2011년에 일어난 모든 트랜잭션을 찾아 값을 기준으로 오름차순으로 정렬하시오.
	        // CODE
	        
	        transactions.stream()
	        .filter(t->t.getYear()==2011)
	        .sorted(Comparator.comparing(Transaction::getValue))
	        .forEach(t->System.out.println("Question.02:"+t));
	        
	        // 3. 거래자가 근무하는 모든 도시를 중복 없이 나열하시오.
	        // CODE

	        List<String>result = transactions.stream()
	        .map(Transaction::getTrader)
	        .map(Trader::getCITY)
	        .distinct().collect(Collectors.toList());
	        
	        System.out.println("Question.03:"+result);
	        
	        Set<String>result2=transactions
	        .stream()
	        .map(Transaction::getTrader)
	        .map(Trader::getCITY)
	        .distinct()
	        .collect(Collectors.toSet());
	        
	        System.out.println("Question.03::"+result2);
	        
	        // 4. 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오.
	        // CODE
	        
	        transactions
	        .stream()
	        .filter(t->t.getTrader().getCITY().equalsIgnoreCase("cambridge"))
	        .map(Transaction::getTrader)
	        .sorted(Comparator.comparing(Trader::getName))
	        .forEach(t->System.out.println("Question.04:"+t));
	        
	        // 5. 모든 거래자의 이름을 알파벳 역순으로 정렬해서 반환하시오.
	        // CODE
	        
	        List<String>result5=transactions
	        .stream()
	        .map(Transaction::getTrader)
	        .map(Trader::getName)
	        .sorted(Comparator.reverseOrder())
	        .collect(Collectors.toList());
	        System.out.println("Question.05:"+result5);
	        
	        // 6. 밀라노에 거래자가 있는가?
	        // CODE
	        boolean result6 = transactions.stream()
	        		.anyMatch(t->t.getTrader().getCITY().equalsIgnoreCase("milan"));
	        
	        System.out.println("Question.06:"+result6);
	        
	        transactions
	        .stream()
	        .filter(t->t.getTrader().getCITY().equalsIgnoreCase("milan"))
	        .forEach(t->System.out.println("Question.06:"+t));
	        
	        // 7. 케임브리지에 거주하는 거래자의 모든 트랜잭션 값을 출력하시오.
	        // CODE
	        List<Integer>result07=transactions.stream()
	        .filter(t->t.getTrader().getCITY().equalsIgnoreCase("cambridge"))
	        .map(Transaction::getValue).collect(Collectors.toList());
	        System.out.println("Question07:"+result07);
	        
	        // 8. 전체 트랜잭션 중 최댓값은 얼마인가?
	        // CODE
	        int result08= transactions.stream().max(Comparator.comparing(Transaction::getValue)).get().getValue();
	        System.out.println("Question.08:"+result08);
	        
	        Map<Object,Object>result8= transactions.stream().collect(Collectors.toMap(Function.identity(),Transaction::getTrader));
	        System.out.println(result8);
	        
	        transactions.stream().map(t->t.getTrader()+" "+t.getValue()).forEach(t->System.out.println(t));
	}
}
