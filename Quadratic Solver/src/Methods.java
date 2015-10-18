import java.util.Scanner;
public class Methods {
	double a,b,c;
	double discriminent;
	//Constructor
	void setvalues(double a, double b, double c){
		this.a=a;
		this.b=b;
		this.c=c;		
	}
	// Get term value
	double termnumber(char term){
	Scanner userinputscan = new Scanner(System.in);
	System.out.println("Please enter the " + term + " term:");
	double userinputint = userinputscan.nextInt();
	return userinputint;
	}
	//Calculate the discriminent
	void setDiscriminant(){
		discriminent = b*b-4*a*c;
		discriminent = Math.sqrt(discriminent);
	}
	//Calculate the roots
	double getX(boolean check){
		double xterm=0;
		double bottom = 2*a;
		if(check){
			double top = -b + discriminent;
			xterm = top / bottom;
		}
		else if(!check){
			double top = -b - discriminent;
			xterm = top / bottom;
		}
		return xterm;
	}
}
