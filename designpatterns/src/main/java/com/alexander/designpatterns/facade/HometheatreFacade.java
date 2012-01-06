package com.alexander.designpatterns.facade;

import com.alexander.designpatterns.facade.hometheatre.Amplifier;
import com.alexander.designpatterns.facade.hometheatre.CdPlayer;
import com.alexander.designpatterns.facade.hometheatre.DvdPlayer;
import com.alexander.designpatterns.facade.hometheatre.PopcornPopper;
import com.alexander.designpatterns.facade.hometheatre.Projector;
import com.alexander.designpatterns.facade.hometheatre.Screen;
import com.alexander.designpatterns.facade.hometheatre.TheatreLights;
import com.alexander.designpatterns.facade.hometheatre.Tuner;

public class HometheatreFacade {

	private Amplifier amplifier;
	private Tuner tuner;
	private DvdPlayer dvdPlayer;
	private CdPlayer cdPlayer;
	private Projector projector;
	private TheatreLights theatreLights;
	private Screen screen;
	private PopcornPopper popcornPopper;
	
	public HometheatreFacade(Amplifier amplifier, Tuner tuner,
			DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projector projector,
			TheatreLights theatreLights, Screen screen,
			PopcornPopper popcornPopper) {
		super();
		this.amplifier = amplifier;
		this.tuner = tuner;
		this.dvdPlayer = dvdPlayer;
		this.cdPlayer = cdPlayer;
		this.projector = projector;
		this.theatreLights = theatreLights;
		this.screen = screen;
		this.popcornPopper = popcornPopper;
	}
	
	public void watchMovie(String movie){
		System.out.println("Get ready to watch a movie...");
		popcornPopper.on();
		popcornPopper.pop();
		theatreLights.dim();
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amplifier.on();
		amplifier.setDvd(dvdPlayer);
		amplifier.setSurroundSoud();
		amplifier.setVolume(5);
		dvdPlayer.on();
		dvdPlayer.play(movie);
	}
	
	public void endMovie(){
		System.out.println("Shutting movie theatre down...");
		popcornPopper.off();
		theatreLights.on();
		screen.up();
		projector.off();
		amplifier.off();
		dvdPlayer.stop();
		dvdPlayer.eject();
		dvdPlayer.off();
	}
}
