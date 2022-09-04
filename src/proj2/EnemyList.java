
package proj2;
//Rafiul Hassan 
//CIS 2151 
//Project #2 
//Oakland Community College


import java.util.ArrayList;

import java.util.Random;


public class EnemyList {
    
    
    public static void main(String[] args) {

        ArrayList<Enemy> enemies = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < 100; i++) {

            int randEnemy = rand.nextInt(4) + 1;

            switch (randEnemy) {
                case 1:
                    enemies.add(new Goblin());
                    break;
                case 2:
                    enemies.add(new Ghost());
                    break;
                case 3:
                    enemies.add(new Ogre());
                    break;
                case 4:
                    enemies.add(new Dragon());
                    break;
                default:
                    break;
            }

        }
            for (int i = 0; i < enemies.size(); i++) {
                enemies.get(i).attack();
            }

        }
    
}
