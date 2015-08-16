
public class Methods {
	int randomarray[] = new int[19];
	int random = 0, qvalue;
	char rightanswer;
	void Q1(char answer) {
		if(answer == 'y') System.out.println("I should have figured that. I am the most famous squirrel there is.");
		else if(answer == 'n') System.out.println("Well fuck you. I'm only the most famous squirrel around. All the babes know me.");
		else return;
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