package week1.day1.assignments;

public class Twowheeler {
	int noOfWheels;
	short noOfMirrors;
	long chassisNumber;
	boolean isPunctured;
	String bikeName;
	double runningKM = 1213443538.9;

	public static void main(String[] args) {
		Twowheeler bike = new Twowheeler();
		bike.noOfWheels = 2;
		bike.noOfMirrors = 1;
		bike.chassisNumber = 121342435454645l;
		bike.isPunctured = true;
		bike.bikeName = "Pulsar";
		bike.runningKM = 12135454.89;
		System.out.println("The Bike name is : " +bike.bikeName );
		System.out.println("Whether bike is punctured : " +bike.isPunctured );
		System.out.println("No of wheels in Bike : " +bike.noOfWheels );
		System.out.println("No of mirrors in bike : " +bike.noOfMirrors+"\n" 
		+ "Bike chassis number is : " +bike.chassisNumber );
		System.out.println("Total running KM is " +bike.runningKM );
	}

}
