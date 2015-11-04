package org.demo.design.pattern.command;

@Deprecated
public class SimpleRemoteControl {

	Command slot;

	public SimpleRemoteControl() {
	}

	public void setSlot(Command slot) {
		this.slot = slot;
	}

	public void buttonWasPressed() {
		slot.execute();
	}

}
