
public class InsertionSort {

	public static void main(String[] args) {
		// InsertionSort O(N^2) »ğÀÔÁ¤·Ä 

		int arr[] = {1, 10, 8, 7, 3, 5, 6, 2, 4, 9};
		
		for (int i = 0; i < arr.length-1; i++) {
			int j = i;
			while(arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				j--;
			}
			
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
	}

}
