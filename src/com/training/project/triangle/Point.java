package com.training.project.triangle;

public class Point {

	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double distanceTo(Point otherPoint) {
		double dx = this.x - otherPoint.getX();
		double dy = this.y - otherPoint.getY();

		return Math.sqrt(dx * dx + dy * dy);
	}
}
