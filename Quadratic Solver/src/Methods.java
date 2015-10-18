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
		if(check){
			xterm = -b + discriminant / 2*a;
		}
		else if(!check){
			xterm = -b - discriminant / 2*a;
		}
		return xterm;
	}
}
