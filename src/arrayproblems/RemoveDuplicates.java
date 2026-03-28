package arrayproblems;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int count = 0;
		int[] arr = { 1, 4, 9, 3, 2, 3, 4, 1 };
		int[] resArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < count; j++) {
				if (arr[i] == resArr[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				resArr[count++] = arr[i];
			}

		}
		System.out.println("Array without duplicates : ");
		for (int i = 0; i < count; i++) {
			System.out.print(resArr[i] + " ");
		}
	}

}



