package com.training.project.triangle;

public class Triangle {
	
	    private Point top1;
	    private Point top2;
	    private Point top3;

	    public Triangle(Point top1, Point top2, Point top3) {
	        this.top1 = top1;
	        this.top2 = top2;
	        this.top3 = top3;
	    }
	    
	    public double getArea() {
	        double side1 = top1.distanceTo(top2);
	        double side2 = top2.distanceTo(top3);
	        double side3 = top3.distanceTo(top1);
	        
	        double semiPerimeter = (side1 + side2 + side3) / 2;
	        
	        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
	    }
	    
	    public double getPerimeter() {
	        double side1 = top1.distanceTo(top2);
	        double side2 = top2.distanceTo(top3);
	        double side3 = top3.distanceTo(top1);
	        
	        return side1 + side2 + side3;
	    }
	    
	    public Point getMedian() {
	        double x = (top1.getX() + top2.getX() + top3.getX()) / 3;
	        double y = (top1.getY() + top2.getY() + top3.getY()) / 3;
	        
	        return new Point(x, y);
	    }
	}

