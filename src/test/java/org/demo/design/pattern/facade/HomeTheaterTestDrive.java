package org.demo.design.pattern.facade;

import org.junit.Test;

public class HomeTheaterTestDrive {

	@Test
	public void test() {
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(new Amplifier(),
				new Tuner(), new DvdPlayer(), new CdPlayer(), new Projector(),
				new TheaterLights(), new Screen(), new PopCornPopper());

		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
	}
}
