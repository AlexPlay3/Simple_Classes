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

        System.out.print("������� �������� ����������� �������� �� 0 �� 9: ");

        do {

            while (!firstvalue.hasNextInt() ) {

                inputvalue = firstvalue.nextLine();

                System.out.println(" �������� �������� �� ����� : " + inputvalue);
                System.out.println("������� �������� ����������� �������� �� 0 �� 9: ");

            }

            value = firstvalue.nextInt();

            if (value < 0 || value > 9) {


                System.out.println("������� �������� ����������� �������� �� 0 �� 9: ");

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

            System.out.print("������� ��������  \" 1 \"  ���  \" -1 \"  ,   ����� ��� ����������� � �������� ��������: ");

            do {

                while (!secondvalue.hasNextInt()) {

                    String a = secondvalue.nextLine();

                    System.out.println(" �������� �������� �� ����� : " + a);
                    System.out.println("������� ��������  \" 1 \"  ���  \" -1 \"  ,   ����� ��� ����������� � �������� ��������: ");

                }

                newvalue = secondvalue.nextInt();

                if (newvalue != 1 && newvalue != -1) {

                    System.out.println(" �������� �������� �� ����� : " + newvalue);
                    System.out.println("������� ��������  \" 1 \"  ���  \" -1 \"  ,    ����� ��� ����������� � �������� ��������: ");

                }


            } while (newvalue != 1 && newvalue != -1);

            b = x + newvalue;
            x = b;

            if (b > 9 || b < 0) {

                System.out.println(" ������������ �������� : �������� ������ \"9\" ��� ������ \"0\" ");
                System.out.print(" ������� ������� �� �������� �� ��������� [0,0,0,0,0,1] \n\n");

                b = 1;

                return b;
            }


            print(b);

            System.out.print("���������� ����������?");
            System.out.print("  ������� \"1\" ���� �� |  ������� \"2\" ���� ��� | ");


            continuemath = new Scanner(System.in);



            c = continuemath.nextInt();


        } while (c == 1);

        return b;
    }



    public void print(int  a)  {

        System.out.print( "�������� ����������� �������� :   " );

        System.out.println(String.format("%4s",
                Integer.toBinaryString(a)).replaceAll(" ", "0"));

    }

}
