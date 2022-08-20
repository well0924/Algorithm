package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
	//백준25304번
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
	        
	    int totalprice = Integer.parseInt(bf.readLine());
	    int count = Integer.parseInt(bf.readLine());
	        
	    for(int i=0; i<count;i++){
	    	
	    	String[]str = bf.readLine().split(" ");
	    	
	    	int price = Integer.parseInt(str[0]);
	    	int quantity = Integer.parseInt(str[1]);
	            
	    	totalprice = totalprice - (price*quantity);
	    }    
	        
        if(totalprice == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
	}
}
