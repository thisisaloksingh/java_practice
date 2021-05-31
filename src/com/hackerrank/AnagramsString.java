package com.hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class AnagramsString {
	char[] chara;

	/*
	 * Complete the 'makeAnagram' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * following parameters: 1. STRING a 2. STRING b
	 */

	public static int makeAnagram(String a, String b) {
		// Write your code here
		int anamgramInt=0;
		String removedChar="";
		if (a.length() != b.length()) {
			System.out.println("String Length is not same,so it can not be Anagram !" + "\n"
					+ "Now we will make Anagram after deleting extra characters !");
		}
		
		char[] chars = a.toCharArray();
		for (char c : chars) {
			int index = b.indexOf(c);
			if (index != -1) {
				b = b.substring(0, index) + b.substring(index + 1, b.length());
			} else {
				System.out.println("Remove this char to make it Anagram :"+c);
				
				removedChar +=c+"";
				anamgramInt=0;
			}
		}
		if (b.isEmpty()) {
			//System.out.println("Are Anagram !");
		}
		
		return anamgramInt;
	}
	
	public static int numberNeeded(String first, String second) {
        int[] charSet = new int[256];
        
        for(int i=0; i<first.length(); i++)
            charSet[first.charAt(i)]++;
        
        for(int i=0; i<second.length(); i++)
            charSet[second.charAt(i)]--;
        
        int numberNeeded = 0;
        System.out.println(Arrays.toString(charSet).length());
        for(int i=0; i<256; i++)
            numberNeeded += Math.abs(charSet[i]);
        
        System.out.println("AnagramsString.numberNeeded()");
        System.out.println(numberNeeded);
        return numberNeeded;
     }

	public static void main(String[] args) throws IOException {
		/*
		 * BufferedReader bufferedReader = new BufferedReader(new
		 * InputStreamReader(System.in)); BufferedWriter bufferedWriter = new
		 * BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		 * 
		 * String a = bufferedReader.readLine();
		 * 
		 * String b = bufferedReader.readLine();
		 */
		String st1="sjkbdgfdfm";
		String st2="sjkxdgfdfc";
		int res = AnagramsString.makeAnagram("sjkdgfdf", "jkdgfdf");
		numberNeeded(st1, st2);

		/*
		 * bufferedWriter.write(String.valueOf(res)); bufferedWriter.newLine();
		 * 
		 * bufferedReader.close(); bufferedWriter.close();
		 */
	}
}
