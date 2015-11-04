package org.demo.design.pattern.command;

public class StereoWithCDCommand implements Command {

	Stereo stereo;

	public StereoWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);
	}

}
