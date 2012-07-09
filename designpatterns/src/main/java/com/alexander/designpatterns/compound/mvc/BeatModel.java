package com.alexander.designpatterns.compound.mvc;

import java.util.ArrayList;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;

public class BeatModel implements BeatModelInterface, MetaEventListener {

	private Sequencer sequencer;
	private ArrayList<BeatObserver> beatObservers 	= new ArrayList<BeatObserver>();
	private ArrayList<BPMObserver> bpmObservers 	= new ArrayList<BPMObserver>();
	private int bpm = 90;
	
	@Override
	public void initialize() {
		setUpMidi();
		buildTrackAndStart();
	}

	@Override
	public void on() {
		sequencer.start();
		setBPM(90);
	}

	@Override
	public void off() {
		setBPM(0);
		sequencer.stop();
	}

	@Override
	public void setBPM(int bpm) {
		this.bpm = bpm;
		this.sequencer.setTempoInBPM(getBPM());
		notifyBPMObserver();
	}

	@Override
	public int getBPM() {
		return bpm;
	}

	public void beatEvent(){
		notifyBeatObservers();
	}
	
	@Override
	public void registerObserver(BeatObserver o) {
		this.beatObservers.add(o);
	}

	@Override
	public void removeObserver(BeatObserver o) {
		this.beatObservers.remove(o);
	}

	@Override
	public void registerObserver(BPMObserver o) {
		this.bpmObservers.add(o);
	}

	@Override
	public void removeObserver(BPMObserver o) {
		this.bpmObservers.remove(o);
	}

	@Override
	public void meta(MetaMessage meta) {
		// TODO Auto-generated method stub
		
	}
}