public class TestSorting{
	public static void main(String[] args){
		int[] a = new int[]{31,41,59,26,41,58};//{3,2,4,6,5,1};

		System.out.println("In Ascending order:");
		Sorting.insertion(a);
		for(int i: a){
			System.out.print(i+" ");
		}
		System.out.println();

		a = new int[]{31,41,59,26,41,58};
		System.out.println("In Descending order:");
		Sorting.insertion(a,true);
		for(int i: a){
			System.out.print(i+" ");
		}
		System.out.println();
	}
}