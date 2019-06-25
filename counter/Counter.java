package by.http.hw.oop.counter;

import java.util.Objects;

public class Counter {
	
	private  int counter;


    public Counter( int  counter) {
        this.counter = counter;

    }




    public int getCounter() {
        return counter;
    }




    public void setCounter(int counter) {
        this.counter = counter;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Counter)) return false;
        Counter that = (Counter) o;
        return getCounter() == that.getCounter();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCounter());
    }

    @Override
    public String toString() {
        return "BasicCounter{" +
                "counter=" + counter +
                '}';
    }
}


