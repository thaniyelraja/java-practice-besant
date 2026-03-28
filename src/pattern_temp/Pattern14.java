package pattern_temp;

public class Pattern14 {

	public static void main(String[] args) {
		/*
		 * " 5 10 15 20 25
		 *   4 9 14 19 24
		 *   3 8 13 18 23
		 *   2 7 12 17 22
		 *   1 6 11 16 21 "
		 */
		int x;
		for (int i = 1; i <= 5; i++) {
			x = 5 - i + 1;
			for (int j = 1; j <= 5; j++) {
				System.out.print(x + " ");
				x += 5;
			}
			System.out.println();
		}

	}

}
