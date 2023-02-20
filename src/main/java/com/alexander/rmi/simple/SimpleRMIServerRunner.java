package com.alexander.rmi.simple;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;


public class SimpleRMIServerRunner {

	public static void main(String[] args){
		
		try {
			
			System.setProperty("java.security.policy", "src/main/java/com/alexander/rmi/simple/server.policy");
			System.setProperty("java.rmi.server.codebase", MyServiceImpl.class.getProtectionDomain().getCodeSource().getLocation().toString());//+" "+MyServiceImpl.class.getName());
			System.out.println("Codebase ["+MyServiceImpl.class.getProtectionDomain().getCodeSource().getLocation().toString()+"]");
			//get a security manager
			if (System.getSecurityManager() == null) {
			    System.setSecurityManager(new SecurityManager());
			}

			//start the service
			MyService service = new MyServiceImpl();
			service.setPrimitive(5);
//			MyService stub = (MyService)UnicastRemoteObject.exportObject(service, 0);
			System.out.println("Have exported the object");
			MyService stub = (MyService)UnicastRemoteObject.toStub(service);
			System.out.println("Have the stub");
			
            Registry registry = LocateRegistry.getRegistry();
            System.out.println("Have the registry");
            
            registry.bind("MyService", stub);
//			Naming.rebind("MyService", stub);
			System.out.println("Server ready");
		} catch (Exception ex){
			System.out.println(ex.getLocalizedMessage());
			ex.printStackTrace();
		}
		
	}
}
