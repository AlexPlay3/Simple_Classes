package by.http.oop_app.test1;

public class Main {
	
	public static void main(String[] args) {
		
		Test1 test1;
		
		test1 = new Test1(34, 7);
		
		System.out.println(test1.toString());
		System.out.println("sum is = " + test1.sumvalue());
		System.out.println("max element is - " + test1.maxvalue());

		test1.setvalue1(43);
		test1.setvalue2(3);
		
		System.out.println(test1.toString());
		System.out.println("sum = " + test1.sumvalue());
		System.out.println("max element = " + test1.maxvalue());
	}

}

