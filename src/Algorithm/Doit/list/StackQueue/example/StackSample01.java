package Algorithm.Doit.list.StackQueue.example;

public class StackSample01 {

	private int max;//스택용량
	private int ptr;//스택 포인터
	private int[] stk;//스택본체
	
	public class EmptyIntStackException extends RuntimeException{
		private static final long serialVersionUID = 1L;

		public EmptyIntStackException() {};
	}
	
	public class OverflowIntStackException extends RuntimeException{
		private static final long serialVersionUID = 1L;

		public OverflowIntStackException() {}
	}
	
	public StackSample01(int capacity) {
		ptr = 0;
		max = capacity;

		try {
			stk= new int[max];//스택 본체용 배열을 생성
		} catch (Exception e) {			
			max =0;
		}
	}
	
	public int push(int x)throws OverflowIntStackException{
		
		if(ptr >= max) {
			throw new OverflowIntStackException();
		}
		
		return stk[ptr++] =x;
	}
	
	public int pop()throws EmptyIntStackException{
		
		if(ptr <=0) {
			throw new EmptyIntStackException();
		}	
		
		return stk[--ptr];	
	}
	
	public int peek()throws EmptyIntStackException{
		
		if(ptr <=0) {
			throw new EmptyIntStackException();
		}
		
		return stk[ptr-1];
	}
	
	public int indexOf(int x) {
		
		for(int i=ptr-1;i>=0;i--) {
			
			if(stk[i]==x) {
				return i;
			}
		}
		
		return -1;
	}
	
	public void clear() {
		
		ptr = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return ptr;
	}
	
	public boolean isEmpty() {
		return ptr <=0;
	}
	
	public boolean isFull() {
		return ptr >= max;
	}
	
	public void dump() {
		if(ptr <=0) {
			System.out.println("스택이 비어 있습니다.");
		}else {
			
			for(int i=0;i<ptr;i++) {
				System.out.print(stk[i]+" ");
				System.out.println();
			}
		}
	}
}
