import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringOperation {
	public static void main(String[] args) {
		findDuplicate();
		
		String s="Test today smart!";
		int count=1;
		
		char tocharArray[]=s.toCharArray();
		Arrays.sort(tocharArray);
		String sortedarray=new String(tocharArray).trim();
		System.out.println(sortedarray);
		
		for (int i=0; i < sortedarray.length()-1;i++) {
			if (sortedarray.charAt(i)==sortedarray.charAt(i+1)) {
				count++;
				System.out.println(sortedarray.charAt(i)+" : "+count);
			}else{
				
				System.out.println(sortedarray.charAt(i)+" : "+count);
			}
			
			
			//print character count and also print which character count is more
			
			
			
		}
		
		//count number of specific character 
		int chcount=0;
		for (char c : sortedarray.toCharArray()) {
			if (c=='t') {
				chcount ++;
			}
		}
		System.out.println("t :"+chcount+ "times");
	}
	
	private static void findDuplicate() {
		// TODO Auto-generated method stub
		String word="TEST-TEST-TEST-Z";
		
		Map<Character, Integer> charMap=new HashMap<Character, Integer>();
		for (Character ch :word.toCharArray()) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch,charMap.get(ch)+1);
			}else{
				charMap.put(ch, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entryset=charMap.entrySet();
		
		System.out.println("Word is :"+word);
		for(Map.Entry<Character, Integer> entry: entryset) {
			if (entry.getValue()>=1) {
				System.out.println(entry.getKey()+ ": "+entry.getValue());
			}
			
		}

	}

}
