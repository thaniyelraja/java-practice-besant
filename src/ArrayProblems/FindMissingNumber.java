package ArrayProblems;

public class FindMissingNumber {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 50, 60, 70, 80, 100 };
		int diff = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length - 1; i++) {
			diff = Math.min(diff, (arr[i + 1] - arr[i]));
		}
		System.out.println("Missing numbers are : ");
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] - arr[i] != diff) {
				System.out.print((arr[i] + diff) + " ");
			}
		}

	}

}
