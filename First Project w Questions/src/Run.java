
public class Run {
	public static void main(String args[])
			throws java.io.IOException{
			int random;
			String userinput = "";
			Methods question = new Methods();
			do{
			System.out.println("Please enter a command:");
			userinput = question.takeuserinput();
			question.startupcommand(userinput);
			}while(!userinput.equals("continue"));
			System.out.println("Pick your subject:(coming soon)");
			random = question.randommeth();
			question.choice(random);
		}
}