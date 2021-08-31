package arrays_strings;

public class PalindromePermutation {
	
	// 1.4 - Check if string is a permutation of a palindrome
	public static boolean check(String str) {
		boolean[] map = new boolean[26];
		for (int i = 0; i < str.length(); i++)
			map[str.charAt(i) - 'a'] = !map[str.charAt(i) - 'a'];
		boolean one_odd = false;
		for (boolean m: map) {
			if (m & one_odd)
				return false;
			if (m)
				one_odd = true;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check("aaddeerrg"));
	}

}
