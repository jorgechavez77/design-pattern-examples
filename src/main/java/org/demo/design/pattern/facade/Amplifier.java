package org.demo.design.pattern.facade;

public class Amplifier {

	Tuner tuner;
	DvdPlayer dvdPlayer;
	CdPlayer cdPlayer;

	public void on() {
		System.out.println("Amplifier is on");
	}

	public void off() {
		System.out.println("Amplifier is off");
	}

	public void setCd() {
	}

	public void setDvd(DvdPlayer dvdPlayer) {
		System.out.println("Amplifier set DVD");
		this.dvdPlayer = dvdPlayer;
	}

	public void setStereoSound() {
	}

	public void setSurroundSound() {
		System.out.println("Amplifier set sorround sound");
	}

	public void setTunner() {
	}

	public void setVolume(int volume) {
		System.out.println("Amplifier set volume to " + volume);
	}

}
