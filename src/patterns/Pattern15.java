package patterns;

public class Pattern15 {

	public static void main(String[] args) {
		/*
		 * " 5 6 15 16 25
		 *   4 7 14 17 24
		 *   3 8 13 18 23
		 *   2 9 12 19 22
		 *   1 10 11 20 21 "
		 */
		int x;
		int y;
		for (int i = 1; i <= 5; i++) {
			x = i;
			y = 5 - i + 1;
			for (int j = 1; j <= 5; j++) {
				if (j % 2 == 0) {
					// odd column
					System.out.print(x + " ");
				} else {
					// even column
					System.out.print(y + " ");

				}
				x = x + 5;
				y = y + 5;
			}

			System.out.println();
		}

	}

}
