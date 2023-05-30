package pkg;
import java.util.*;

public class Skater{
    Trick [] list = new Trick[11];
    int level;
    ArrayList<Trick> work;
    
    public Skater(){
        level = 1;
        list [0] = new Trick("Marching", "https://youtu.be/GAyMgZc8hJA", 1);
        list [1] = new Trick("Two-foot-Glide", "https://youtu.be/9zJuwbVSmPY", 1);
        list [2] = new Trick("Forward and Backward Swizzles", "https://youtu.be/r8VG-3tFBho", 1);
        list [3] = new Trick("One Foot Glide", "https://youtu.be/hKnyLPAgBPQ", 2);
        list [4] = new Trick("Two Foot Turns", "https://youtu.be/BCCXsY1RX0E", 2);
        list [5] = new Trick("Two Foot Spins", "https://youtu.be/ZWmNKqOEmGA", 2);
        list [6] = new Trick("Inside and Outside edge", "https://youtu.be/FR9RsC9nNH8", 2);
        list [7] = new Trick("Forward and Backward Crossovers", "https://youtu.be/cyQZ8bauDvY", 3);
        list [8] = new Trick ("Three Turns" , "https://youtu.be/njqJC85X8U0", 4);
        list [9] = new Trick("Mohawks", "https://youtu.be/8MrF6AxeN1w", 4);
        list [10] = new Trick("One Foot Spin", "https://youtu.be/zyat2c-5MXw", 4);
    }
    
    public void findLevel(){
        int min = 0;
        for(int x = 0; x<(work.size()); x++){
            min = min+((work.get(x)).getLevel());
        }
        System.out.println("Your level is around " + (min/(work.size())) + " on the ISI learning levels");
        
    }
    
    public void achivements(){
        String check;
        Scanner sc = new Scanner(System.in);
        System.out.println("type T for all the skills you have");
        for(int x = 0; x<list.length; x++){
	        System.out.println(list[x].getName());
	        check = sc.nextLine();
	        if(check.equals("T")){
	            list[x].setAchive();
	        }
        }
    }
    
    public void inProgress(){
    	work = new ArrayList<Trick>();
    	for(int x=0; x<list.length; x++){
    		if(list[x].getAchive()==false){
    			work.add(list[x]);
    		}
    	}
    }
    
    public ArrayList<Trick> getProgress(){
        return work;
    }
}