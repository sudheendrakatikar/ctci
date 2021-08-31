package arrays_strings;

public class StringCompression {

	public static String compress(String str) {
		StringBuilder result = new StringBuilder();
		char current = str.charAt(0);
		int count = 1;
		for (int i=1 ; i<str.length() ; i++) {
			char c = str.charAt(i);
			if (c == current)
				count++;
			else {
				result.append(current+String.valueOf(count));
				current = c;
				count = 1;
			}
		}
		result.append(current+String.valueOf(count));
		return result.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compress("aabcccccaaa"));
	}

}
