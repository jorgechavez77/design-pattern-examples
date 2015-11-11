package org.demo.design.pattern.facade;

public class Projector {

	DvdPlayer dvdPlayer;

	public void on() {
		System.out.println("Projector is on");
	}

	public void off() {
		System.out.println("Projector is off");
	}

	public void tvMode() {
	}

	public void wideScreenMode() {
		System.out.println("Screen is on wide mode");
	}

	public void setInput(DvdPlayer dvdPlayer) {
		this.dvdPlayer = dvdPlayer;
	}

}
