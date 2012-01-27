package com.alexander.designpatterns.proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {

	private PersonBean personBean;
	
	public NonOwnerInvocationHandler(PersonBean personBean){
		this.personBean = personBean;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		try {
			if (method.getName().startsWith("get")){
				//allow
				return method.invoke(personBean, args);
			} else if (method.getName().startsWith("setHotOrNotRating")){
				//allow
				return method.invoke(personBean, args);
			} else if (method.getName().startsWith("set")){
				//disallow
				throw new IllegalAccessException();
			}
		} catch (InvocationTargetException ite){
			ite.printStackTrace();
		}
		return null;
	}

}
