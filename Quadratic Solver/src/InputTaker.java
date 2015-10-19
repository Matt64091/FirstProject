
public class InputTaker {
	public static void main(String args[])
		throws java.io.IOException{
		int answertype;
		double x1 = 1;
		double x2 = 1;
		String x3 = "Error";
	// A Term
		char term = 'A';
		Quadratic q1 = new Quadratic();
		System.out.println("Note: Please don't enter fractions, only decimals.");
		double aterm = q1.termnumber(term);
		System.out.println("A term = " + aterm);
	// B Term
		term = 'B';
		double bterm = q1.termnumber(term);
		System.out.println("B term = " + bterm);
	//C Term
		term = 'C';
		double cterm = q1.termnumber(term);
		System.out.println("C term = " + cterm);
	//Constructor
		q1.Quadratic(aterm, bterm, cterm);
	//Determine answer type
		answertype = q1.answertype();
	//Calculate
		q1.setDiscriminant();
	if(answertype==1){
		boolean check = true;
		x1 = q1.getX(check);
		check = false;
		x2 = q1.getX(check);
	}
	else if(answertype==0){
		x3 = q1.getX();
	}
	else{
		
	}
	//Display
		System.out.println("The equation: "+aterm+"x^2 + "+bterm+"x + " + cterm);
		if(answertype==1) {System.out.println("X = "+x1); System.out.println("X = "+x2);}
		if(answertype==0) System.out.println("X = "+x3);
		System.out.println("If it is equal to NaN, then the roots are imaginary");
	}
		
}

// To do list:
// Effictify the code (the fraction calculating)
// 		Add modulus functionality (make fraction into simplist form)
//		Add ability to put it in simpliest radical form
// Possible add ability to do imaginary numbers?
// Add an "Are you sure?" function