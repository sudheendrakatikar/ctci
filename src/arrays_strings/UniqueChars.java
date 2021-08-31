package arrays_strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueChars {

	// 1.1 - Algorithm to determine if a string has all unique characters
	public static boolean allUniqueChars(String str) {
		Set<Character> set = new HashSet<Character>();
		for (int i=0 ; i<str.length() ; i++) {
			if (set.contains(str.charAt(i)))
				return false;
			set.add(str.charAt(i));
		}
		return true;
	}
	
	// Follow up: Can't use extra data structure (but i still needed to use a char[])
	public static boolean noExtraDataStructure(String str) {
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		char temp = chars[0];
		for (int i=1 ; i<chars.length ; i++) {
			if (chars[i] == temp)
				return false;
		}
		return true;
	}
		
	public static void main(String[] args) {
		
		System.out.println(allUniqueChars("asdfghj"));
		System.out.println(allUniqueChars("asdfrad"));
		
		System.out.println(noExtraDataStructure("asdfghj"));
		System.out.println(noExtraDataStructure("asddfra"));

	}

}
