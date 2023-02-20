package Algorithm.DataStructure.chap11.example;

public class OpenHash <K,V>{
	
	private int size;//해시 테이블의 크기.
	private Node<K,V>[]table;//해시 테이블
	
	class Node<K,V>{

		private K key;
		private V data;
		private Node<K,V>next;//다음 노드에 대한 참조
		
		Node(K key,V data,Node<K,V>next){
			this.key = key;
			this.data = data;
			this.next = next;
		}
		
		K getKey() {
			return key;
		}
		
		V getValue() {
			return data;
		}
		
		//키의 해시값을 반환합니다.
		public int hashCode() {
			return key.hashCode();
		}
	}
	
	public OpenHash(int capacity) {
		try {
	
			table = new Node[capacity];
	
			this.size = capacity;
	
		} catch (Exception e) {
			this.size = 0;
		}
	}
	
	public int hashValue(Object key) {
		return key.hashCode() % size;
	}
	
	public V search(K key) {
	
		int hash = hashValue(key); //검색할 데이터의 해시 값
		
		Node<K,V>p = table[hash];//선택 노드
		
		while(p != null) {
		
			if(p.getKey().equals(key)) {
				return p.getValue();	
			}
			
			p = p.next;
		}
		return null;
	}
	
	//키 값 key,데이터 data를 갖는 요소의 추가
	public int add(K key,V data) {
	
		int hash = hashValue(key);//추가할 데이터의 해시 값
	
		Node<K,V>p = table[hash];//선택 노드
		
		while(p != null) {
			if(p.getKey().equals(key)) {
				return 1;
			}
			p= p.next;
		}
	
		Node<K,V>temp = new Node<K,V>(key,data,table[hash]);
	
		table[hash] = temp;
		return 0;
	}
	
	public int remove(K key) {
		
		int hash = hashValue(key);
	
		Node<K,V>p = table[hash];//선택 노드
		
		Node<K,V>pp = null;//바로 앞의 선택 노드
		
		while(p != null) {
	
			if(p.getKey().equals(key)) {
	
				if(pp == null) {
					table[hash] =p.next;
				}else {
					pp.next = p.next;
				}
				return 0;
			}
			pp =p;
	
			p= p.next;
		}
		return 1; //그 키 값은 없습니다.
	}
	
	public void dump() {
		
		for(int i=0;i<size;i++) {
			
			Node<K,V>p = table[i];
			
			System.out.printf("%02d  ", i);
			
			while(p != null) {
			
				System.out.printf("-> %s (%s)   ",p.getKey(), p.getValue());
			
				p = p.next;
			}
			
			System.out.println();
		}
	}
}
