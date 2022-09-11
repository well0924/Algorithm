# BFS  

# 1. 그래프 완전탐색기법 중 하나

> 그래프 완전 탐색
 
> 시작 정점으로부터 가까운 정점을 먼저 방문하고 멀리 떨어져 있는 정점을 나중에 방문하는 순회하는 방법이다.	

# 1-1. 기능
	
>* __큐를 사용__
	
# 1-2.특징

>1.노드는 다시 방문하지 않으므로 방문한 노드를 체크하기 위한
배열이 필요 

>2.시작할 노드를 정한 뒤 사용할 자료구조를 초기화하기

>3.큐에서 노드를 꺼낸 후 꺼낸 노드의 인접 노드를 다시 큐에 삽입을 하기.

>4.큐 자료구조에 값이 없을 때까지 반복하기.

# 1-3.코드 구현

<pre>
<code>
public class BFSSample01 {
	public static void main(String[] args) {
		int[][]graph = {{},{2,3,8},{1,6,8},{1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
		
		boolean[]visited = new boolean[9];
		
		System.out.println(bfs(1,graph,visited));
	}
	
	public static String bfs(int start, int[][]graph,boolean[]visited) {
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer>q = new LinkedList<Integer>();
		
		q.offer(start);
		
		visited[start] = true;
		
		while(!q.isEmpty()) {
			int nodeIndex = q.poll();
			sb.append(nodeIndex + " -> ");

			for(int i=0; i<graph[nodeIndex].length; i++) {

				int temp = graph[nodeIndex][i];

				if(!visited[temp]) {
					visited[temp] = true;
					q.offer(temp);
				}
			}
		}
		return sb.toString();
	}
} 
</code>
</pre>