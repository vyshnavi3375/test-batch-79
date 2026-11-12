package com.arrays;

public class TestArrDemo1 {

	public static void main(String[] args) {
		int[] ages;
		ages = new int[10];
		ages[0] = 22;
		ages[1] = 21;
		ages[2] = 28;
		ages[3] = 21;
		ages[4] = 20;
		ages[5] = 24;
		ages[6] = 27;
		ages[7] = 29;
		ages[8] = 22;
		ages[9] = 23;

		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);

		}
	}
}
