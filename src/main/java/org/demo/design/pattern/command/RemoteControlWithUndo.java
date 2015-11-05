package org.demo.design.pattern.command;

public class RemoteControlWithUndo {

	private Command[] onCommands;
	private Command[] offCommands;
	private Command undoCommand;

	public RemoteControlWithUndo() {
		onCommands = new Command[7];
		offCommands = new Command[7];

		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}

	public void undoButtonWasPushed() {
		undoCommand.undo();
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\n--------------Remote Control--------------\n");
		for (int i = 0; i < onCommands.length; i++) {
			buffer.append("[slot " + i + "] "
					+ onCommands[i].getClass().getName() + " "
					+ offCommands[i].getClass().getName() + "\n");
		}
		buffer.append("[undo] " + undoCommand.getClass().getName() + "\n");
		return buffer.toString();
	}

}
