package org.demo.design.pattern.command;

import org.junit.Test;

public class RemoteLoader {

	@Test
	public void test() {
		RemoteControl remoteControl = new RemoteControl();
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");

	}

}
