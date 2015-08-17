
public class Run {
	public static void main(String args[])
			throws java.io.IOException{
			char answer, ignore;
			int random;
			boolean check;
			String userinput = "";
			Methods question = new Methods();
			System.out.println("Warning: Do not capitilize any letters that you input!");
			do{
			System.out.println("Please enter a command:");
			userinput = question.takeuserinput();
			check = question.startupcommand(userinput);
			}while(check = false);
			System.out.println("Pick your subject:(coming soon)");
			random = question.randommeth();
			question.choice(random);
		}
}