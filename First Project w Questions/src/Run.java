
public class Run {
	public static void main(String args[])
			throws java.io.IOException{
			int random, qvalue, identifier = 0;
			String userinput, subjectpoint;
			
			Methods defaultquestion = new Methods();
			Methods history250 = new Methods();
			Methods history1000 = new Methods();
			Methods history750 = new Methods();
			Methods history500 = new Methods();
			Methods history100 = new Methods();
			Methods logic250 = new Methods();
			
			System.out.println("To see your points at any given time just type points");
			
			do{
			System.out.println("Pick your subject:");
			userinput= defaultquestion.takeuserinput();
			identifier = defaultquestion.subjectchoice(userinput);
			}while(identifier == 0);
			
			do{
			System.out.println("Pick your point value:");
			userinput= defaultquestion.takeuserinput();
			qvalue = defaultquestion.pointchoice(userinput);
		}while(qvalue == 0);
			
	}
}