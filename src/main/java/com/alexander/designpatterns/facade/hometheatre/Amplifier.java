package com.alexander.designpatterns.facade.hometheatre;

public class Amplifier {

	private Tuner tuner;
	private DvdPlayer dvdPlayer;
	private CdPlayer cdPlayer;
	
	public Amplifier(){
	}
	
	public void on(){
		System.out.println("Top-O-Line Amplifier is on");
	}
	
	public void off(){
		System.out.println("Top-O-Line Amplifier off");
	}
	
	public void setCd(CdPlayer cdPlayer){
		this.cdPlayer = cdPlayer;
	}
	
	public void setDvd(DvdPlayer dvdPlayer){
		System.out.println("Top-O-Line Amplifier setting DVD player to Top-O-Line DVD Player");
		this.dvdPlayer = dvdPlayer;
	}
	
	public void setStereoSound(){
		
	}
	
	public void setSurroundSoud(){
		System.out.println("Top-O-Line Amplifier surround sound on (5 speakers, 1 subwoofer)");
	}
	
	public void setTuner(Tuner tuner){
		this.tuner = tuner;
	}
	
	public void setVolume(int vol){
		System.out.println("Top-O-Line Amplifier setting volume to "+vol);
	}
}
