# 알고리즘(DFS)

#1.dfs

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



# 1-3.코드 구현



#2.bfs


