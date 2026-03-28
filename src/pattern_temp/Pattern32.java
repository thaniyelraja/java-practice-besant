package pattern_temp;

public class Pattern32 {

	public static void main(String[] args) {
		int x;
		for (int i = 1; i <= 5; i++) {
			x = i;
			for (int j = 1; j <= 5; j++) {
				System.out.print((char) (x + 64) + " ");
				x += 5;

			}
			System.out.println();
		}

	}

}
