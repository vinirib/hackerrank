package com.hackerrank.days30ofcode.complements;

class Difference {
	private int[] elements;
	public int maximumDifference;

	public Difference(int[] elements) {
		this.elements = elements;
	}

	public void computeDifference() {
		int max = 0;
		for (int i = 0; i < elements.length - 1; i++) {
			for (int j = i + 1; j < elements.length; j++) {
				int diff = Math.abs(elements[i] - elements[j]);
				if (diff > max)
					max = diff;
			}
		}
		maximumDifference = max;
	}
}
