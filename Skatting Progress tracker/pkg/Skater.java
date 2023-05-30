/*package pkg;
import java.util.*;

public class Skater extends Trick{
    Trick [] list = new Trick[11];
    
    public Skater(){
        level = 1;
    }
    
    
    public void generateTricks(){
        list [0] = new Trick("Marching", " ", 1);
        list [1] = new Trick("Two-foot-Glide", " ", 1);
        list [2] = new Trick("Forward and Backward Swizzles", " ", 1);
        list [3] = new Trick("One Foot Glide", " ", 2);
        list [4] = new Trick("Two Foot Turns", " ", 2);
        list [5] = new Trick("Two Foot Spins", " ", 2);
        list [6] = new Trick("Inside and Outside edge", " ", 2);
        list [7] = new Trick("Forward and Backward Crossovers", " ", 3);
        list [8] = new Trick ("Three Turns" , " ", 4);
        list [9] = new Trick("Mohawks", " ", 4);
        list [10] = new Trick("One Foot Spin", " ", 4);
        
    }
    
    public void achivements(){
        String check;
        for(int x = 0; x<list.length; x++){
            System.out.println("type T for all the skills you have");
	        System.out.println(list[x].getName());
	        check = sc.nextLine();
	        if(check.equals("T")){
	            list[x].setAchive();
	        }
        }
    }
}