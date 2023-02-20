package com.alexander.designpatterns.proxy.protection;

import java.lang.reflect.Proxy;

public class ProxyTestRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProxyTestRunner runner = new ProxyTestRunner();
		runner.drive();
	}
	
	public ProxyTestRunner(){
		initialiseDatabase();
	}
	
	public void drive(){
		PersonBean joe = getPersonFromDatabase("Joe Javabean");
		PersonBean ownerProxy = getOwnerProxy(joe);
		System.out.println("Name is " + ownerProxy.getName());
		ownerProxy.setInterests("Bowling, Darts");
		System.out.println("Interests set from owner proxy");
		try {
			ownerProxy.setHotOrNotRating(8);
		} catch (Exception e){
			System.out.println("Can't set rating from owner proxy");
		}
		System.out.println("Rating is " + ownerProxy.getHotOrNotRating());
		
		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println("Name is " + nonOwnerProxy.getName());
		try {
			nonOwnerProxy.setInterests("Hockey, Figure Skating");
		} catch (Exception e){
			System.out.println("Can't set interests from non owner proxy");
		}
		nonOwnerProxy.setHotOrNotRating(7);
		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
		
		System.out.println(3<<2);
		System.out.println(3<2);
		
	}
	
	public void initialiseDatabase(){
		
	}
	
	//Takes a person object and and returns a proxy for it, they both have the same interface so we end up returning the same type
	public PersonBean getOwnerProxy(PersonBean person){
		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(), //the interfaces that the proxy needs to implement
				new OwnerInvocationHandler(person)); //link to our invocation handler
	}
	
	public PersonBean getNonOwnerProxy(PersonBean person){
		return (PersonBean) Proxy.newProxyInstance(
				person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(),
				new NonOwnerInvocationHandler(person));
	}

	public PersonBean getPersonFromDatabase(String name){
		PersonBean bean = new PersonBeanImpl();
		bean.setName(name);
		return bean;
	}
}
