
public class PairDelt {

	public static void main(String[] args) {
		removePair("abbbccdba");//abd //abccba //abbbccd
	}

	public static String removePair(String s){
		String result="";
		for (int i = 0; i < s.length(); i++) {
			if(result.isEmpty()|| result.charAt(result.length()-1) !=s.charAt(i)){
				result +=s.charAt(i);
			}else {
				if(result.charAt(result.length()-1)==s.charAt(i)){
					result=result.substring(0,result.length()-1);
				}
			}
			
		}
		System.out.println(result);
		return result;
	}
}
