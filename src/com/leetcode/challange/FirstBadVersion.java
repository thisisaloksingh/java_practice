package com.leetcode.challange;

import java.util.ArrayList;
import java.util.List;

public class FirstBadVersion {
	/* The isBadVersion API is defined in the parent class VersionControl.
    boolean isBadVersion(int version); */
  public static int firstBadVersion(int n) {
      
      int start=1,end=n;
      while(start<end){
          int middle=start+(end-start/2);
          if(isBadVersion(middle))
              end=middle;
          else
              start=middle+1;
      }
      System.out.println("Bad Version is :"+start);
      return start;
      
  }
  
  
	
	private static boolean isBadVersion(int middle) {
		
			return true;
	}



	public static void main(String[] args) {
		firstBadVersion(5);
	}
}
