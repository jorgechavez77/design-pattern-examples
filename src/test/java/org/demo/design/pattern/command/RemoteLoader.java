package org.demo.design.pattern.command;

import org.junit.Test;

public class RemoteLoader {

	@Test
	public void test() {
		RemoteControl remoteControl = new RemoteControl();

		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");

		Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
		Command livingRoomLightOff = new LightOffCommand(livingRoomLight);

		Command kitchenLightOn = new LightOnCommand(kitchenLight);
		Command kitchenLightOff = new LightOffCommand(kitchenLight);

		Command ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		Command ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

		Command garageDoorUp = new GarageDoorUpCommand(garageDoor);
		Command garageDoorDown = new GarageDoorDownCommand(garageDoor);

		Command stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		Command stereoOff = new StereoOffCommand(stereo);

		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

		System.out.println(remoteControl);

		System.out.println("slot 0");
		remoteControl.onButtonWasPressed(0);
		remoteControl.offButtonWasPressed(0);
		System.out.println("slot 1");
		remoteControl.onButtonWasPressed(1);
		remoteControl.offButtonWasPressed(1);
		System.out.println("slot 2");
		remoteControl.onButtonWasPressed(2);
		remoteControl.offButtonWasPressed(2);
		System.out.println("slot 3");
		remoteControl.onButtonWasPressed(3);
		remoteControl.offButtonWasPressed(3);
	}

}
