package Patterns;

public class Pattern19 {

	public static void main(String[] args) {
		/*
		 * " 1 0 1 0 1
		 *   0 1 0 1 0
		 *   1 0 1 0 1
		 *   0 1 0 1 0
		 *   1 0 1 0 1 "
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(((i + j) - 1) % 2 + " ");
			}
			System.out.println();
		}

	}

}
