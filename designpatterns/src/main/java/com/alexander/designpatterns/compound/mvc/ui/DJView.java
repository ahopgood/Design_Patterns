package com.alexander.designpatterns.compound.mvc.ui;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.alexander.designpatterns.compound.mvc.BPMObserver;
import com.alexander.designpatterns.compound.mvc.BeatModelInterface;
import com.alexander.designpatterns.compound.mvc.BeatObserver;

public class DJView implements ActionListener, BeatObserver, BPMObserver {
	
	private BeatModelInterface model;
	private ControllerInterface controller;
	private JLabel bpmLabel;
	private TextField bpmTextField;
	private JButton setCPMButton;
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
}
