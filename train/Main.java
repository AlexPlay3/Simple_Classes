package by.http.hw.oop.train;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
        Train[] trainList = new Train[5]; 
		
		trainList[0] = new Train("Borisov", 1, 12, 35, 00);	
		trainList[1] = new Train("Slutsk", 2, 19, 40, 00 );
		trainList[2] = new Train("Gomel", 3, 16, 10, 00);
		trainList[3] = new Train("Vitebsk", 4, 18, 20, 00);
		trainList[4] = new Train("Lida", 5, 14, 20, 00);
		
		
		for(Train train : trainList ) {
			System.out.println(train);
		}
		
		Train[] sortedTrainList = TrainLogic.sortByNumber(trainList);
		System.out.println();
		for(Train train : sortedTrainList ) {
			System.out.println(train);
		}		
		
		
		Train[] sortedTrainList2 = TrainLogic.sortByName(trainList);
		System.out.println();
		for(Train train : sortedTrainList2 ) {
			System.out.println(train);
		}		
		
		int inputNumber = enterInt("Enter train number : ");
		
		System.out.println(TrainLogic.showInfo(trainList,inputNumber));
	}
	
	
	public static int enterInt(String message) {
		int x;

	    Scanner sc = new Scanner(System.in);

	    System.out.println(message);

	    while (!sc.hasNextFloat()) {

	      String s;
	      s = sc.next();
	      System.out.println("Enter int type ! " + s);
	      System.out.println(message);
	    }
	    x = sc.nextInt();
	    return x;
	  }

	

}
