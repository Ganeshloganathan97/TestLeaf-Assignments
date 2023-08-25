package week1.day1.assignments;

public class Convert_positive_to_Negative {

	public static void main(String[] args) {
		int numA = -25;
		int numB;
		if (numA < 0) {
			System.out.println("The Number is Negative : " + numA);
		} else {
			System.out.println("The Number is Positive : " + numA);
		}
		numB = numA * (-1);
		System.out.println("The Number -25 is convert to " + numB);
	}
}