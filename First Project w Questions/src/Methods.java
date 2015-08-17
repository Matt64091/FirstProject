import java.util.Scanner;
public class Methods {
	int randomarray[] = new int[19];
	int random = 0, qvalue, qused;
	static int totalpoints = 0;
	String userinput, rightanswer;
	char inputarray[];
	String questions[], answers[];
	
	String takeuserinput(){
		Scanner userinputscan = new Scanner(System.in);
			userinput = userinputscan.nextLine();
		return userinput;
		}
	
	int subjectchoice(String userinput){
		if(userinput.equalsIgnoreCase("history")) return 1;
		else if(userinput.equalsIgnoreCase("points")){System.out.println("Current points: " + totalpoints); return 0;}
		else if(userinput.equalsIgnoreCase("logic")) return 2;
		else if(userinput.equalsIgnoreCase("Chemistry")) return 3;
		else if(userinput.equalsIgnoreCase("Logic")) return 4;
		else if(userinput.equalsIgnoreCase("Video Games")) return 5;
		else if(userinput.equalsIgnoreCase("subjects")){System.out.println("History, Chemistry, Logic, Video Games"); return 0;}
		else{System.out.println("Not a valid subject. To see subjects type subjects."); return 0;}
	}

	int pointchoice(String userinput){
		if(userinput.equalsIgnoreCase("100")) return 100;
		else if(userinput.equalsIgnoreCase("points")){System.out.println("Current points: " + totalpoints); return 0;}
		else if(userinput.equalsIgnoreCase("250")) return 250;
		else if(userinput.equalsIgnoreCase("500")) return 500;
		else if(userinput.equalsIgnoreCase("1000")) return 1000;
		else if(userinput.equalsIgnoreCase("point values")){System.out.println("100,250,500,1000"); return 0;}
		else{System.out.println("Not a valid point value. To see point values type point values"); return 0;}
	}
	
	int isCorrect(String answer) {
		if(answer.equalsIgnoreCase(rightanswer)) return qvalue;
		else return 0;
	}
	int randommeth(){
		if(qused < 5){
		do{
			random = (int)Math.floor(Math.random() * 19);
		}while (randomarray[random] > 19);
		randomarray[random] =+ 20;
		qused += 1;
		return random;
		}
		else return -1;
	}
	
	void setQuestionvalues(String questionrun[], int points, String answerrun[]){
		for(int i=1; i <questionrun.length; i++) questionrun[i] = questions[i];
		for(int i=0; i<answerrun.length; i++) answerrun[i] = answers[i];
		points = qvalue;
	}
	
	void choice(int choice){
		switch(choice){
		case 0:
			System.out.println("Q" + choice + questions[choice]);
			rightanswer = answers[choice];
			break;
		case 1:
			System.out.println("Q" + choice + questions[choice]);
			rightanswer = answers[choice];
			break;
		case 2:
			System.out.println("Q" + choice + questions[choice]);
			rightanswer = answers[choice];
			break;
		case 3:
			System.out.println("Q" + choice + questions[choice]);
			rightanswer = answers[choice];
			break;
		case 4:
			System.out.println("Q" + choice + questions[choice]);
			rightanswer = answers[choice];
			break;
		case 5:
			System.out.println("Q" + choice + questions[choice]);
			rightanswer = answers[choice];
			break;
		case 6:
			System.out.println("Q" + choice + questions[choice]);
			rightanswer = answers[choice];
			break;
		case 7:
			System.out.println("Q" + choice + questions[choice]);
			rightanswer = answers[choice];
			break;
		case 8:
			System.out.println("Q" + choice + questions[choice]);
			rightanswer = answers[choice];
			break;
		case 9:
			System.out.println("Q" + choice + questions[choice]);
			rightanswer = answers[choice];
			break;
		case 10:
			System.out.println("Q" + choice + questions[choice]);
			rightanswer = answers[choice];
			break;
		case 11:
			System.out.println("Q" + choice + questions[choice]);
			rightanswer = answers[choice];
			break;
		case 12:
			System.out.println("Q" + choice + questions[choice]);
			rightanswer = answers[choice];
			break;
		case 13:
			System.out.println("Q" + choice + questions[choice]);
			rightanswer = answers[choice];
			break;
		case 14:
			System.out.println("Q" + choice + questions[choice]);
			rightanswer = answers[choice];
			break;
		case 15:
			System.out.println("Q" + choice + questions[choice]);
			rightanswer = answers[choice];
			break;
		case 16:
			System.out.println("Q" + choice + questions[choice]);
			rightanswer = answers[choice];
			break;
		case 17:
			System.out.println("Q" + choice + questions[choice]);
			rightanswer = answers[choice];
			break;
		case 18:
			System.out.println("Q" + choice + questions[choice]);
			rightanswer = answers[choice];
			break;
		case 19:
			System.out.println("Q" + choice + questions[choice]);
			rightanswer = answers[choice];
			break;
	}
	}
}