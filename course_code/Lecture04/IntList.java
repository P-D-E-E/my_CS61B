public class IntList{
	public int first;
	public IntList rest;
	
	public IntList(int f, IntList r){
		first = f;
		rest = r;
	}

	public int size(){
	   	if (rest == null){
		    return 1;
		}
		return 1 + this.rest.size();
	}

	public int iterativeSize(){
		IntList p = this;
		int totalSize = 0;
		while (p != null){
			totalSize += 1;
			p = p.rest;
		}
		return totalSize;
	}
	
	public int getElem(int num){
		IntList p = this;

		for (int i = 0; i < num && this != null; i++){
			p = p.rest;
		}
		return p.first;
	}

	public static void main(String[] args){
		IntList l = new IntList(10, null);
		l = new IntList(15, l);
		l = new IntList(20, l);
		System.out.println(l.getElem(1));
	}
}
