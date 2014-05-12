/*Testing of hash table*/
package com.kumar.hashtable;

public class HashTableTest {

	public static void main(String[] args) {
		HashTable1 h = new HashTable1(10);
		for (int i = 0; i < 500; i++) {
			h.add(i);
		}
		h.add(13001);
		System.out.println(h.find(12000));
		System.out.println(h.remove(12000));
		System.out.println(h.find(12000));
	}
}
