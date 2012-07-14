package com.alexander.designpatterns.compound.mvc;

import java.util.ArrayList;
import java.util.Random;

public class HeartModel implements HeartModelInterface, Runnable {

	private ArrayList<BeatObserver> beatObservers 	= new ArrayList<BeatObserver>();
	private ArrayList<BPMObserver> bpmObservers 	= new ArrayList<BPMObserver>();
	private int time 	= 1000;
	private int bpm 	= 90;
	private Random random = new Random(System.currentTimeMillis());
	private Thread thread;
	
	public HeartModel(){
		thread = new Thread(this);
		thread.start();
	}
	
	@Override
	public void run() {
		int lastrate = -1;
		
		for (;;) {
			int change = random.nextInt(10);
			if (random.nextInt(2) == 0){
				change = 0 - change;
			}
			
			int rate = 60000 / (time + change);
			if (rate < 120 && rate > 50){
				time += change;
				notifyBeatObservers();
				if (rate != lastrate){
					lastrate = rate;
					notifyBPMObservers();
				}
			}
			try {
				Thread.sleep(time);
			} catch (Exception e){
				
			}
		}
		
	}
	
	@Override
	public int getHeartRate() {
		return 60000 / time;
	}
	
	@Override
	public void registerObserver(BeatObserver o) {
		this.beatObservers.add(o);	
	}
	
	@Override
	public void removeObserver(BeatObserver o) {
		this.beatObservers.remove(o);
		
	}
	
	public void notifyBeatObservers(){
		for (BeatObserver observer : beatObservers){
			observer.updateBeat();
		}
	}
	
	@Override
	public void registerObserver(BPMObserver o) {
		this.bpmObservers.add(o);
	}
	
	@Override
	public void removeObserver(BPMObserver o) {
		this.bpmObservers.remove(o);
	}
	
	public void notifyBPMObservers(){
		for (BPMObserver observer : bpmObservers) {
			observer.updateBPM();
		}
	}
}
