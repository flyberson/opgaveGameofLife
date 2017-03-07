/*
 */
package exercisegameoflife;

/**
 *
 * @author flyberson
 */
public class Cell {
    int livingNeighbours;
    boolean alive;
    
    public boolean update(){
        if (livingNeighbours==3 && alive == false){
            alive =true;
        }
        if ((livingNeighbours==2 || livingNeighbours ==3) && alive == true){
            alive =true;
        }
        else {
            alive =false;
        }
        
        return alive;
    }

    public int getLivingNeighbours() {
        return livingNeighbours;
    }

    public void setLivingNeighbours(int livingNeighbours) {
        this.livingNeighbours = livingNeighbours;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public Cell() {
    }
    
    
}
