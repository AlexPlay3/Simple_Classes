package by.http.hw.oop.counter;

public class Main {
	
	public static void main( String[] args) {


        Counter bc = new Counter(  0b1 ); 

        LogicCounter lc = new LogicCounter();

        lc.print(bc.getCounter());  

        int b = lc.manualControl();    

        bc.setCounter(b);

        lc.print(bc.getCounter());    

        int b2 = lc.changeValue(bc.getCounter());   

        bc.setCounter(b2);

        lc.print(bc.getCounter());




    }

}
