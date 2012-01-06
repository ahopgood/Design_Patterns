package com.alexander.designpatterns.iterator.after;

import java.util.Calendar;
import java.util.Iterator;

import com.alexander.designpatterns.iterator.before.MenuItem;

public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {

	private MenuItem[] items;
	private int position;
	
	public AlternatingDinerMenuIterator(MenuItem[] items){
		this.items = items;
		Calendar rightNow = Calendar.getInstance();
		position = rightNow.get(Calendar.DAY_OF_WEEK);
	}
	
	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null){
			return false;
		} else {
			return true;
		}
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position = position + 2;
		return menuItem;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("Alternating Diner Menu Iterator does not support remove()");
	}
}
