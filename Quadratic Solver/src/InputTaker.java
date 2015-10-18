
public class InputTaker {
	public static void main(String args[]){	
	// A Term
		char term = 'A';
		Methods main = new Methods();
		System.out.println("Note: Please don't enter fractions, only decimals.");
		double aterm = main.termnumber(term);
		System.out.println("A term = " + aterm);
	// B Term
		term = 'B';
		double bterm = main.termnumber(term);
		System.out.println("B term = " + bterm);
	//C Term
		term = 'C';
		double cterm = main.termnumber(term);
		System.out.println("C term = " + cterm);
	//Calculate
		double discriminant = main.calculatediscriminant(aterm, bterm, cterm);
		System.out.println("Discriminant = " + discriminant);
		boolean check = true;
		double x1 = main.calculatefinal(check, aterm, bterm, cterm, discriminant);
		check = false;
		double x2 = main.calculatefinal(check, aterm, bterm, cterm, discriminant);
	//Display
		System.out.println("The equation: "+aterm+"x^2 + "+bterm+"x + "+cterm);
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