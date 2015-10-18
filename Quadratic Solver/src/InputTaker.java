
public class InputTaker {
	public static void main(String args[])
		throws java.io.IOException{
	// A Term
		char term = 'A';
		Methods q = new Methods();
		System.out.println("Note: Please don't enter fractions, only decimals.");
		double aterm = q.termnumber(term);
		System.out.println("A term = " + aterm);
	// B Term
		term = 'B';
		double bterm = q.termnumber(term);
		System.out.println("B term = " + bterm);
	//C Term
		term = 'C';
		double cterm = q.termnumber(term);
		System.out.println("C term = " + cterm);
	//Constructor
		q.setvalues(aterm, bterm, cterm);
	//Calculate
		q.setDiscriminant();
		boolean check = true;
		double x1 = q.getX(check);
		check = false;
		double x2 = q.getX(check);
	//Display
		System.out.println("The equation: "+aterm+"x^2 + "+bterm+"x + " + cterm);
		System.out.println("X = "+x1);
		System.out.println("X = "+x2);
		System.out.println("If it is equal to NaN, then the roots are imaginary");
	}
		
}

// To do list:
// Add ability to give fraction answer
// 		Also, make the fraction answer have +/- sign
// Possible add ability to do imaginary numbers?
// Add an "Are you sure?" function