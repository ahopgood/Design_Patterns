package com.alexander.designpatterns.composite.iterator;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {

	private Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();
	
	//Iterator of the top level composite i.e. top tree element we are starting our iteration from
	public CompositeIterator(Iterator<MenuComponent> iterator){
		stack.push(iterator);
	}
	
	@Override
	public boolean hasNext() {
		if (stack.empty()){
			return false;
		} else {
			Iterator<MenuComponent> iterator = stack.peek();
			if (!iterator.hasNext()){
				//if we reach the end of the iterator then check if we have another on the stack
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}

	@Override
	public MenuComponent next() {
		if (hasNext()){
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component = iterator.next();
			//if we have a menu then we have another iterator to iterate through
			if (component instanceof Menu){
				stack.push(component.createIterator());
			}
			return component;
		} else {
			return null;
		}
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
