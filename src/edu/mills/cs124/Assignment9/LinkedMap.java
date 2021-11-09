package edu.mills.cs124.Assignment9;

public class LinkedMap<K, V> extends AbstractMap<K, V> {

	private class Node {
		MapEntry element;
		Node next;
		
		// Constructor for a node
		public Node(K key, V value) {
			element = new MapEntry(key, value);
			next = null;
		}
	}
	
	// Private variable used to manage the linked list
	private Node head;
	
	// Constructor for the a LinkedMap object
	public LinkedMap() {
		head = null;
	}
	
	@Override
	public int size() {

		return 42; // placeholder
	}

	@Override
	public boolean isEmpty() {

		return true; // placeholder
	}

	@Override
	public V get(K key) {

		return null; // placeholder
	}

	@Override
	public V put(K key, V value) {

		return null; // placeholder
	}

	@Override
	public V remove(K key) {

		return null; // placeholder
	}

}
