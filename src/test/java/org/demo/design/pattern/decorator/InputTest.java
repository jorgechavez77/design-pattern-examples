package org.demo.design.pattern.decorator;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.demo.design.pattern.decorator.example.LowerCaseInputStream;
import org.junit.Test;

public class InputTest {

	@Test
	public void test() {
		InputStream test = ClassLoader.getSystemResourceAsStream("test.txt");

		int c;
		try {
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(
					test));
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}

			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
