
public class Run {
	public static void main(String args[])
			throws java.io.IOException{
			char answer, ignore;
			int random;
			Methods question = new Methods();
			System.out.println("Welcome to trivia! Pick your subject:(coming soon");
			random = question.randommeth();
			question.choice(random);
		}
}