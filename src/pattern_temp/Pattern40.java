package pattern_temp;

public class Pattern40 {

	public static void main(String[] args) {
		int x;
		for (int i = 1; i <= 5; i++) {
			x = 2;
			for (int j = 1; j <= i; j++) {

				System.out.print(x + " ");
				x += 2;
			}
			System.out.println();
		}

	}

}
