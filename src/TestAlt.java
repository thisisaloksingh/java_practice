import java.util.HashMap;
import java.util.Map;

public class TestAlt {

	public static void main(String[] args) {
		
		String str = "fdhfhfvfbnm";
		int lenght=1;
		int start=0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				int flag = 1;
				for (int k = 0; k < (j - i + 1)/2; k++) {
					if (str.charAt(i + k) != str.charAt(j - k)) {
						flag = 0;
					}
				}
				if(flag!=0 && (j-i+1)>lenght){
					start=i;
					lenght=j-i+1;
				}
			}
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String str = "fdhfhfvfbnm";
		// set :
		substr(str);
		String test = "";
		int maxL = -1;
		for (char c : str.toCharArray()) {
			String scurrent = String.valueOf(c);
			if (test.contains(scurrent)) {
				test.substring(test.indexOf(scurrent) + 1);
			}
			test = test + String.valueOf(c);
			maxL = Math.max(test.length(), maxL);

		}
		// System.out.println(maxL);
	}

	public static void substr(String str) {
		Map<Character, Integer> map = new HashMap<>();
		int n = str.length();
		int i = 0;
		int maxCount = 0;
		for (int j = 0; j < n; j++) {
			if (map.containsKey(str.charAt(j))) {
				i = Math.max(map.get(str.charAt(j)), 1);
			}
			maxCount = Math.max(maxCount, j - i + 1);
			map.put(str.charAt(j), j + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println(maxCount);
	}

}
