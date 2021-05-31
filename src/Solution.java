import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
	public static void main(String[] args) {
		new Solution().solution("50552");

		String regex = "[0-9]+";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher("90343");
		System.out.println(m.matches());

		Pattern pattern = Pattern.compile("numFound=\"([0-9]+)\"");
		Matcher matcher = pattern.matcher("1");

		if (matcher.find()) {
			System.out.println(matcher.group(1));
		}
	}

	public int solution(String S) {
		// write your code in Java SE 8
		int value = 0;
		String regex = "[0-9]+";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(S);
		if (S.charAt(0) != '0' && m.matches() == true && S.length() >= 2 && S.length() <= 100) {
			System.out.println("Solution.solution()");
			for (int i = 0; i < S.length() - 1; i++) {
				char ch = S.charAt(i);
				char ch1 = S.charAt(i + 1);
				if (String.valueOf(ch).equals("0")) {
					value = Integer.parseInt(Character.toString(ch) + Character.toString(ch1));
					String padded = String.format("%02d", value);
					System.out.println(padded);
					int iTest = Integer.valueOf(padded);
					System.out.println(iTest);
				}else{
					value = Integer.parseInt(Character.toString(ch) + Character.toString(ch1));
					System.out.println(value);
				}
			}
			
		}
		return value;
	}
}