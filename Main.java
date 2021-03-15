package by.htp.les01.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double a = 0;
		double b = 0;
		double c = 0;

		Scanner sc = new Scanner(System.in);

		//////////////////////////

		System.out.println("Введите a: ");

		while (!sc.hasNextDouble()) {
			sc.nextDouble();
			System.out.println("Введите a: ");
		}
		a = sc.nextDouble();

		System.out.println("Введите b: ");

		while (!sc.hasNextDouble()) {
			sc.nextDouble();
			System.out.println("Введите b: ");
		}
		b = sc.nextDouble();

		///////////////////////////

		System.out.println("Введите c: ");

		while (!sc.hasNextDouble()) {
			sc.nextDouble();
			System.out.println("Введите c: ");
		}
		c = sc.nextDouble();

		double temp;
		double z;

		temp = 2 * a;

		if (temp != 0) {
			z = (b + Math.sqrt((Math.pow(b, 2)) + 4 * a * c)) / temp - (Math.pow(a, 3)) * c + b;
		} else {
			System.out.println("Знаменатель равен нулю");
			z = Double.NaN;
		}
		System.out.println("z=" + z);

	}

}
