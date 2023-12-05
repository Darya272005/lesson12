package com.training.exproject.package2;

public class Meter {
	private int number;
	private int minNumber;
	private int maxNumber;

	public Meter() {
		this.number = 0;
		this.minNumber = 0;
		this.maxNumber = 10;
	}

	public Meter(int number, int minNumber, int maxNumber) {
		this.number = number;
		this.minNumber = minNumber;
		this.maxNumber = maxNumber;
	}

	public int getNumber() {
		return number;
	}

	public void growth() {
		if (number < maxNumber) {
			number++;
		}
	}

	public void drop() {
		if (number > minNumber) {
			number--;
		}
	}

	public static void main(String[] args) {
		Meter meter1 = new Meter();
		System.out.println("Значение счетчика по умолчанию: " + meter1.getNumber());

		Meter meter2 = new Meter(5, 0, 10);
		System.out.println("Значение пользовательского счетчика: " + meter2.getNumber());

		meter1.growth();
		System.out.println("Увеличение значения счетчика: " + meter1.getNumber());

		meter2.drop();
		System.out.println("Уменьшенное значение счетчика: " + meter2.getNumber());
	}
}
