package com.alexander.designpatterns.facade.hometheatre;

public class Projector {

	private DvdPlayer dvdPlayer;
	
	public Projector(DvdPlayer dvdPlayer){
		this.dvdPlayer = dvdPlayer;
	}
	
	public void on(){
		System.out.println("Top-O-Line Projector on");
	}
	
	public void off(){
		System.out.println("Top-O-Line Projector off");
	}
	
	public void tvMode(){
		
	}
	
	public void wideScreenMode(){
		System.out.println("Top-O-Line Projector in widescreen mode (16x9 aspect ratio)");
	}
}
