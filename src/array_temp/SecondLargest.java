package array_temp;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr = { 7, 2, 9, 3, 8, 2, 3, 6 };
		int large = arr[0];
		int secLarge = arr[1];
		if (secLarge > large) {
			int temp = large;
			large = secLarge;
			secLarge = temp;
		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > large) {
				secLarge = large;
				large = arr[i];

			} else if (arr[i] < large && arr[i] > secLarge) {
				secLarge = arr[i];
			}
		}

		System.out.println("Second largest element is : " + secLarge);
	}

}
