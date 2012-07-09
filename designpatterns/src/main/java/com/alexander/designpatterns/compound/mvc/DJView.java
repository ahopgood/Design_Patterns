package com.alexander.designpatterns.compound.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DJView implements ActionListener, BeatObserver, BPMObserver {

	private BeatModelInterface model;
	private ControllerInterface controller;
	private JFrame viewFrame;
	private JPanel viewPanel;
	private BeatBar beatBar;
	private JLabel bpmOutputLabel;
	
	public DJView(ControllerInterface controller, BeatModelInterface model){
		this.controller = controller;
		this.model 		= model;
		model.registerObserver((BeatObserver)this);
		model.registerObserver((BPMObserver)this);
	}
	
	public void createView(){
		//Create all Swing components here
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public void updateBeat(){
		int bpm = model.getBPM();
		if (bpm == 0){
			bpmOutputLabel .setText("offline");
		} else {
			bpmOutputLabel.setText("Current BPM: " + model.getBPM());
		}
	}
	
	public void updateBeat(){
		beatBar.setValue(100);
	}
}
