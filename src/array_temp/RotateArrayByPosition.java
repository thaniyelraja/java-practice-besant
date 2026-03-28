package array_temp;

public class RotateArrayByPosition {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 1, 8, 2, 3 };
		int rotKey = 2;
		for (int j = 0; j < rotKey; j++) {
			int first = arr[0];
			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = first;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
