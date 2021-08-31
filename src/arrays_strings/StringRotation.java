package arrays_strings;

public class StringRotation {
	
	// 1.9 - Check if s1 is a rotation of s2
	public static boolean check(String s1, String s2) {
		StringBuilder sb = new StringBuilder(s1);
		s1 = sb.append(s1).toString();
		return s1.contains(s2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(check("erbottlewat", "waterbottle"));
	}

}
