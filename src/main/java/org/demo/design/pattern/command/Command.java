package org.demo.design.pattern.command;

public interface Command {

	void execute();

	void undo();

	/**
	 * To log every execution
	 */
	// void store();

	/**
	 * To load all the executions that were previously stored
	 */
	// void load();

}
