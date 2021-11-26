import java.util.Scanner;

public class testCalculator {

	public static void main(String[] args) {
		testCalculator test= new testCalculator();
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter First Number to perform BASIC mathematic operation");
		double A = s.nextDouble();
		System.out.println("Please Enter Second Number to perform BASIC mathematic operation");
		double B = s.nextDouble();
		double C = A+B;
		System.out.println("The value of addition is "+C);
		double D = A-B;
		System.out.println("The value of subtract is "+C);
		double E = A*B;
		System.out.println("The value of multiplication is "+C);
		double F = A%B;
		System.out.println("The value of division is "+C);
		
	
	}
}	
