package com.alexander.designpatterns.adapter;

import com.alexander.designpatterns.adapter.interfaces.Duck;
import com.alexander.designpatterns.adapter.interfaces.Turkey;

public class TurkeyAdapter implements Duck {

	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey){
		this.turkey = turkey;
	}
	
	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		//turkeys fly in short spurts so we have to make up for that and fly five times.
		for (int i = 0; i < 5; i++){
			turkey.fly();
		}
	}

}
