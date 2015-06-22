
public class QuickFind {
	
	private int array[];
	
	public QuickFind(){
		array = new int[10];
		for(int i = 0; i < 10; ++i)
			array[i] = i;
	}
	
	private boolean connected(int p, int q){
		return array[p] == array[q];
	}
	
	public void union(int p, int q){
		if(!connected(p, q)){
			int qv = array[q];
			int pv = array[p];
			for(int i = 0; i < 10; ++i){
				if(array[i] == pv)
					array[i] = qv;
			}
		}
	}
	
	@Override
	public String toString(){
		String result = "";
		for(int i = 0; i < 10; ++i)
			result += array[i] + " ";
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickFind qf = new QuickFind();
		qf.union(0, 2);
		System.out.println("0-1: "+qf.toString());
		qf.union(1, 0);
		System.out.println("3-9: "+qf.toString());
		qf.union(1, 8);
		System.out.println("4-1: "+qf.toString());
		qf.union(1, 3);
		System.out.println("1-5: "+qf.toString());
		qf.union(9, 2);
		System.out.println("4-3: "+qf.toString());
		qf.union(1, 6);
		System.out.println("5-7: "+qf.toString());
	}

}
