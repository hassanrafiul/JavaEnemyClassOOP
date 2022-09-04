
package proj2;
//Rafiul Hassan 
//CIS 2151 
//Project #2 
//Oakland Community College



abstract class Enemy {
    
    
    private int weight;
    private int height;
    
    
    public Enemy(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
    
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    
    
    abstract void attack();
    }
