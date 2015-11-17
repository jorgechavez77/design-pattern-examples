package org.demo.design.pattern.iterator;

import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {

	List<MenuItem> menuItems;
	int position;

	public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = menuItems.get(position);
		position++;
		return menuItem;
	}

	@Override
	public boolean hasNext() {
		if (position >= menuItems.size() || menuItems.get(position) == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
