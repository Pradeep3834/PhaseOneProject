import java.util.Scanner;

public class main {
public static void main(String[] args) {
	System.out.println("*********Welcome to Lockedme.com**********");
	System.out.println("------------------------------------------");
	System.out.println("      ************Menu************      ");
	System.out.println("1.Register for Lockedme.com");
	System.out.println("2.Login for lockedme.com");
	
	Scanner scan=new Scanner(System.in);
	String s=scan.next();
	char  choice =s.charAt(0);
	switch(choice) {
	case '1':
		IRegisterPage.main(null);
		
		break;
	case '2':
		LoginPage.main(null);
		
		break;
	default :
		System.out.println("Enter Correct Options");
	}
}
}
