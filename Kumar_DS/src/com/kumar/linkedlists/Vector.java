package com.kumar.linkedlists;

public class Vector {
	private int array[];
	private int size;
	private int capacity;

	Vector(int capacity) {
		this.capacity = capacity;
		this.size = 0;
		this.array = new int[capacity];
	}

	private int doubleVector() {
		int oldcapacity;
		int oldarray[];
		oldcapacity = this.capacity;
		oldarray = this.array;
		this.capacity *= 2;
		this.array = new int[this.capacity];

		for (int i = 0; i < oldcapacity; i++)
			this.array[i] = oldarray[i];
		return 1;
	}

	public void insert(int x) {
		int status = -1;
		if (this.size == this.capacity)
			status = doubleVector();
		if (status == 1)
			this.array[this.size++] = x;
	}

	public void delete(int x) {
		int i, j;
		for (i = 0; i < this.size; i++) {
			if (this.array[i] == x) {
				for (j = i; j < this.size - 1; j++)
					this.array[j] = this.array[j + 1];
				this.size--;
				break;
			}
		}
	}
}
