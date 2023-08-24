public class LargerDemo{
	public static int Larger(int x, int y){
		if (x > y){
			return x;
		}
		else{
			return y;
		}
	}

	public static void main(String[] args){
		System.out.println(Larger(10, 3));	
	}
}

