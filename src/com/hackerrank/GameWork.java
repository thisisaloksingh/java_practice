package com.hackerrank;

import java.util.Scanner;

public class GameWork {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  
        String color = sc.nextLine();
        gameColor(color);
	}

	static String gameColor(String color) {
		int a=0,b=0,i=0,y=0;
		for (i = 0; i < color.length()-2; i++) {
			if (color.charAt(i) == color.charAt(i + 1) && color.charAt(i + 2) == color.charAt(i)
					&& color.charAt(i) == 'b') {
				color=color.substring(0, i) + color.substring(i + 1);
//				System.out.println(color);
//				System.out.println("bob");
				b++;
				i=0;
			}
			
			if (color.charAt(i) == color.charAt(i + 1) && color.charAt(i + 2) == color.charAt(i)
					&& color.charAt(i) == 'w')  {
				color=color.substring(0, i) + color.substring(i + 1);
//				System.out.println(color);
//				System.out.println("wendy");
				a++;
				i=0;
			}
			
		}
		if (a>=b) {
			System.out.println(color);
			System.out.println("wendy");
			
		}else{
			System.out.println(color);
			System.out.println("bob");
		}

		return null;
	}
}
