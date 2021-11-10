package edu.mills.cs124.Assignment9;

public class ChainHashMap<K, V> extends AbstractMap<K, V> {

	private static class Node<K, V> {
		MapEntry<K, V> element;
		Node<K, V> next;
		
		// Constructor for a node
		public Node(K key, V value) {
			element = new MapEntry<K, V>(key, value);
			next = null;
		}
	}
	
	// The hash table itself (array of nodes)
	private Node<K, V>[] table;
	// Number of entries
	private int numEntries;
	// Capacity
	private int capacity;
	
	// Constructor
	
	@SuppressWarnings("unchecked")
	public ChainHashMap() {
		capacity = 17;
		numEntries = 0;
		table = (Node<K, V>[]) new Node[capacity];
	}
	
	// Determine which bucket a given key goes in
	private int bucket(K key) {
		return key.hashCode() % capacity;
	}
	
	@Override
	public int size() {

		return 0;
	}

	@Override
	public boolean isEmpty() {

		return false;
	}

	@Override
	public V get(K key) {

		return null;
	}

	@Override
	public V put(K key, V value) {

		return null;
	}

	@Override
	public V remove(K key) {

		return null;
	}

}
