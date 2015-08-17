
public class Run {
	public static void main(String args[])
			throws java.io.IOException{
			int random;
			String userinput = "";
			Methods question = new Methods();
			System.out.println("Warning: Do not capitilize any letters that you input!");
			do{
			System.out.println("Please enter a command:");
			userinput = question.takeuserinput();
			System.out.println(userinput);
			question.startupcommand(userinput);
			}while(userinput != "continue");
			System.out.println("Pick your subject:(coming soon)");
			random = question.randommeth();
			question.choice(random);
		}
}