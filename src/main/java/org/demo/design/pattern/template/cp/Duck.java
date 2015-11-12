package org.demo.design.pattern.template.cp;

public class Duck implements Comparable<Duck> {

	String name;
	int weight;

	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Duck [name=" + name + ", weight=" + weight + "]";
	}

	@Override
	public int compareTo(Duck duck) {
		if (this.weight < duck.weight) {
			return -1;
		} else if (this.weight == duck.weight) {
			return 0;
		} else {
			return 1;
		}
	}

}
