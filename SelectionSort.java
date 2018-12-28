//Selection Sort: Time Complexity O(N^2), Space Complexity O(1)
//To Compile: javac SelectionSort.java and To run: java SelectionSort
//Developed By: Rayhan Hossain(Mukla.C) 2018/12/28




import java.util.Arrays;

class SelectionSort{
	public static void main(String[] args){
		int[] arr = {11, -5, 2, 15, 3, 1, 6, - 2};

		doSelectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void doSelectionSort(int arr[]){
		for(int i = 0; i < arr.length-1; i++){
			int minIndex = i;
			for(int j = i+1; j < arr.length; j++){
				if(arr[j] < arr[minIndex]){
					minIndex = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
}
