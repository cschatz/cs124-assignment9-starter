package edu.mills.cs124.Assignment9;

public class ProbeHashMap<K, V> extends AbstractMap<K, V> {

	// The hash table itself
	MapEntry<K, V>[] table;
	// Number of entries
	private int numEntries;
	// Capacity
	private int capacity;
	
	// Constructor
	public ProbeHashMap() {
		capacity = 17;
		numEntries = 1;
		table = (MapEntry<K, V>[]) new MapEntry[capacity];
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
