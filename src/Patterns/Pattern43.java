package Patterns;

public class Pattern43 {

	public static void main(String[] args) {
		int x;
		for (int i = 1; i <= 10; i += 2) {
			x = i;
			for (int j = 1; j <= i; j += 2) {

				System.out.print(x + " ");
				x += 2;
			}
			System.out.println();
		}

	}

}
