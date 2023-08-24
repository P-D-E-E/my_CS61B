public class VectorFor{
	public static void main(String[] args){
		int[] Score = new int[]{1, 5, 2, 4, 3};
		int maikesi = 0;
		for (int i = 0; i < 5; i ++){
			if (Score[i] > maikesi){
				maikesi = Score[i];
			}
		}
		System.out.println(maikesi);
	}
}
