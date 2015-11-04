package org.demo.design.pattern.command;

public class Stereo {

	String name;

	public Stereo(String name) {
		this.name = name;
	}

	void on() {
		System.out.println("Stereo is on");
	}

	void off() {
	}

	void setCd() {
		System.out.println("Stereo CD has been set");
	}

	void setDvd() {
	}

	void setRadio() {
	}

	void setVolume(int volume) {
		System.out.println("Stereo Volume set to " + volume);
	}

	@Override
	public String toString() {
		return "Stereo [name=" + name + "]";
	}

}
