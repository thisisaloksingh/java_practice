package com.hackerrank;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Result {

	/*
	 * Complete the 'finalState' function below.
	 *
	 * The function is expected to return a LONG_INTEGER. The function accepts
	 * 2D_INTEGER_ARRAY operations as parameter.
	 */

	public static long finalState(List<List<Integer>> operations) {
		// Write your code here
		List<Integer> switches = Arrays.asList(0, 0, 0, 0, 0, 0, 0);
		List<Integer> sublist = null;
		int sum = 0;
		// find if sublist is no of operations - 3
		// then put the condition with the operations - 3
		for (int i = 0; i < operations.size(); i++) {
			sublist = operations.get(i);
			sum = 0;
			for (int j = sublist.get(0); j <= sublist.get(1); j++) {

				if (switches.get(j - 1) == 0) {
					switches.set(j - 1, 1);
					sum += j;
				} else {
					if (j - 1 != 0) {
						switches.set(j - 1, 0);
					}
				}
				System.out.println("" + switches.get(j) == 1 + ":" + j);
				
			}
			ListIterator<Integer> lit = switches.listIterator();
			while (lit.hasNext()) {
				System.out.println(lit.next());
			}
			// switches.stream().filter(sublist.)
		}
		System.out.println("Sum of Index :" + sum);
		return sum;

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		System.out.println("Solution.main()");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getProperty("file.text")));
		// BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new
		// File("file.text")));

		int operationsRows = Integer.parseInt(bufferedReader.readLine().trim());
		int operationsColumns = Integer.parseInt(bufferedReader.readLine().trim());

		List<List<Integer>> operations = new ArrayList<>();

		IntStream.range(0, operationsRows).forEach(i -> {
			try {
				// System.out.println(""+Stream
				// .of(bufferedReader.readLine().replaceAll("\\s+$", "").split("
				// "))
				// .map(Integer::parseInt)
				// .collect(toList()).toString()
				// );

				operations.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt).collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		long result = Result.finalState(operations);
		System.out.println(result);
		//
		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();
		// bufferedReader.close();
		// bufferedWriter.close();
	}
}
