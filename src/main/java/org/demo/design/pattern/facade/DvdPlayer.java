package org.demo.design.pattern.facade;

public class DvdPlayer {

	Amplifier amplifier;

	public void on() {
		System.out.println("DVD is on");
	}

	public void off() {
		System.out.println("DVD off");
	}

	public void eject() {
		System.out.println("DVD eject");
	}

	public void pause() {
	}

	public void play(String movie) {
		System.out.println("DVD play movie " + movie);
	}

	public void setSurroundAudio() {
	}

	public void setTwoChannelAudio() {
	}

	public void stop() {
		System.out.println("DVD stop");
	}

}
