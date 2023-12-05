package com.training.project.triangle;

public class Main {

	public static void main(String[] args) {
		Point top1 = new Point(0, 0);
		Point top2 = new Point(4, 0);
		Point top3 = new Point(0, 3);

		Triangle triangle = new Triangle(top1, top2, top3);

		double area = triangle.getArea();
		System.out.println("Площадь треугольника: " + area);

		double perimeter = triangle.getPerimeter();
		System.out.println("Периметр треугольника: " + perimeter);

		Point median = triangle.getMedian();
		System.out.println("Точка пересечения медиан: (" + median.getX() + ", " + median.getY() + ")");
	}
}
