package by.http.hw.oop.train;

public class TrainLogic {
	
	public static Train[] sortByNumber(Train[] trains) {

		java.util.Arrays.sort(trains, Train.COMPARE_BY_TRAINNUMBER);

		return trains;
	}

	public static Train[] sortByName(Train[] trains) {

		java.util.Arrays.sort(trains, Train.COMPARE_BY_NAME);

		return trains;
	}

	public static String showInfo(Train[] trains, int trainNumber) {
		for (Train train : trains) {
			if (train.getTrainNumber() == trainNumber) {
				return train.toString();
			}
		}
		return "the train with number " + trainNumber + " is missing";
	


		}

	}

