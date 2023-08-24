public class SLList{
	private static class IntNode{
		public int item;
		public IntNode next;
		public IntNode(int i, IntNode n){
			item = i;
			next = n;
		}
	}

	private IntNode sentinel;
	private int size = 0;

	public SLList(){
		sentinel = new IntNode(63, null);
		size = 0;
	}
	public SLList(int x){
		sentinel = new IntNode(63, null);
		sentinel.next = new IntNode(x, null);
		size = 1;
	}
	
	/** Adds x to the front of list.*/
	public void addFirst(int x){
		sentinel.next = new IntNode(x, sentinel.next);
		size += 1;
	}
	
	/** Return the first item in the list.*/
	public int getFirst(){
		return sentinel.next.item;
	}

	public void addLast(int x){
		IntNode p = sentinel;

		while (p.next != null){
			p = p.next;
		}
		p.next = new IntNode(x, null);
		size += 1;
	}

//	private static int size(IntNode p)
////	{
////		if (p.next == null){ return 1;}
////
////		return 1 + size(p.next);
////	}
	public int size(){
		return size;
	}
	public static void main(String[] args){
		SLList L = new SLList();
		System.out.println("The size when created:	" + L.size());
		L.addLast(5);
		//L.addFirst(4);
		System.out.println(L.size());
	}
}
