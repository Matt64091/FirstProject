
public class Methods {
	int randomarray[] = new int[19];
	int random = 0;
	void Q1(char answer) {
		if(answer == 'y') System.out.println("I should have figured that. I am the most famous squirrel there is.");
		else if(answer == 'n') System.out.println("Well fuck you. I'm only the most famous squirrel around. All the babes know me.");
		else return;
	}
	boolean isValid(char ch) {
		if(ch == 'y' || ch == 'n') return true;
		else return false;
	}
	boolean isValid2(char ch) {
		if(ch >= '1' && ch <= '9') return true;
		else return false;
	}
	void Q2(char answer) {
		if(answer == '1') System.out.println("Well fuck you then");
		else if(answer > '1' && answer <'4') System.out.println("You should try some then.");
		else if(answer > '3' && answer < '7') System.out.println("I have some nuts you could try, but I found them in monkey shit.");
		else if(answer > '6' && answer < '9') System.out.println("Since you like them so much take these. I bought them at the grocery store.");
		else if(answer == '9') System.out.println("You can suck on mine if you want.");
		else System.out.println("I said 1-9 you dumb fuck!");
	}
	void Q3(char answer) {
		if(answer == 'y') System.out.println("Here you go, enjoy them!");
		else System.out.println("Fuck you, I'll make you suck on them!");
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
			System.out.println("Q" + choice);
			break;
		case 1:
			System.out.println("Q" + choice);
			break;
		case 2:
			System.out.println("Q" + choice);
			break;
		case 3:
			System.out.println("Q" + choice);
			break;
		case 4:
			System.out.println("Q" + choice);
			break;
		case 5:
			System.out.println("Q" + choice);
			break;
		case 6:
			System.out.println("Q" + choice);
			break;
		case 7:
			System.out.println("Q" + choice);
			break;
		case 8:
			System.out.println("Q" + choice);
			break;
		case 9:
			System.out.println("Q" + choice);
			break;
		case 10:
			System.out.println("Q" + choice);
			break;
		case 11:
			System.out.println("Q" + choice);
			break;
		case 12:
			System.out.println("Q" + choice);
			break;
		case 13:
			System.out.println("Q" + choice);
			break;
		case 14:
			System.out.println("Q" + choice);
			break;
		case 15:
			System.out.println("Q" + choice);
			break;
		case 16:
			System.out.println("Q" + choice);
			break;
		case 17:
			System.out.println("Q" + choice);
			break;
		case 18:
			System.out.println("Q" + choice);
			break;
		case 19:
			System.out.println("Q" + choice);
			break;
	}
	}
}