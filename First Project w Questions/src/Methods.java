import java.util.Scanner;
public class Methods {
	int randomarray[] = new int[19];
	int random = 0, qvalue;
	static int totalpoint = 0;
	char rightanswer;
	String userinput ="";
	char inputarray[];
	String takeuserinput(){
		Scanner userinputscan = new Scanner(System.in);
			userinput = userinputscan.nextLine();
		return userinput;
		}
	
	void startupcommand(String userinput){
		if(userinput.equalsIgnoreCase("help")){
			System.out.println("Available commands:");
			System.out.println("1.help : defines commands");
			System.out.println("2.points : shows total points");
			System.out.println("3.available subjects : coming soon");
			System.out.println("4.continue : contiue on to subect choices/");
			
		}
			else if(userinput.equalsIgnoreCase("points")){
			System.out.println(totalpoint);
		}
			else if(userinput.equalsIgnoreCase("available subjects")){
			System.out.println("Coming soon");
			}
			else if(userinput.equalsIgnoreCase("continue"));
			else{
				System.out.println("Not a valid command. To see the commands type help");
			}
	}

	int isValid(char answer) {
		if(answer == rightanswer) return qvalue;
		else return 0;
	}
	int randommeth(){
		do{
			random = (int)Math.floor(Math.random() * 19);
		}while (randomarray[random] > 19);
		randomarray[random] =+ 20;
		return random;
	}
	void choice(int choice){
		switch(choice){
		case 0:
			System.out.println("Q" + choice + ":...");
			rightanswer = 'y';
			qvalue = 100;
			break;
		case 1:
			System.out.println("Q" + choice + ":...");
			rightanswer = 'y';
			qvalue = 100;
			break;
		case 2:
			System.out.println("Q" + choice + ":...");
			rightanswer = 'y';
			qvalue = 100;
			break;
		case 3:
			System.out.println("Q" + choice + ":...");
			rightanswer = 'y';
			qvalue = 100;
			break;
		case 4:
			System.out.println("Q" + choice + ":...");
			rightanswer = 'y';
			qvalue = 100;
			break;
		case 5:
			System.out.println("Q" + choice + ":...");
			rightanswer = 'y';
			qvalue = 100;
			break;
		case 6:
			System.out.println("Q" + choice + ":...");
			rightanswer = 'y';
			qvalue = 100;
			break;
		case 7:
			System.out.println("Q" + choice + ":...");
			rightanswer = 'y';
			qvalue = 100;
			break;
		case 8:
			System.out.println("Q" + choice + ":...");
			rightanswer = 'y';
			qvalue = 100;
			break;
		case 9:
			System.out.println("Q" + choice + ":...");
			rightanswer = 'y';
			qvalue = 100;
			break;
		case 10:
			System.out.println("Q" + choice + ":...");
			rightanswer = 'y';
			qvalue = 100;
			break;
		case 11:
			System.out.println("Q" + choice + ":...");
			rightanswer = 'y';
			qvalue = 100;
			break;
		case 12:
			System.out.println("Q" + choice + ":...");
			rightanswer = 'y';
			qvalue = 100;
			break;
		case 13:
			System.out.println("Q" + choice + ":...");
			rightanswer = 'y';
			qvalue = 100;
			break;
		case 14:
			System.out.println("Q" + choice + ":...");
			rightanswer = 'y';
			qvalue = 100;
			break;
		case 15:
			System.out.println("Q" + choice + ":...");
			rightanswer = 'y';
			qvalue = 100;
			break;
		case 16:
			System.out.println("Q" + choice + ":...");
			rightanswer = 'y';
			qvalue = 100;
			break;
		case 17:
			System.out.println("Q" + choice + ":...");
			rightanswer = 'y';
			qvalue = 100;
			break;
		case 18:
			System.out.println("Q" + choice + ":...");
			rightanswer = 'y';
			qvalue = 100;
			break;
		case 19:
			System.out.println("Q" + choice + ":...");
			rightanswer = 'y';
			qvalue = 100;
			break;
	}
	}
}