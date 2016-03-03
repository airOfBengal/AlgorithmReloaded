public class Sorting{
	/*
	 * Insertion sort algorithm, sorts in ascending order
	 * for primitive ints.
	**/
	public static void insertion(int[] a){
		if(a.length <2) return;

		for(int i=1,len=a.length,j,key;i<len;i++){
			key = a[i];
			j=i-1;
			while(j>=0 && a[j] > key){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
	}
	/*
	 * Insertion sort algorithm, sorts in descending order
	 * for primitive ints.
	**/
	public static void insertion(int[] a,boolean desc){
		if(!desc){
			insertion(a);
			return;
		}
		if(a.length < 2) return;
		for(int i=1,len=a.length,j,key;i<len;i++){
			key = a[i];
			j=i-1;
			while(j>=0 && a[j] < key){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
	}
}