
package proj2;
//Rafiul Hassan 
//CIS 2151 
//Project #2 
//Oakland Community College


import java.util.Random;

public class Ogre extends Enemy{
    
    public Ogre (){
        super(weight, height);
    }
    
    static int weight = new Random().nextInt(80)+120; 
    static int height = new Random().nextInt(100)+200;
    
    @Override
    void attack(){
        System.out.println("Ugh!");
        
    }
    
}
