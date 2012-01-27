package com.alexander.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationRunner {

	public static void main(String[] args) {
		SerialObject obj = new SerialObject("Alex",27,18.0f);
		
		SerializationRunner sr = new  SerializationRunner();
		sr.writeObject(obj);
		System.out.println(obj);
		SerialObject so2 = sr.readObject();
		System.out.println(so2);
	}

	public void writeObject(SerialObject obj){
		String filename = "serialTest";
		try {
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.close();
		} catch (IOException ioe){
			System.out.println(ioe.getMessage());
		}	
	}
	
	public SerialObject readObject(){
		String filename = "serialTest";
		SerialObject output = null;
		try{
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			if (obj instanceof SerialObject){
				output = (SerialObject)obj;
			}
		} catch (IOException ioe){
			System.out.println(ioe.getMessage());
		} catch (ClassNotFoundException cnfe){
			System.out.println(cnfe.getMessage());
		}
		return output;
	}
}
