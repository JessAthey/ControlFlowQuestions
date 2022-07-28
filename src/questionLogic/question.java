package questionLogic;

import java.util.ArrayList;
import java.util.Scanner;

public class question {
	
	public static int inRange(int value, int lowRange, int highRange) {
		int range_size = highRange - lowRange + 1;
		while(value > highRange) {
			value -= range_size;
		}
		while(value < lowRange) {
			value +=range_size;
		}
		return value;
	}
	
	

	public static void main(String[] args) {
		
		
		Scanner getString = new Scanner(System.in);
		System.out.print("Enter your name please ");    
		String userString = getString.next();
		System.out.println("Welcome, " + userString + " \nWould you Like to continue? (yes or no) ");
		String exitPhrase = getString.next();
		ArrayList<String> userStrings = new ArrayList<String>();
		
		userStrings.add(userString);
		userStrings.add(exitPhrase);
		
		
		if(exitPhrase.contains("y")) {
			System.out.println("Great, let's continue" + " \nWhat color is your car?");
			String redCar = getString.next();
			System.out.println("Please enter the name of your favorite pet ");
			String petName = getString.next();
			System.out.println("How old is your pet? (number format please) ");
			String petAgeString = getString.next();
			int petAge = Integer.parseInt(petAgeString);
			System.out.println("What is your lucky number? ");
			String luckyNumberString = getString.next();
			int luckyNumber = Integer.parseInt(luckyNumberString);
			System.out.println("Do you have a favorite QB? ");
			String favQB = getString.next();
				
				if (favQB.contains("y")){
					System.out.println("What is their jersey number? ");
					String jerseyNumString = getString.next();
					int jerseyNum = Integer.parseInt(jerseyNumString);
					System.out.println(jerseyNum);
					System.out.println("What is the 2 digit model year of your car? ");
					String carYearString = getString.next();
					int carYearNum = Integer.parseInt(carYearString);
					System.out.println("What is the first name of your favorite actor? ");
					String actorName = getString.next();
					System.out.println("Please enter a number between 1-50 ");
					String randomNumString = getString.next();
					int randomNum = Integer.parseInt(randomNumString);
					userStrings.add(redCar);
					userStrings.add(petName);
					
					int[] randomNums = new int[3];
					for(int i=0; i<randomNums.length; ++i) {
						randomNums[i] = (int)Math.floor((Math.random() * 65))+1;
					}
					
					int[] balls = new int[5];
					int magicBall;
					if(favQB.contains("y")) {
						magicBall = jerseyNum;
					} else {
						magicBall = luckyNumber * randomNums[0];
					}
				
					magicBall = inRange(magicBall, 1, 75);
					
					balls[0] = petName.charAt(2);
					balls[1] = carYearNum + luckyNumber;
					balls[2] = randomNum - randomNums[1];
					balls[3] = actorName.charAt(0);
					balls[4] = actorName.charAt(actorName.length()-1);
					for(int i = 0; i<1; ++i) {
						balls[i] = inRange(balls[i], 1, 65);
						
						
						
						System.out.print("Your lucky numbers are: ");
						for(int i1=0; i1<=4; ++i1) {
							System.out.print(balls[i1] + ", ");	
						
						}
						System.out.println(balls[balls.length-1]);
						System.out.println("  Magic ball: " + magicBall);
					}
				}
				else {
					System.out.println("Come back when you are ready! Thanks! ");
				}
				
					
					
	}
	}			
}


