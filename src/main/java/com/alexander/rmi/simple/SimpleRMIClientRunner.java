package com.alexander.rmi.simple;

import java.io.File;
import java.rmi.Naming;


public class SimpleRMIClientRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			System.setProperty("java.security.policy","src/main/java/com/alexander/rmi/simple/client.policy");// SimpleRMIClientRunner");
			File file = new File("src/main/java/com/alexander/rmi/simple/client.policy");
			if (file.exists()){
				System.out.println("Found client security policy");
			}
			//get a security manager 
	        if (System.getSecurityManager() == null) {
	            System.setSecurityManager(new SecurityManager());
	        }
	        System.out.println("Before lookup");
			MyService service = (MyService)Naming.lookup("rmi://127.0.0.1/MyService");
			System.out.println(service.getPrimitive());
		} catch (Exception e){
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
	}

}
