import java.util.Scanner;
public class Methods {
	// Get term value
	double termnumber(char term){
	Scanner userinputscan = new Scanner(System.in);
	System.out.println("Please enter the " + term + " term:");
	double userinputint = userinputscan.nextInt();
	return userinputint;
	}
	//Calculate the discriminant
	double calculatediscriminant(double a, double b, double c){
		double discriminent = b*b-4*a*c;
		discriminent = Math.sqrt(discriminent);
		return discriminent;
	}
	double calculatefinal(boolean check, double a, double b, double c, double discriminant){
		double xterm=0;
		double bottom = 2*a;
		if(check){
			double top = -b + discriminant;
			xterm = top / bottom;
		}
		else if(!check){
			double top = -b - discriminant;
			xterm = top / bottom;
		}
		return xterm;
	}
}
