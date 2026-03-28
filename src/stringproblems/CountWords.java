package stringproblems;

public class CountWords {
	public static void main(String[] args) {
		String str = "Hello World";

		String[] words = str.trim().split("\\s+");

		System.out.println(words.length);
	}
}