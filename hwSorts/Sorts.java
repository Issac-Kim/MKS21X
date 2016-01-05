public class Sorts{
    public static void Selection(int[] arr){
	for(int i = 0; i < arr.length; i++){
	    int index = i;
	    int smallest = arr[i];
	    for(int l = i; l < arr.length; l++){
		if(arr[l] < smallest){
		    smallest = arr[l];
		    index = l;
		}
	    }
	    int temp = arr[index];
	    arr[index] = arr[i];
	    arr[i] = temp;
	}
    }
    public static void Insertion(int[] arr){
	for(int i = 0; i < arr.length; i++){
	    int k = i;
	    while(k > 0 && arr[k] < arr[k - 1]){
		int temp = arr[k];
		arr[k] = arr[k - 1];
		arr[k - 1] = temp;
		k--;
	    }
	}
    }
    
}
