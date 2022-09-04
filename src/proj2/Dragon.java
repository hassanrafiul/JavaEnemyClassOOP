
package proj2;
//Rafiul Hassan 
//CIS 2151 
//Project #2 
//Oakland Community College


import java.util.Random;

public class Dragon extends Enemy {
    
    public Dragon(){
        super(weight, height);
    }
    
    static int weight = new Random().nextInt(500)+1000; 
    static int height = new Random().nextInt(1250)+750;
   
    @Override
    void attack(){
        System.out.println("Rawr!");
        
    }
    
}
