
public class Anagrams {
	public static void main(String[] args) {
		//System.out.println(isAnagram("TEST", "ESTTf"));
		Anagrams ang=new Anagrams();
		Anagrams ang1=new Anagrams();
		System.out.println(ang.equals(ang1));
		String s=new String();
		String s1=new String();
		System.out.println(s.equals(s1));
	}

	public static boolean isAnagram(String word, String anagram) {
		if (word.length() != anagram.length()) {
			return false;
		}
		char[] chars = word.toCharArray();
		for (char c : chars) {
			int index = anagram.indexOf(c);
			if (index != -1) {
				anagram.substring(0, index);
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			} else {
				return false;
			}
		}
		return anagram.isEmpty();
	}

}
