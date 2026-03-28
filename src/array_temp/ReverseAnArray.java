package array_temp;

public class ReverseAnArray {

	public static void main(String[] args) {
		// Just print reverse
		System.out.println("Printing array in a reverse order : ");
		int[] arr = { 5, 3, 8, 2, 4 };
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Array elements are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("Reverse an array internally on memory : ");
		// Internal reverse
		int first = 0;
		int last = arr.length - 1;

		while (first < last) {
			int temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;

			first++;
			last--;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
