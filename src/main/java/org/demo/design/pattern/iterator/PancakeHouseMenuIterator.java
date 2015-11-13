package org.demo.design.pattern.iterator;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {

	List<MenuItem> menuItems;
	int position;

	public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public Object next() {
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

}
