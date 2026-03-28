package arrayproblems;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = { 1, 6, 5, 3, 7, 2 };
		int target = 7;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println("Addition of " + arr[i] + " and " + arr[j] + " is " + target);
				}

			}
		}

	}

}
