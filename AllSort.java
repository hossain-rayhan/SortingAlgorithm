//All Sort in One Place
//To Compile: javac AllSort.java and To run: java AllSort
//Developed By: Rayhan Hossain(Mukla.C) 2019/03/09




import java.util.Arrays;

class AllSort{
	public static void main(String[] args){
		int[] arr = {11, -5, 2, 15, 3, 1, 6};

		System.out.println("Original Array:");
		System.out.println(Arrays.toString(arr));

		//bubbleSort(arr);
		selectionSort(arr);

		System.out.println("Sorted Array:");
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] arr){
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

	public static void selectionSort(int[] arr){
		for(int i = 0; i < arr.length - 1; i++){
			int minIndex = i;
			for(int j = i+1; j < arr.length; j++){
				if(arr[j] < minIndex){
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

		
	}
}
