package com.alexander.designpatterns.compound.mvc;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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

	private JLabel bpmLabel;
	private TextField bpmTextField;
	private JButton setBPMButton;
	private JButton increaseBPMButton;
	private JButton decreaseBPMButton;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem startMenuItem;
	private JMenuItem stopMenuItem;
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public void createControls(){
		//Create all swing components
	}
	
	public void enableStopMenuItem(){
		stopMenuItem.setEnabled(true);
	}
	
	public void disableStopMenuItem(){
		stopMenuItem.setEnabled(false);
	}
	
	public void enableStartMenuItem(){
		startMenuItem.setEnabled(true);
	}
	
	public void disableStartMenuItem(){
		startMenuItem.setEnabled(false);
	}

	public void actionPerformed(ActionEvent event){
		if (event.getSource() == setBPMButton){
			int bpm = Integer.parseInt(bpmTextField.getText());
			controller.setBPM(bpm);
		} else if (event.getSource() == increaseBPMButton){
			controller.increaseBPM():
		} else if (event.getSource() == decreaseBPMButton){
			controller.decreaseBPM();
		}
	}
}
