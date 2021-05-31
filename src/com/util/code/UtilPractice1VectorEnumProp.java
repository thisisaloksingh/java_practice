package com.util.code;

import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;

public class UtilPractice1VectorEnumProp {
	
	public static void main(String[] args) {
		
		//Using Vector
		Vector v =new Vector();
		v.addElement("Test");
		v.addElement("Test-1");
		v.addElement("Test-2");
		v.addElement("Test-2");
		v.addElement("Test-2");
		System.out.println("**********Vector****************");
		System.out.println(v);
		
		Enumeration enm=v.elements();
		while(enm.hasMoreElements()){
			Object obj=(Object) enm.nextElement();
			System.out.println(obj);
		}
		
		
		//Using properties 
		Properties p=new Properties();
		p.put("T-1", "FAILED");
		p.put("T-2", "FAILED");
		p.put("T-3", "FAILED");
		p.put("T-4", "FAILED");
		p.put("T-5", "FAILED");
		System.out.println("**********Properties****************");
		System.out.println(p);
		
		Enumeration enmp=p.propertyNames();
		while (enmp.hasMoreElements()) {
			String key = (String) enmp.nextElement();
			String value=p.getProperty(key);
			System.out.println(key+" : "+value);
			
		}
		
		
	}

}
