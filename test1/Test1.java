package by.http.oop_app.test1;


public class Test1 {
	private int value1;
	private int value2;


	public Test1(int value1, int value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	public int getvalue1() {
		return value1;
	}

	public void setvalue1(int value1) {
		this.value1 = value1;
	}

	public int getvalue2() {
		return value2;
	}

	public void setvalue2(int value2) {
		this.value2 = value2;
	}

	public long sumvalue() {
		return value1 + value2;
	}

	@Override
	public String toString() {
		return "value 1 = " + value1 + ", value 2 = " + value2;
	}

	public int maxvalue() {
		if (value1 > value2) {
			return value1;
			
		} else {
		return value2;
		}
	}
}
	

