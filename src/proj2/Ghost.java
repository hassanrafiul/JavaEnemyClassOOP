
package proj2;
//Rafiul Hassan 
//CIS 2151 
//Project #2 
//Oakland Community College


import java.util.Random;


public class Ghost extends Enemy{
    
     public Ghost(){
        super(weight, height);
    }
    
    static int weight = 0; 
    static int height = new Random().nextInt(60)+90;
    
    @Override
    void attack(){
        System.out.println("Boo!");
        
    }
    
}
