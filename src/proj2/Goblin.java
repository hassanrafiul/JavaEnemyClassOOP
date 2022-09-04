
package proj2;
//Rafiul Hassan 
//CIS 2151 
//Project #2 
//Oakland Community College


import java.util.Random;

public class Goblin extends Enemy {
    
    public Goblin (){
        super(weight, height);
    }
    
    static int weight = new Random().nextInt(5)+5; 
    static int height = new Random().nextInt(30)+70;
    
    @Override
    void attack(){
        System.out.println("Gurgle!");
        
    }
    
}
