package userPromptDemo;

import java.util.Scanner;

public class UserP {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String response = null;
		
		System.out.println("Would you like to continue?");
		
		response = scanner.nextLine();
		
//		while(true){
//			response =scanner.nextLine();
//		}
		while(response.equalsIgnoreCase("y")){
		response = scanner.nextLine();
					
			if( response.equalsIgnoreCase("y")){
			//System.out.println("Continue");
			response = scanner.nextLine();
			}
		
			if (response =="N"){
			System.out.println("quit");
			}
			else{
				System.out.println("Wrong input, please put the correct input");
				response = scanner.nextLine();
			}
			
		}
		
	}
		
		
}
			
			
				


			


