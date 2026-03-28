package stringproblems;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String str = "hello world";

		str = str.replaceAll("\\s", "");

		System.out.println(str);
	}
}