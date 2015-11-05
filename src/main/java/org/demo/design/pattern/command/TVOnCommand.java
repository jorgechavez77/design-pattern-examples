package org.demo.design.pattern.command;

public class TVOnCommand implements Command {

	TV tv;

	public TVOnCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.on();
		tv.setInputChannel(99);
	}

	@Override
	public void undo() {
	}

}
