package com.alexander.designpatterns.facade;

import com.alexander.designpatterns.facade.hometheatre.Amplifier;
import com.alexander.designpatterns.facade.hometheatre.CdPlayer;
import com.alexander.designpatterns.facade.hometheatre.DvdPlayer;
import com.alexander.designpatterns.facade.hometheatre.PopcornPopper;
import com.alexander.designpatterns.facade.hometheatre.Projector;
import com.alexander.designpatterns.facade.hometheatre.Screen;
import com.alexander.designpatterns.facade.hometheatre.TheatreLights;
import com.alexander.designpatterns.facade.hometheatre.Tuner;

public class HometheatreTestDrive {

	public static void main(String[] args){

		Amplifier amp = new Amplifier();
		Tuner tuner = new Tuner(amp);
		DvdPlayer dvdPlayer = new DvdPlayer(amp);
		CdPlayer cdPlayer = new CdPlayer(amp);
		Projector projector = new Projector(dvdPlayer);
		TheatreLights theatreLights = new TheatreLights();
		Screen screen = new Screen();
		PopcornPopper popcornPopper = new PopcornPopper();

		
		HometheatreFacade homeTheatre = new HometheatreFacade(
				amp,
				tuner,
				dvdPlayer,
				cdPlayer,
				projector,
				theatreLights,
				screen,
				popcornPopper
				);
		
		homeTheatre.watchMovie("Highlander");
		homeTheatre.endMovie();
	}
}
