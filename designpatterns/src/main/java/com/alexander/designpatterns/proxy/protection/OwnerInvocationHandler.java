package com.alexander.designpatterns.proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {

	private PersonBean personBean;
	
	//real subject is passed in as a constructor and a reference is kept.
	public OwnerInvocationHandler(PersonBean personBean){
		this.personBean = personBean;
	}
	
	//Called every time a method is called on a proxy
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		try{
			if (method.getName().startsWith("get")){
				return method.invoke(personBean,  args);
				//can use any get method, so go ahead and call them on the real object
			} else if (method.getName().startsWith("setHotOrNotRating")){
				throw new IllegalAccessException();
				//owner can't change their own rating
			} else if (method.getName().startsWith("set")){
				return method.invoke(personBean, args);
				//owner can change any other method
			}
		} catch (InvocationTargetException ite){
			ite.printStackTrace();
			//occurs if the real subject throws an exception
		}
		return null;
		//if any other method is called then return null
	}
}
