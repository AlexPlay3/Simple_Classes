package by.http.hw.oop.counter;

import java.util.Scanner;

public class LogicCounter {
	
	private Scanner firstvalue;
	private Scanner secondvalue;
	private Scanner continuemath;



	public int manualControl() {

        String inputvalue;
        int value;

        firstvalue = new Scanner(System.in);

        System.out.print("Введите значение десятичного счётчика от 0 до 9: ");

        do {

            while (!firstvalue.hasNextInt() ) {

                inputvalue = firstvalue.nextLine();

                System.out.println(" Введённое значение не верно : " + inputvalue);
                System.out.println("Введите значение десятичного счётчика от 0 до 9: ");

            }

            value = firstvalue.nextInt();

            if (value < 0 || value > 9) {


                System.out.println("Введите значение десятичного счётчика от 0 до 9: ");

            }

        }   while ( value < 0 || value > 9);

        return value;
    }



    public int changeValue(int x) {

        int newvalue;
        int b;
        int c;


        secondvalue = new Scanner(System.in);


        do {

            System.out.print("Введите значение  \" 1 \"  или  \" -1 \"  ,   чтобы оно прибавилось к значению счётчика: ");

            do {

                while (!secondvalue.hasNextInt()) {

                    String a = secondvalue.nextLine();

                    System.out.println(" Введённое значение не верно : " + a);
                    System.out.println("Введите значение  \" 1 \"  или  \" -1 \"  ,   чтобы оно прибавилось к значению счётчика: ");

                }

                newvalue = secondvalue.nextInt();

                if (newvalue != 1 && newvalue != -1) {

                    System.out.println(" Введённое значение не верно : " + newvalue);
                    System.out.println("Введите значение  \" 1 \"  или  \" -1 \"  ,    чтобы оно прибавилось к значению счётчика: ");

                }


            } while (newvalue != 1 && newvalue != -1);

            b = x + newvalue;
            x = b;

            if (b > 9 || b < 0) {

                System.out.println(" Переполнение счётчика : значение больше \"9\" или меньше \"0\" ");
                System.out.print(" счётчик сброшен до значения по умолчанию [0,0,0,0,0,1] \n\n");

                b = 1;

                return b;
            }


            print(b);

            System.out.print("Продолжить вычисления?");
            System.out.print("  Нажмите \"1\" если ДА |  Нажмите \"2\" если НЕТ | ");


            continuemath = new Scanner(System.in);



            c = continuemath.nextInt();


        } while (c == 1);

        return b;
    }



    public void print(int  a)  {

        System.out.print( "Значение десятичного счётчика :   " );

        System.out.println(String.format("%4s",
                Integer.toBinaryString(a)).replaceAll(" ", "0"));

    }

}
