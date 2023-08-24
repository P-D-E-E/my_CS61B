public class ConditionalWithBlocks{
	public static void main(String[] args){
		int x = 5;
		
		if (x < 5){
			System.out.println("I shall increment 10 to x.");
			x += 10;
		}
		
		if (x < 10){
			System.out.println("I shall increment 10 to x.");
			x += 10;
		}
        
        System.out.println("At last, the number of x is: " + x);
	}
}
