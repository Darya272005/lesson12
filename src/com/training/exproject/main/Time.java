package com.training.exproject.main;

public class Time {

	    private int hour;
	    private int minute;
	    private int second;

	    public Time(int hour, int minute, int second) {
	        setTime(hour, minute, second);
	    }

	    public void setTime(int hour, int minute, int second) {
	        if (hour >= 0 && hour < 24) {
	            this.hour = hour;
	        } else {
	            this.hour = 0;
	        }

	        if (minute >= 0 && minute < 60) {
	            this.minute = minute;
	        } else {
	            this.minute = 0;
	        }

	        if (second >= 0 && second < 60) {
	            this.second = second;
	        } else {
	            this.second = 0;
	        }
	    }

	    public void setHour(int hour) {
	        if (hour >= 0 && hour < 24) {
	            this.hour = hour;
	        } else {
	            this.hour = 0;
	        }
	    }

	    public void setMinute(int minute) {
	        if (minute >= 0 && minute < 60) {
	            this.minute = minute;
	        } else {
	            this.minute = 0;
	        }
	    }

	    public void setSecond(int second) {
	        if (second >= 0 && second < 60) {
	            this.second = second;
	        } else {
	            this.second = 0;
	        }
	    }

	    public int getHour() {
	        return hour;
	    }

	    public int getMinute() {
	        return minute;
	    }

	    public int getSecond() {
	        return second;
	    }

	    public void addHours(int hours) {
	        int newHour = hour + hours;
	        if (newHour >= 0 && newHour < 24) {
	            hour = newHour;
	        } else {
	            hour = newHour % 24;
	        }
	    }

	    public void addMinutes(int minutes) {
	        int newMinute = minute + minutes;
	        int extraHours = newMinute / 60;
	        if (newMinute >= 0 && newMinute < 60) {
	            minute = newMinute;
	        } else {
	            minute = newMinute % 60;
	            addHours(extraHours);
	        }
	    }

	    public void addSeconds(int seconds) {
	        int newSecond = second + seconds;
	        int extraMinutes = newSecond / 60;
	        if (newSecond >= 0 && newSecond < 60) {
	            second = newSecond;
	        } else {
	            second = newSecond % 60;
	            addMinutes(extraMinutes);
	        }
	    }
	}
	

