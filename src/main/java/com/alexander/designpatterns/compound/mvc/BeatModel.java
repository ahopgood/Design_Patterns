package com.alexander.designpatterns.compound.mvc;

import java.util.ArrayList;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class BeatModel implements BeatModelInterface, MetaEventListener {

	private Sequencer sequencer;
	private ArrayList<BeatObserver> beatObservers 	= new ArrayList<BeatObserver>();
	private ArrayList<BPMObserver> bpmObservers 	= new ArrayList<BPMObserver>();
	private int bpm = 90;
	private Sequence sequence;
	private Track track;
	
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
		notifyBPMObservers();
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
	
	public void notifyBeatObservers(){
		for (BeatObserver observer : this.beatObservers){
			observer.updateBeat();
		}
	}

	@Override
	public void registerObserver(BPMObserver o) {
		this.bpmObservers.add(o);
	}
	
	public void notifyBPMObservers(){
		for (BPMObserver observer : this.bpmObservers){
			observer.updateBPM();
		}
	}
	
	@Override
	public void removeObserver(BeatObserver o) {
		this.beatObservers.remove(o);
	}

	@Override
	public void removeObserver(BPMObserver o) {
		this.bpmObservers.remove(o);
	}

	@Override
	public void meta(MetaMessage message) {
		if (message.getType() == 47){
			beatEvent();
			sequencer.start();
			setBPM(getBPM());
		}
	}
	
	public void setUpMidi() {
		try{
			sequencer 	= MidiSystem.getSequencer();
			sequencer.open();
			sequencer.addMetaEventListener(this);
			sequence 	= new Sequence(Sequence.PPQ, 4);
			track 		= sequence.createTrack();
			sequencer.setTempoInBPM(getBPM());
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public void buildTrackAndStart() {
		int[] trackList = {36, 0, 46, 0};
		
		sequence.deleteTrack(null);
		track = sequence.createTrack();
		
		makeTracks(trackList);
		track.add(makeEvent(192,9,1,0,4));
		try {
			sequencer.setSequence(sequence);
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public void makeTracks(int[] list){
		for (int i = 0; i < list.length; i++) {
			int key = list[i];
			if (key != 0) {
				track.add(makeEvent(144, 9, key, 100, i));
				track.add(makeEvent(128, 9, key, 100, i+1));
			}
		}
	}
	
	public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
		} catch (Exception e){
			e.printStackTrace();
		}
		return event;
	}
}