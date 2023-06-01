package pkg;
import java.util.*;


public class Sequence{
    ArrayList <Trick> sequence;
    ArrayList <Trick> tr;
	
	public Sequence(){
	    sequence = new ArrayList<Trick>();
	    tr = new ArrayList<Trick>();
	}
	
	public void generateSequence(){
	    makeTricks();
		for(int i = 0; i<8; i++){
		    int y = (int)((Math.random()+1)*10);
		    sequence.add(tr.get(y));
		}
		
		printArray();

	}

	
	public void makeTricks(){
	    Trick x1 = new Trick("Right Forward Crossover");
	    Trick x2 = new Trick("Left Forward Crossover");
	    Trick x3 = new Trick("Right Backward Crossover");
	    Trick x4 = new Trick("Left Backward Crossover");
	    Trick x5 = new Trick("Forward Right Inside Mohawk");
	    Trick x6 = new Trick("Forward Left Inside Mohawk");
	    Trick x7 = new Trick("Backward Right Inside Mohawk");
	    Trick x8 = new Trick("Backward Left Inside Mohawk");
	    Trick x9 = new Trick("Forward Right Outside 3-Turn");
	    Trick x10 = new Trick("Forward Left Outside 3-Turn");
	    Trick x11 = new Trick("Forward Right Inside 3-Turn");
	    Trick x12 = new Trick("Forward Left Inside 3-Turn");
	    Trick x13 = new Trick("Backward Right Outside 3-Turn");
	    Trick x14 = new Trick("Backward Left Outside 3-Turn");
	    Trick x15 = new Trick("Backward Right Inside 3-Turn");
	    Trick x16 = new Trick("Backward Left Inside 3-Turn");
	    Trick x17 = new Trick("Camel Forward");
	    Trick x18 = new Trick("Cross Step");
	    Trick x19 = new Trick("Camel Upward");
	    Trick x20 = new Trick("Sit Spin Forward");
	    
	    tr.add(x1);
	    tr.add(x2);
	    tr.add(x3);
	    tr.add(x4);
	    tr.add(x5);
	    tr.add(x6);
	    tr.add(x7);
	    tr.add(x8);
	    tr.add(x9);
	    tr.add(x10);
	    tr.add(x11);
	    tr.add(x12);
	    tr.add(x13);
	    tr.add(x14);
	    tr.add(x15);
	    tr.add(x16);
	    tr.add(x17);
	    tr.add(x18);
	    tr.add(x19);
	    tr.add(x20);
	    
	}

	void printArray()
	{
		for (int i = 1; i < sequence.size(); i++)
			System.out.println((sequence.get(i)).getName());
	}

}
