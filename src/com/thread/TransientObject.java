package com.thread;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import sun.security.util.Password;


/*Persistent means that the object has been saved to 
 * the database whereas transient means that it hasn't 
 * been saved yet. So for example when you get an entity 
 * from a repository, that entity is persistent. When 
 * you create a new entity, it is transient until persisted.
*/
public class TransientObject implements Serializable{

	int i = 10;
	int j = 20;
	String name = "Dil to Bachha hai Ji";
	String username = "kaminadil0";
	transient String password = "********";
	transient String passcode = "*******";
	static TransientObject transientObj = new TransientObject();

	public static TransientObject checkTransient() throws Exception {

		// serialization
		FileOutputStream fos = new FileOutputStream("transient.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(transientObj);

		// de-serialization
		FileInputStream fis = new FileInputStream("transient.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		TransientObject transientObjOutput = (TransientObject) ois.readObject();
		System.out.println("Name :" + transientObjOutput.name);
		System.out.println("username :" + transientObjOutput.username);
		System.out.println("password :" + transientObjOutput.password);
		System.out.println("passcode :" + transientObjOutput.passcode);

		return transientObjOutput;
	}

	public static void main(String[] args) throws Exception {
		checkTransient();
	}

}
