package com.training.exproject.main;

public class Main {

	public static void main(String[] args) {

		Time time = new Time(12, 30, 45);
		System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond()); // Вывод: 12:30:45

		time.setHour(25);
		time.setMinute(70);
		time.setSecond(90);
		System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond()); // Вывод: 0:0:0

		time.setTime(9, 45, 20);
		System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond()); // Вывод: 9:45:20

		time.addHours(5);
		time.addMinutes(20);
		time.addSeconds(30);
		System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond()); // Вывод: 14:5:50
	}
}
