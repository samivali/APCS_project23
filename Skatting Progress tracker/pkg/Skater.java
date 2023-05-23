package pkg;
import java.util.Scanner;
import java.util.Random;

public class Skater{
    ArrayList <Trick> Skills;
    int level;
    
    public Skater(int level){
        tricks = new ArrayList <trick>();
        this.level = level;
    }
    
    
    public ArrayList findTricks(){
        Trick Marching = new Trick("Marching", " ", 1);
        Trick twoFootGlide = new Trick("Two-foot-Glide", " ", 1);
        Trick Swizzles = new Trick("Forward and Backward Swizzles", " ", 1);
        Trick OneFootGlide = new Trick("One Foot Glide", " ", 2);
        Trick TwoFootTurn = new Trick("Two Foot Turns", " ", 2);
        Trick TwoFootSpin = new Trick("Two Foot Spins", " ", 2);
        Trick Edges = new Trick("Inside and Outside edge", " ", 2);
        Trick Crossovers = new Trick("Forward and Backward Crossovers", " ", 3);
        Trick ThreeTurns = new Trick ("Three Turns" , " ", 4);
        Trick Mohawks = new Trick("Mohawks", " ", 4);
        Trick OneFootSpin = new Trick("One Foot Spin", " ", 4);
        
        if(level == 1){
            Skills.add(Marching);
            Skills.add(twoFootGlide);
            Skills.add(Swizzles);
            return Skills;
        }
        else if(level == 2){
            Skills.add(OneFootGlide);
            Skills.add(TwoFootTurn);
            Skills.add(TwoFootSpin);
            Skills.add(Edges);
            return Skills;
        }
        else if(level == 3){
            Skills.add(Crossovers);
            return Skills;
        }
        else if(level == 4){
            Skills.add(ThreeTurns);
            Skills.add(Mohawks);
            Skills.add(OneFootSpin);
            return Skills;
        }
        
        public int findLevel(){
            return level;
        }
        
        public void increaseLevel{
            if(level<4){
                level++
            }
            else{
                System.out.print("You have compleated all the avalible levels");
            }
        }
    }
}