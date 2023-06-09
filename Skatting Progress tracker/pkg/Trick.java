package pkg;
import java.util.*;


public class Trick{
    private int level;
    private String name;
    private String link;
    private boolean achive;
    
    public Trick(String name){
        this.name = name;
        level = 0;
        link = "";
        achive = true;
    }
    
    
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
    
    public void setAchive(){
        achive = true;
    }
    
    public boolean getAchive(){
        return achive;
    }
    
}

