package org.demo.design.pattern.template.cp;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {

	private static final long serialVersionUID = 1L;

	String message;

	@Override
	public void init() {
		message = "Hello World, I'm alive!";
		repaint();
	}

	@Override
	public void start() {
		message = "Now I'm starting up...";
		repaint();
	}

	@Override
	public void stop() {
		message = "Now, I'm being stopped...";
		repaint();
	}

	@Override
	public void destroy() {
		//
	}

	@Override
	public void paint(Graphics g) {
		g.drawString(message, 5, 15);
	}

}
