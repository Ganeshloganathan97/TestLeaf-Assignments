package week2.day2.assignments;

public class Is_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6, sub = 0;
		for(int i=2;i<a/2;i++)
		{
			if(a%i==0)
			{
				System.out.println("Given Number "+ a +" is not a Prime Number");
				sub=1;
				break;
			}
		}
		if(sub==0)
		{
			System.out.println("Given Number "+ a +" is a Prime Number");
		}
	}
}
