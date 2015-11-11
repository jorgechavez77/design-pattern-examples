package org.demo.design.pattern.adapter;

import org.junit.Assert;
import org.junit.Test;

public class DuckTestDrive {

	@Test
	public void test() {
		Duck duck = new MallardDuck();

		Turkey turkey = new WildTurkey();

		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("The turkey says...");
		turkey.gobble();
		turkey.fly();

		System.out.println("\nThe duck says...");
		testDuck(duck);

		System.out.println("\nThe turkeyAdapter says...");
		testDuck(turkeyAdapter);
	}

	void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}
