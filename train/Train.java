package by.http.hw.oop.train;

import java.time.LocalTime;
import java.util.Comparator;

public class Train {
	
	private String destination;
	private int trainNumber;
	private LocalTime departureTime;

	public Train() {

	}

	public Train(String destinationName, int trainNumber, int Hour, int Minutes, int Sec) {
		this.destination = destinationName;
		this.trainNumber = trainNumber;
		this.departureTime = LocalTime.of(Hour, Minutes, Sec);
	}

	public String getDestinationName() {
		return destination;
	}

	public void setDestinationName(String destinationName) {
		this.destination = destinationName;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public LocalTime getTimeToDeparture() {
		return departureTime;
	}

	public void setTimeToDeparture(int Hour, int Minutes, int Sec) {
		this.departureTime = LocalTime.of(Hour, Minutes, Sec);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + trainNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (trainNumber != other.trainNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Train [Destination = " + destination + ", Train number = " + trainNumber + ", Departure Time = "
				+ departureTime + "]";
	}

	public static final Comparator<Train> COMPARE_BY_TRAINNUMBER = new Comparator<Train>() {
		@Override
		public int compare(Train lhs, Train rhs) {
			return lhs.getTrainNumber() - rhs.getTrainNumber();
		}
	};

	public static final Comparator<Train> COMPARE_BY_NAME = new Comparator<Train>() {
		@Override
		public int compare(Train lhs, Train rhs) {
			int firstAtt = lhs.getDestinationName().compareTo(rhs.getDestinationName());

			if (firstAtt != 0) {
				return firstAtt;
			} else {
				return lhs.getTimeToDeparture().compareTo(rhs.getTimeToDeparture());
			}
		}
	};

}


