package zalando;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FindRemovedCharCount {
	
	public int solution(int[] Array ) {
	    int a = Array[1], output = a + Array[3], N = Array.length;
	    for (int B=4; B<N-1; B++) {
	        a = Math.min(a, Array[B-2]);
	        output = Math.min(output, a + Array[B]);
	    }
	    return output;
	}

	static int minCost(String S, int[] c) {
	     int tot = 0;

			int max = c[0];
			int ctot = c[0];
			for (int i = 1; i < S.length(); i++) {
				if (S.charAt(i) != S.charAt(i - 1)) {
					tot += ctot - max;
					ctot = max = c[i];
				} else {
					ctot += c[i];
					max = Math.max(max, c[i]);
				}
			}
			tot += ctot - max;

			return tot;
	}

	 public int solution(String s) {
		    
		    int max = 0;
		    for (int i = 1; i < s.length(); i++)
		        {
		            int current = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i) - '0');
		            if (current > max)
		                max = current;
		        }
		        return max;

		    }

	public static void main(String[] args) {
		// String str = "example";
		String str = "eeee";// "ccaaffddecee";
		// "aaaabbbb";

		char[] str1 = str.toCharArray();
		int N = str.length();
		HashMap<Character, Integer> mp = new HashMap<>();

		PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> Integer.compare(y, x));

		int cntChar = 0;

		for (int i = 0; i < N; i++) {

			if (mp.containsKey(str1[i])) {
				mp.put(str1[i], mp.get(str1[i]) + 1);
			} else {
				mp.put(str1[i], 1);
			}
		}

		for (Map.Entry<Character, Integer> it : mp.entrySet()) {

			pq.add(it.getValue());
		}

		while (!pq.isEmpty()) {

			int frequent = pq.peek();

			pq.remove();

			if (pq.isEmpty()) {
				System.out.println("line 40 :" + cntChar);
				// return cntChar;
			}

			if (frequent == pq.peek()) {

				if (frequent > 1) {

					pq.add(frequent - 1);
				}

				cntChar++;
			}
		}
		System.out.println("line 54 :" + cntChar);
		// return cntChar;
	}
}
