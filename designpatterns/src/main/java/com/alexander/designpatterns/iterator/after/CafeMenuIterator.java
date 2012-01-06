package com.alexander.designpatterns.iterator.after;

import java.util.Hashtable;
import java.util.Map.Entry;

import com.alexander.designpatterns.iterator.before.MenuItem;

public class CafeMenuIterator implements Iterator {

	private Hashtable<String, MenuItem> hashtable;
	private int position = 0;
	private java.util.Iterator<Entry<String, MenuItem>> iterator;
	
	public CafeMenuIterator(Hashtable<String, MenuItem> hashtable){
		this.hashtable = hashtable;
		this.iterator = this.hashtable.entrySet().iterator();
	}
	
	@Override
	public boolean hasNext() {
		return this.iterator.hasNext();
	}

	@Override
	public Object next() {
		Entry<String, MenuItem> item = this.iterator.next();
		return item.getValue();
	}
	
	public void remove(){
		this.iterator.remove();
	}

}
