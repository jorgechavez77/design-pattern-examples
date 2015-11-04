package org.demo.design.pattern.command;

import org.junit.Test;

public class RemoteControlTest {

	@Test
	public void test() {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		GarageDoor garageDoor = new GarageDoor();
		Command lightOn = new LightOnCommand(light);
		Command garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

		remote.setSlot(lightOn);
		remote.buttonWasPressed();
		remote.setSlot(garageDoorOpen);
		remote.buttonWasPressed();
	}

}
