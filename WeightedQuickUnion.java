
public class WeightedQuickUnion {
	
	private int array[];
	private int height_array[];
	
	public WeightedQuickUnion(){
		array = new int[10];
		height_array = new int [10];
		for(int i = 0; i < 10; ++i){
			array[i] = i;
			height_array[i] = 1;
		}
	}
	
	public int root(int p){
		while(p != array[p])
			array[p] = array[array[p]];
			p = array[p];
		return p;
	}
	
	public void union(int p, int q){
		int a = root(p);
		int b = root(q);
		
		if(a != b){
			if(height_array[a] < height_array[b]){
				array[a] = b;
				height_array[b] += height_array[a];				
			}else{
				array[b] = a;
				height_array[a] += height_array[b];
			}
		}		
	}
	
	public String toString(){
		String result = "";
		for(int i = 0; i < 10; ++i)
			result += array[i] + " ";
		result += "\n"; 
		for(int i = 0; i < 10; ++i)
			result += height_array[i] + " ";
		result+= "\n--------------------";
		
		return result;
	}

}
