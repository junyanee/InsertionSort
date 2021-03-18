import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// InsertionSort O(N^2) �������� 
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("�����ϰ��� �ϴ� �迭�� ���� �Է��ϼ���: ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		System.out.println("�迭�� ���� ���� �Է��ϼ���: ");
		for (int a = 0; a < arr.length; a++) {
			arr[a] = sc.nextInt();
		}
		sc.close();
		
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
