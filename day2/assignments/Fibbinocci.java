package week2.day2.assignments;

public class Fibbinocci {
	public static void main(String[] args) {
		int firstnum = 0,secondnum = 1,sum = 0;
		System.out.print("The firstnum is " +firstnum + "\n" +"The second num is "+secondnum + "\n");
		for(int i=1;i<=11;i++)
		{
			sum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = sum;
			System.out.print(" " +sum);
		}
	}
}
