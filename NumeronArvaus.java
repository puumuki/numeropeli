import java.util.Random;
import java.util.Scanner;

public class NumeronArvaus {	
		
	public static Scanner scanner = new Scanner(System.in);
	
	public static int askNumber() {				
		int number = 0;
		
		while(number <= 0) {
			try {
				System.out.print("Anna numero >");
				number = Integer.parseInt(scanner.nextLine());				
			} catch (Exception e) {
				System.out.println("Syötetty arvo ei ole numero");
			}
		}
						
		return number;		
	}
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int randomNumber = random.nextInt(10)+1;		
		int amountOfQuess = 3;
		
		System.out.println("Arvaa numero 1-10 väliltä, sinulla on käytettävissä kolme arvausta.");
		
		while( amountOfQuess > 0 ) {
			int number = NumeronArvaus.askNumber();
			
			if( number == randomNumber ) {
				System.out.println("Arvasit numeron oikein, onnitelut voitit pelin!");
				break;
			}			
			else if( number > randomNumber ) {
				System.out.println("Numero on pienempi");				
			}
			else {
				System.out.println("Numero on suurempi");
			}
			
			amountOfQuess--;
		}
		
		if( amountOfQuess <= 0 ) {
			System.out.println("Käytit kaikki arvauksesi.");
		}
		
		scanner.close();
	}	
}
