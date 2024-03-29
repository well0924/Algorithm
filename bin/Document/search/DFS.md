# DFS

#1. 그래프 완전탐색기법 중 하나

>그래프 완전탐색기법 중 하나. 

>그래프의 시작 노드에서 출발하여 탐색할 한 쪽 분기를 정하여 최대 깊이까지 탐색을 마친 후

>다른 쪽 분기로 이동하여 다시 탐색을 수행하는 알고리즘

# 1-1.기능
>* __그래프 완전 탐색__
>* __재귀함수/스택자료구조로 구현__



# 1-2.특징 

>방문한 노드를 다시 방문하면 안되므로 노드 방문 여부를 체크할 배열(중요!)이 
필요하고,

>그래프는 인접 리스트로 표현, 그리고 dfs의 탐색 방식은 후입선출
특징을 가지고 있으므로 스택을 사용한다.

>검색속도 자체는 bfs에 비해서 느리다.

>1.시작할 노드를 정한 후 사용할 자료구조 초기화하기
인접 리스트로 그래프 표현,->방문 배열 초기화하기,->시작 노드 스택에 삽입

>2.스택에서 노드를 꺼낸 후 꺼낸 노드의 인접 노드를 다시 스택에 삽입하기
pop()을 수행해서 노드를 꺼낸다->꺼낸 노드를 탐색 순서에 기입하고 
인접 리스트의 인접 노드를 스택에 삽입하여 방문배열을 체크

>3.스택자료구조에 값이 없을때까지 반복하기.

>문제->단절점 찾기,단절선 찾기,사이클찾기,위상 정렬


# 1-3.코드 구현


<pre>
<code>
public class DFSsample {
	public static void dfs(int[]numbers, int idx,boolean[]visit) {
		visit[idx] = true;
		
		for(int i : numbers) {
			if(!visit[i]) {
				dfs(numbers,idx,visit);
			}
		}
	}
	public static void main(String[] args) {
		int[]numbers = {1,2,3,4,5};
		boolean[]visit = {false,false,false,false,false,};
		
		dfs(numbers,0,visit);
		
		System.out.println();
	}
}
</code>
</pre>

