package org.demo.design.pattern.command;

public class HottubeOffCommand implements Command {

	Hottube hottube;

	public HottubeOffCommand(Hottube hottube) {
		this.hottube = hottube;
	}

	@Override
	public void execute() {
		hottube.jetsOff();
		hottube.setTemperature(98);
	}

	@Override
	public void undo() {
	}

}
