public class TriangleDrawer{
	public static void TD(int n){
		int i = 1;
		String line = "*";
		while (i <= n){
			System.out.println(line);
			line += "*";
			i += 1;
		}
	}
	
	public static void main(String[] args){
		int n = 11;
		TD(10);
	}

}

