package Algorithm.DataStructure.chap09;

import java.util.Comparator;

public class DblLinkedList<E> {
	class Node<E>{
		
		private E data;
		
		private Node<E>prev;
		
		private Node<E>next;
		
		//생성자
		Node(){
			data = null;
			prev=next=this;
		}
		
		//생성자
		Node(E obj,Node<E>prev,Node<E>next){
			data = obj;
			this.prev = prev;
			this.next = next;
		}
	}
	
	private Node<E>head;//머리노드
	
	private Node<E>crnt;//선택노드
	
	public DblLinkedList(){
		head = crnt = new Node<E>();
	}
	
	public boolean isEmpty() {
		return head.next == head;
	}
	
	public E search(E obj,Comparator<? super E>c) {
		Node<E>ptr = head.next;
		
		while(ptr != head) {
			if(c.compare(obj, ptr.data)==0) {
				crnt = ptr;
				return ptr.data;
			}
			ptr = ptr.next;
		}
		return null;
	}
	
	public void printCurrentNode() {
		if(isEmpty()) {
			System.out.println("선택 노드가 없습니다.");
		}else{
			System.out.println(crnt.data);
		}
	}
	
	public void dump() {
		Node<E>ptr = head.next;
		
		while(ptr != head) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
	
	public void dumpReverse() {
		Node<E>ptr = head.prev;
		
		while(ptr!= head) {
			System.out.println(ptr.data);
			ptr = ptr.prev;
		}
	}
	
	public boolean next() {
		if(isEmpty()||crnt.next==head) {
			return false;
		}
		crnt = crnt.next;
		return true;
	}
	
	public boolean prev() {
		if(isEmpty()||crnt.prev == head) {
			return false;
		}
		crnt = crnt.next;
		return true;
	}
	
	public void add(E obj) {
		Node<E>node = new Node<E>(obj,crnt,crnt.next);
		crnt.next = crnt.next.prev = node;
		crnt = node;
	}
	
	public void addFirst(E obj) {
		crnt = head;
		add(obj);
	}
	
	public void addLast(E obj) {
		crnt = head.prev;
		add(obj);
	}
	
	public void removeCurrentNode() {
		if(!isEmpty()) {
			crnt.prev.next = crnt.next;
			crnt.next.prev = crnt.prev;
			crnt = crnt.prev;
			
			if(crnt == head) {
				crnt = head.next;
			}
		}
	}
	
	public void remove(Node p) {
		Node<E>ptr = head.next;
		
		while(ptr!=head) {
			if(ptr ==p) {
				crnt = p;
				removeCurrentNode();
				break;
			}
			ptr= ptr.next;
		}
	}
	
	public void removeFirst() {
		crnt = head.next;
		removeCurrentNode();
	}
	
	public void removeLast() {
		crnt = head.prev;
		removeCurrentNode();
	}
	
	public void clear() {
		while(!isEmpty()) {
			removeFirst();
		}
	}
}
