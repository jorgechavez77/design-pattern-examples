package org.demo.design.pattern.adapter;

import java.util.Arrays;
import java.util.List;

import org.demo.design.pattern.adapter.example.IteratorEnumeration;
import org.junit.Test;

public class IteratorEnumerationTest {

	@Test
	public void test() {
		String[] array = { "A", "B", "C" };
		List<String> list = Arrays.asList(array);

		IteratorEnumeration<String> ie = new IteratorEnumeration<>(
				list.iterator());

		while (ie.hasMoreElements()) {
			System.out.println(ie.nextElement());
		}
	}

}
