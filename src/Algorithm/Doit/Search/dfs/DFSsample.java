package Algorithm.Doit.Search.dfs;

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
