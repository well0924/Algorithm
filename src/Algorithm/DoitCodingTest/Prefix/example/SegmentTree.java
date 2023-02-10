package Algorithm.DoitCodingTest.Prefix.example;

public class SegmentTree {
	
	long tree[];
	int treeSize;
	
	public SegmentTree(int arrSize) {
		//tree의 높이는 전체 배열 개수를 log화  한것
		//ledf는 n개이고, 전체 개수는 각 leaf를 더한 개수도 포함해야 하므로
		//java의 log는 자연로그 함수이므로 log(2)를 통해 나누어 log2로 나누는 효과를 구함.
		int h = (int)Math.ceil(Math.log(arrSize)/Math.log(2));
		
		//Tree에 들어가는 Node의 개수는 2의 높이+1 제곱의 미만 개이다.
		this.treeSize = (int)Math.pow(2, h+1);
		tree = new long[treeSize];
	}
	
	//최초 Segment Tree를 구성하는 메소드
	public long init(long[]arr,int node,int start,int end) {
		//만약 start == end라면 leaf 노드라는 의미
		//즉, 배열의 값을 그대로 저장함.
		if(start == end) {
			return tree[node]= arr[start];
		}
		//위에서 return 을 못했다면 start != end 
		//그렇다면 좌측 노드와 우측노드의 합으로 구해짐
		//좌측 노드의 idx는 *2 이며 우측은 *2+1이 된다.
		return tree[node] = 
				init(arr,node*2,start,(start+end)/2)+
				init(arr,node*2+1,(start+end)/2+1,end);
	}
	
	//Segment Tree 내 값이 변경되는 경우
	public void update(int node,int start, int end, int idx,long diff) {
		//만약 변경할 index 값이 범위 밖이면 해당 tree는 확인 불필요
		if(idx < start || end < idx) {
			return;
		}
		//변경된 차이만큼을 영향 받는 각 node에 더해줌
		tree[node] += diff;
		//leaf노드에 다다라야 값을 바꿀 수 있으므로 지속 진행
		if(start != end) {
			update(node*2,start,(start+end)/2,idx,diff);
			update(node*2+1,(start+end)/2+1,end,idx,diff);
		}
	}
	
	//구하고자 하는 덧셉을 진행
	public long sum(int node, int start, int end, int left, int right) {
		//범위를 벗어나게 되는 경우 더할 필요 없음
		if(left > end || right < start) {
			return 0;
		}
		//범위 내 완전히 포함 시에는 더 내려가지 않고 바로 리턴
		if(left <= start && end <= right) {
			return tree[node];
		}
		//그 외의 경우에는 좌,우측으로 지속 탐색 수행
		return sum(node*2,start, (start+end)/2,left,right)+
				sum(node*2+1,(start+end)/2+1,end,left,right);
	}
	
}
