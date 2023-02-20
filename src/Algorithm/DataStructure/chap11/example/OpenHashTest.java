package Algorithm.DataStructure.chap11.example;

import java.util.Scanner;

public class OpenHashTest {

	static Scanner sc = new Scanner(System.in);
	
	static class Data{

		static final int NO = 1; //번호를 입력 받았습니까?
		static final int NAME= 2;//이름을 입력 받았습니까?
		
		private Integer no;
		private String name;
		
		Integer keyCode() {
			return no;
		}
		
		public String toString() {
			return name;
		}
		
		void scanData(String guide,int sw) {
			System.out.println(guide +"할 데이터를 입력하세요");
	
			if((sw&NO)==NO) {
				System.out.println("번호:");
				no = sc.nextInt();
			}
			
			if((sw&NAME)==NAME) {
				System.out.println("이름:");
				name = sc.next();
			}
		}
	}
	
	//메뉴 열거형
	enum Menu{
	
		ADD("추가"),
		REMOVE("제거"),
		SEARCH("검색"),
		DUMP("표시"),
		TERMINATE("종료");
		
		private final String message;//출력할 문자열
		
		static Menu MeunAt(int idx) {
	
			for(Menu m : Menu.values()) {
	
				if(m.ordinal()==idx) {
					return m;
				}
			}
			
			return null;
		}
		
		Menu(String string){
			message = string;
		}
		
		String geMessage() {
			return message;
		}
	}
	
	static Menu SelectMenu() {
	
		int key;
	
		do {
			for(Menu m : Menu.values()) {
				System.out.printf("(%d)%s ",m.ordinal(),m.geMessage());
			}
		
			System.out.println(":");
		
			key = sc.nextInt();
		
		}while(key < Menu.ADD.ordinal() || key > Menu.TERMINATE.ordinal());
		
		return Menu.MeunAt(key);
	}
	
	public static void main(String[] args) {
		
		Menu menu;//메뉴
		Data data;// 추가용 데이터 참조
		Data temp = new Data();//입력용 데이터
		
		OpenHash<Integer,Data>hash = new OpenHash<Integer,Data>(13);
		
		do {
			switch(menu = SelectMenu()) {
			
			case ADD : 
				data = new Data();
				data.scanData("추가", Data.NO | Data.NAME);
				hash.add(data.keyCode(), data);
				break;
				
			case REMOVE : 
				data = new Data();
				data.scanData("삭제", Data.NO);
				hash.remove(data.keyCode());
				break;
				
			case SEARCH :
				temp.scanData("검색",Data.NO);
				Data t = hash.search(temp.keyCode());
				if(t != null) {
					System.out.println("그 키를 갖는 데이터는"+ t + "입니다.");
				}else {
					System.out.println("그 데이터는 없습니다.");
				}
				break;
				
			case DUMP :
				hash.dump();
				break;
			}
		}while(menu != Menu.TERMINATE);
		
	}
}
