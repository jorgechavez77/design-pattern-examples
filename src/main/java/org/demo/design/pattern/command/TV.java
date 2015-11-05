package org.demo.design.pattern.command;

public class TV {

	String name;

	public TV(String name) {
		this.name = name;
	}

	void on() {
		System.out.println(name + " TV is on");
	}

	void off() {
		System.out.println(name + " TV is off");
	}

	void setInputChannel(int channel) {
		System.out.println(name + " TV is set to channel " + channel);
	}

	void setVolume(int volume) {
		System.out.println(name + " TV volume is set to " + volume);
	}

}
