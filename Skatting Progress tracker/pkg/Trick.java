package pkg;
import java.util.Scanner;
import java.util.Random;


public class Trick{
    private int level;
    private String name;
    private String link;
    private boolean achive;
    
    
    public Trick(String name, String link, int level){
        this.name = name;
        this.link = link;
        this.level = level;
        achive = false;
    }
    
    public int getLevel(){
        return level;
    }
    
    public String getName(){
        return name;
    }
    
    public String getLink(){
        return link;
    }
    
    public void setAchive(boolean achive){
        this.achive = achive;
    }
    
}

