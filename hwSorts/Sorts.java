import java.util.Arrays;

public class Sorts{
    private static boolean debug = true;
    public static void selectionSort(int[] arr){
	for(int i = 0; i < arr.length; i++){
	    if(debug){
		System.out.println(Arrays.toString(arr));
	    }

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
    public static void insertionSort(int[] arr){
	for(int i = 0; i < arr.length; i++){
	    int k = i;
	    while(k > 0 && arr[k] < arr[k - 1]){
		int temp = arr[k];
		arr[k] = arr[k - 1];
		arr[k - 1] = temp;
		k--;
	    }
	    if(debug){
		System.out.println(Arrays.toString(arr));
	    }
	}
    }
    public static void bubbleSort(int[] arr){
	for(int i = arr.length; i > 1; i--){
	    for(int k = 0; k < i - 1; k++){
		if(arr[k] > arr[k + 1]){
		    int temp = arr[k];
		    arr[k] = arr[k + 1];
		    arr[k + 1] = temp;
		}
	    }
	    if(debug){
		System.out.println(Arrays.toString(arr));
	    }
	}
    }
    public static void main(String[] args){
	int[] data = {1,2,9,5,0,3};
	System.out.println("Selection:");
	selectionSort(data);
	System.out.println("Bubble:");
	int[] d2 = {1,2,9,5,0,3};
	bubbleSort(d2);
    }
    
}
