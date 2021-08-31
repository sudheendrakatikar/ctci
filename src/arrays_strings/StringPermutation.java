package arrays_strings;

import java.util.HashMap;
import java.util.Map;

public class StringPermutation {

	// 1.2 - Check if s1 is a permutation of s1
	public static boolean isPermutation(String s1, String s2) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i=0 ; i<s1.length() ; i++) {
			char c = s1.charAt(i);
			if (map.containsKey(c))
				map.put(c, Integer.valueOf(map.get(c)+1));
			else
				map.put(c, 1);
		}
		for (int i=0 ; i<s2.length() ; i++) {
			char c = s2.charAt(i);
			if (map.containsKey(c) && map.get(c) > 0)
				map.put(c, Integer.valueOf(map.get(c))-1);
			else
				return false;
		}
		return true;
	}
	
	public static void main(String args[]) {
		
		String s1 = "asdfghj";
		String s2 = "jhgfdsa";
		String s3 = "sdfsovn";
		System.out.println(isPermutation(s1, s2));
		System.out.println(isPermutation(s1, s3));
	}
}
