package com.oogzy.dice

import java.text.MessageFormat
import java.util.Random

public class Dice
{
	private static final Random RANDOM = new Random()

	private final int sides

	public Dice(int sides) {
		this.sides = sides
	}

	public int getSides() {
		return sides
	}

	public DiceResults roll(int timesToRoll) {
		int[] results = new int[timesToRoll]
		for (int t = 0; t < timesToRoll; t++) {
			results[t] = roll()
		}
		return new DiceResults(this, results)
	}

	public int roll() {
		return RANDOM.nextInt(sides) + 1
	}

	public String toString() {
		return String.format("D%s", getSides())
	}
}