package pattern_temp;

public class Pattern48 {

	public static void main(String[] args) {
		int x = 1;
		int y;
		int z;
		for (int i = 5; i >= 1; i--) {
			y = x;
			z = i;
			for (int j = 5; j >= i; j--) {
				System.out.print(y + " ");
				y = y - z;
				z++;
			}
			x += i;
			System.out.println();
		}

	}

}
