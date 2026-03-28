package arrayproblems;

public class FindSingleOccurance {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 4, 8, 2, 9, 3 };
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
