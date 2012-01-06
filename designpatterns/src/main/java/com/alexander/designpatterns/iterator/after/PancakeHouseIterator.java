package com.alexander.designpatterns.iterator.after;

import java.util.ArrayList;

import com.alexander.designpatterns.iterator.before.MenuItem;

public class PancakeHouseIterator implements Iterator, java.util.Iterator {

	private ArrayList<MenuItem> items;
	private int position = 0;
	
	public PancakeHouseIterator(ArrayList<MenuItem> items){
		this.items = items;
	}
	
	@Override
	public boolean hasNext() {
		if (position >= items.size() || items.get(position) == null){
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = items.get(position);
		position = position + 1;
		return menuItem;
	}

	@Override
	public void remove() {
		items.remove(0);
	}
}