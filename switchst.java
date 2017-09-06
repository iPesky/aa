import java.util.Scanner;
public class switchst
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String choiceanswer;
		
		System.out.println("1.absence line phone number 2. todays weather 3. your schedule 4. next holiday 5. exit");
		
		int i = 10;
		do{
			int f = scan.nextInt();
		switch(f){
			case 1:
				System.out.println("CHS' absence phone number is 480-812-7000");
				break;
			case 2:
				System.out.println("Today's will be sunny");
				break;
			case 3:
				System.out.println("You have an empty schedule");
				break;
			case 4:
				System.out.println("The next holiday is Halloween");
				break;
			case 5:
				System.out.println("Goodbye, and have a nice day");
				
				System.exit(0);
			}
		}while(i < 15);
		
		
		
		
	}
}

