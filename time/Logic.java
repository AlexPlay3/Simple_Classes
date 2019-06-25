package by.http.hw.oop.time;

public class Logic {
	
	public void setTime(Time time, int hour, int minute, int second) {
		if (second >= 0 & second < 60) {
			time.setSecond(second);
		} else {
			time.setSecond(0);
		}
		if (minute >= 0 & minute < 60) {
			time.setMinute(minute);
		} else {
			time.setMinute(0);
		}
		if (hour >= 0 & hour < 24) {
			time.setHour(hour);
		} else {
			time.setHour(0);
		}
	}

	public void printTime(Time time) {

		System.out.println("Time is " + time.getHour() + " hours, " + time.getMinute() + " minutes, " + time.getSecond()
				+ " seconds.");

	}

	public void addHour(Time time, int hour) {
		if (hour >= 0) {
			int t = time.getHour() + hour;
			while (t >= 24) {
				t %= 24;
			}
			time.setHour(t);
		}
	}

	public void addMinute(Time time, int minute) {
		if (minute >= 0) {
			if ((time.getMinute() + minute) > 60) {
				this.addHour(time, minute / 60);
			}
			
			minute = time.getMinute() + minute % 60;
			
			if (minute > 60){
				this.addHour(time, minute / 60);
				minute = minute % 60;
			}
			time.setMinute(minute);
		}
	}

	public void addSecond(Time time, int second) {
		if (second >= 0) {
			if ((time.getSecond() + second) > 60) {
				this.addMinute(time, second / 60);
			} 
			
			second = time.getSecond() + second % 60;
			
			if (second > 60){
				this.addMinute(time, second / 60);
				second = second % 60;
			}
			time.setSecond(second);
		}
	}

}
