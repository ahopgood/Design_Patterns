package com.alexander.designpatterns.composite.iterator;

import java.util.Iterator;

public class NullIterator implements Iterator<MenuComponent>{

	@Override
	public boolean hasNext() {
		
		return false;
	}

	@Override
	public MenuComponent next() {

		return null;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
