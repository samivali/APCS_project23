import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Are you a new Skater? If so type New");
	    String New = sc.nextLine();
	    if(New.equals("New")){
	        Skater begin = new Skater(1);
	        
	    }
	    else{
	        System.out.println("type T for all the skills you have");
	        String check = sc.nextLine();
	        if(check.equals("T"))
	    }
		
	}
}