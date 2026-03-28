package array_temp;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int count = 0;
		int arr[] = { 1, 5, 6, 0, 3, 7 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];

			}
		}
		while (count < arr.length) {
			arr[count++] = 0;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
