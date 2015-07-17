
public class Run {
	public static void main(String args[])
			throws java.io.IOException{
			char answer, ignore;
			Methods question = new Methods();
			
			System.out.println("Hello! Do you know who I am?");
			System.out.println("Please reply with either y for yes or n for no:");
			
			for(;;) {
				do {
					answer = (char) System.in.read();
					
					do {
						ignore = (char) System.in.read();
					}while (ignore != '\n');
				}while (!question.isValid(answer));
				question.Q1(answer);
				
				System.out.println("On a scale of 1-9, how much do you like nuts?");
				
				for(;;) {
					do {
						answer = (char) System.in.read();
						do {
							ignore = (char) System.in.read();
						}while (ignore != '\n');
					}while (!question.isValid2(answer));
					question.Q2(answer);
				}
				if (answer != '1')
				{
					System.out.println("Do you want some of these nuts?");
					for(;;) {
						do {
							answer = (char) System.in.read();
							do {
								ignore = (char) System.in.read();
							}while (ignore != '\n');
						}while (!question.isValid2(answer));
						question.Q3(answer);
				}
		}
}
}
}
