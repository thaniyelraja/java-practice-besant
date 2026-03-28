package array_temp;

public class FindDuplicatesInTheArray {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 4, 3, 6, 7, 3, 9, 8 };
		int[] dupArr = new int[arr.length];
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					dupArr[counter++] = arr[i];
				}
			}
		}
		System.out.println("Duplicate elements in the array : ");
		for (int i = 0; i < counter; i++) {
			System.out.println(dupArr[i]);
		}

	}

}
