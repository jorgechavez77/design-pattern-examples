package org.demo.design.pattern.command;

public class HottubeOnCommand implements Command {

	Hottube hottube;

	public HottubeOnCommand(Hottube hottube) {
		this.hottube = hottube;
	}

	@Override
	public void execute() {
		hottube.setTemperature(104);
		hottube.jetsOn();
	}

	@Override
	public void undo() {
	}

}
