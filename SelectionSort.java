//Selection Sort: Time Complexity O(N^2), Space Complexity O(1)
//To Compile: javac SelectionSort.java and To run: java SelectionSort
//Developed By: Rayhan Hossain(Mukla.C) 2018/12/28




import java.util.Arrays;

class SelectionSort{
	public static void main(String[] args){
		int[] arr = {11, -5, 2, 15, 3, 1, 6};

		doSelectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void doSelectionSort(int arr[]){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length - i - 1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
