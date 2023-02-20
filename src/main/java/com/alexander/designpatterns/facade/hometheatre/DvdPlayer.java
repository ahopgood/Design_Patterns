package com.alexander.designpatterns.facade.hometheatre;

public class DvdPlayer {

	private Amplifier amplifier;
	
	private String movie;
	
	public DvdPlayer(Amplifier amplifier){
		this.amplifier = amplifier;
	}
	
	public void on(){
		System.out.println("Top-O-Line DVD Player on");
	}
	
	public void off(){
		System.out.println("Top-O-Line DVD Player off");
	}
	
	public void eject(){
		System.out.println("Top-O-Line DVD Player ejecct");
	}
	
	public void pause(){
		
	}
	
	public void play(String movie){
		System.out.println("Top-O-Line DVD Player is playing \""+movie+"\"");
		this.movie = movie;
	}
	
	public void setSurroundAudio(){
		
	}
	
	public void setTwoChannelAudio(){
		
	}
	
	public void stop(){
		System.out.println("Top-O-Line DVD Player stopped \""+movie+"\"");
	}
}
