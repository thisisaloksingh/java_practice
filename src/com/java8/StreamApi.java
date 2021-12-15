package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Stream;

public class StreamApi {
	String price;
	String cat;

	public StreamApi(String price, String cat) {
		super();
		this.price = price;
		this.cat = cat;
	}

	public static void main(String[] args) {
		ForkJoinPool fjp=ForkJoinPool.commonPool();
		System.out.println(fjp.getParallelism());
		
		Stream stream=Stream.of(1,2,4,5,6,6);
		System.out.println(stream.parallel().isParallel());
		List<Integer> coll=Arrays.asList(1,2,4,5,6,6);
		System.out.println(coll.parallelStream().isParallel());
		
		
		
		List<Integer> listInt = Arrays.asList(1, 2, 4, 5, 6, 7, 9);

		// find the largest number using java8
		
		int maxI = listInt.stream().reduce(Integer::max).get();
		System.out.println(maxI);

		int iMax = listInt.stream().reduce(0, (a, b) -> a > b ? a : b);
		System.out.println(iMax);

		int sumI = listInt.stream().mapToInt(i -> i).sum();
		System.out.println(sumI);

		Integer iSumWithMethodRef = listInt.stream().reduce(Integer::sum).get();
		System.out.println(iSumWithMethodRef);
		
		Optional<Integer> iSumWithMethodRef1= listInt.stream().reduce(Integer::sum);
		System.out.println(iSumWithMethodRef1);

		Integer iSum = listInt.stream().reduce(0,(a,b)->a+b);
		System.out.println(iSum);
		
		Integer multiply=listInt.stream().reduce(1,(a,b)->a*b);
		System.out.println(multiply);
		
		Optional<Integer> multiplyWithFuntionRef=listInt.stream().reduce(Integer::max);
		System.out.println(multiplyWithFuntionRef);
		
		Integer multiplyWithFuntionRef1=listInt.stream().reduce(Integer::max).get();
		System.out.println(multiplyWithFuntionRef1);
		
		//maximum character in string array
		List<String> listString=Arrays.asList("JavaLearning","Test","Practice");
		
		String maxChar=listString.stream()
				.reduce((a,b)->a.length()>b.length()?a:b)
				.get();
		System.out.println(maxChar);

		List<StreamApi> dataInList =(List<StreamApi>) Stream.of(new StreamApi("100", "REDCAT"),new StreamApi("101", "REDCAT1"));
//		List<StreamApi> list =
//		list.add(new StreamApi("100", "REDCAT"));
//		list.add(new StreamApi("101", "REDCAT1"));
//		list.add(new StreamApi("102", "REDCAT2"));
//		list.add(new StreamApi("103", "REDCAT4"));
//		list.add(new StreamApi("104", "REDCAT5"));
//		list.add(new StreamApi("105", "REDCAT6"));
//		// System.out.println(list);

		List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
		int sum = listOfNumbers.parallelStream().reduce(5, Integer::sum);
		// int sum = listOfNumbers.parallelStream().reduce(0, Integer::sum) + 5;
		// System.out.println(sum);

		listOfNumbers.parallelStream().forEach(number -> System.out.println(
				number + " " + Thread.currentThread().getName() + " " + Runtime.getRuntime().availableProcessors()));

	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	@Override
	public String toString() {
		return "StreamApi [price=" + price + ", cat=" + cat + "]";
	}

}
