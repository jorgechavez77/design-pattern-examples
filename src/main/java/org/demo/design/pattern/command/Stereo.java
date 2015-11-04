package org.demo.design.pattern.command;

public class Stereo {

	String name;

	public Stereo(String name) {
		this.name = name;
	}

	void on() {
		System.out.println(name + " stereo is on");
	}

	void off() {
		System.out.println(name + " stereo is off");
	}

	void setCd() {
		System.out.println(name + " stereo is set for CD input");
	}

	void setDvd() {
	}

	void setRadio() {
	}

	void setVolume(int volume) {
		System.out.println(name + " stereo Volume set to " + volume);
	}

	@Override
	public String toString() {
		return "Stereo [name=" + name + "]";
	}

}
