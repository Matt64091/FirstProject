import java.util.Scanner;
class Quadratic {
	private double a,b,c,bottom,discriminent;
	private int answertype; //1=decimal, 0=fraction
	//Constructor
	void Quadratic(double a, double b, double c){
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
	// Decide what output you want
	int answertype(){
		Scanner userinputscan = new Scanner(System.in);
		String userinput;
		do{
		System.out.println("How do you want the answer to be?");
		System.out.println("Choices: fraction, decimal");
		userinput = userinputscan.nextLine();
		if (userinput.equalsIgnoreCase("fraction")){ answertype=0; break;}
		if (userinput.equalsIgnoreCase("decimal")){ answertype=1; break;}
		System.out.println("Error! Please try again.");
		}while(!userinput.equalsIgnoreCase("fraction") || !userinput.equalsIgnoreCase("decimal"));
		return answertype;
	}
	//Calculate the discriminent
	void setDiscriminant(){
		discriminent = b*b-4*a*c;
		if(answertype==1)discriminent = Math.sqrt(discriminent);
		bottom = 2*a;
	}
	//Calculate the roots(decimal)
	double getX(boolean check){
		double xterm=0;
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
	//Calculate the roots(fraction)
	String getX(){
		String xterm = (-b + "\u00B1\u221A" + discriminent + "\n    ---------\n       " + bottom);
		return xterm;
		
	}
}
