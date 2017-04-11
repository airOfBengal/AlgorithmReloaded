import java.util.Scanner;
import java.math.BigInteger;
import org.airofbengal.math.*;

public class Main{

	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter n = ");
		long n = inp.nextLong();
		
		if(NumberTheory.isTriangularNumber(n)){
			System.out.println(n +" is a Triangular Number.");
		}else{
			System.out.println(n+" is not a Triangular Number.");
		}
	}
}