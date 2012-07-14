package com.alexander.designpatterns.compound.mvc;

public class HeartController implements ControllerInterface {

	private HeartModelInterface model;
	private DJView view;
	
	public HeartController(HeartModelInterface model){
		this.model = model;
		view = new DJView(this, new HeartAdapter(model));
		view.createView();
		view.createControls();
		view.disableStopMenuItem();
		view.disableStartMenuItem();
	}
	
	@Override
	public void start() {
		
	}

	@Override
	public void stop() {
		
	}

	@Override
	public void increaseBPM() {
		
	}

	@Override
	public void decreaseBPM() {
		
	}

	@Override
	public void setBPM(int bpm) {
		
	}

}
