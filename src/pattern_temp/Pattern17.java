package pattern_temp;

public class Pattern17 {

	public static void main(String[] args) {
		/*
		 * " 1 3 5 7 9
		 *   3 5 7 9 11
		 *   5 7 9 11 13 
		 *   7 9 11 13 15
		 *   9 11 13 15 17 "
		 */
		int x;
		for (int i = 1; i <= 10; i += 2) {
			x = i;
			for (int j = 1; j <= 5; j++) {
				System.out.print(x + " ");
				x += 2;
			}
			System.out.println();
		}

	}

}
