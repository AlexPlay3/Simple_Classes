package by.http.hw.oop.time;

public class Main {
	
	public static void main (String[] args) {
		
		Time time = new Time(9,5,4);
		Logic logic = new Logic();
		
		logic.printTime(time);
		
		logic.addSecond(time, 51);
		logic.printTime(time);		
		logic.addMinute(time, 77);
		logic.printTime(time);
		logic.addSecond(time, 4);
		logic.printTime(time);
		
	}

}
