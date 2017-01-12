package com.hackerrank.days30ofcode.complements;

class Student extends OtherPerson {
	private int[] testScores;

	Student(String firstName, String lastName, int identification, int[] scores) {
		super(firstName, lastName, identification);
		this.testScores = scores;
	}

	public String calculate() {
		int sumScore = 0;
		int media = 0;
		for (int score : testScores) {
			sumScore += score;
		}
		media = sumScore / testScores.length;

		return getNote(media);
	}

	private String getNote(int media) {
		if (media <= 100 && media >= 90) {
			return "O";
		} else if (media < 90 && media >= 80) {
			return "E";
		} else if (media < 80 && media >= 70) {
			return "A";
		} else if (media < 70 && media >= 55) {
			return "P";
		} else if (media < 55 && media >= 40) {
			return "D";
		} else {
			return "T";
		}
	}
}