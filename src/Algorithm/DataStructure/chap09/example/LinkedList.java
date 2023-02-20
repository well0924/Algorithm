package Algorithm.DataStructure.chap09.example;

import java.util.Comparator;

public class LinkedList<E> {
	class Node<E>{
		private E data;//데이터
		private Node<E>next;//뒤쪽 포인터
		
		Node(E data,Node<E>next){
			this.data = data;
			this.next = next;
		}
		
	}
	private Node<E>head;//머리 노드
	private Node<E>crnt;//선택노드
	
	public LinkedList() {
		head = crnt = null;
	}
	
	public E search(E obj,Comparator<? super E>c) {
		Node<E>ptr = head;
		
		while(ptr != null) {//검색 성공
			if(c.compare(obj, ptr.data)==0) {
				crnt = ptr;
				return ptr.data;
			}
			ptr = ptr.next;//검색 후 다음 노드를 선택
		}
		//검색 실패시 
		return null;
	}
	
	public void addFirst(E obj) {
		Node<E>ptr = head;//삽입전의 머리 노드
		head = crnt = new Node<E>(obj,ptr);
	}
	
	public void addLast(E obj) {
		if(head == null) {
			addFirst(obj);
		}else {
			Node<E>ptr = head;
			while(ptr.next != null) {
				ptr = ptr.next;
			}
			ptr.next = crnt= new Node<E>(obj,null);
		}
	}
	
	public void removeFirst() {
		if(head != null) {//리스트가 비어있지 않으면
			head = crnt = head.next;
		}
	}
	
	public void removeLast() {
		if(head != null) {
			if(head.next == null) {
				removeFirst();
			}else {
				Node<E>ptr = head;//스캔 중인 노드
				Node<E>pre = head;//스캔 중인 노드의 앞쪽 노드
				
				while(ptr.next != null) {
					pre = ptr;
					ptr = ptr.next;
				}
				pre.next = null;//pr는 삭제 후의 꼬리노드
				crnt = pre;
			}
		}
	}
	
	public void remove(Node<E> p) {
		if(head != null) {
			if(p == head) {
				removeFirst();
			}else {
				Node<E>ptr = head;
				
				while(ptr.next != p) {
					ptr = ptr.next;
					if(ptr == null) {
						return;//p가 리스트에 있습니다.
					}
				}
				ptr.next = p.next;
				crnt =ptr;
			}
		}
	}
	
	public void removeCurrentNode() {
		remove(crnt);
	}
	
	public void clear() {
		while(head != null) {
			removeFirst();	
		}
		crnt = null;
	}
	
	public boolean next() {
		if(crnt == null || crnt.next == null) {
			return false;
		}
		crnt = crnt.next;
		return true;
	}
	
	public void printCurrentNode() {
		if(crnt == null) {
			System.out.println("선택한 노드가 없습니다.");
		}else {
			System.out.println(crnt.data);
		}
	}
	
	public void dump() {
		Node<E>ptr = head;
		while(ptr!=null){
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
	
}
