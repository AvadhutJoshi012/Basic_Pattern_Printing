package com.Patterns;

public class StraPatterns {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("A ");
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 4 || j == 5 || i == 1 || j == 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println();
		int num = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				int sum = i + j;
				if (sum % 2 == 0) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}

	}

}
