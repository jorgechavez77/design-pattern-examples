package org.demo.design.pattern.iterator;

import java.util.Iterator;

public interface Menu<E> {

	Iterator<E> createIterator();

}
