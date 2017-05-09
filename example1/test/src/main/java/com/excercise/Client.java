package com.excercise;

import java.util.Iterator;
import java.util.List;

public class MIterator<E> {

	private Iterator<List<E>> root;

	private Iterator<E> currentItr;

	private E current;

	public MIterator(Iterator<List<E>> root) {
		this.root = root;
		if (root.hasNext()) {
			currentItr = root.next().iterator();
		} 
	}

	public boolean hasNext() {
		if (currentItr.hasNext()) {
			return true;
		} else if (root.hasNext()) {
			currentItr = root.next().iterator();
			if (currentItr.hasNext()) {
				return true;
			}
		}
		return false;
		// return root.hasNext();
	}

	public E next() throws Exception {
		
		if (currentItr.hasNext()) {
			current = currentItr.next();
		} else if (root.hasNext()) {
			currentItr = (Iterator<E>) ((List<E>) root.next()).iterator();
			if (currentItr.hasNext()) {
				current = currentItr.next();
			}

		} else {
			throw new Exception("No more elemnts");
		}
		return current;
	}

	public void remove() {
		currentItr.remove();
	}

}
