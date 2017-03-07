/*
 */
package exercisegameoflife;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author flyberson
 */
public class Game {
private int x=12;
private int y=10;
    ArrayList<Cell> al;


    public Game() {
            Cell c1 = new Cell();
    Cell c2 = new Cell();
    Cell c3 = new Cell();
    Cell c4 = new Cell();
    Cell c5 = new Cell();
    Cell c6 = new Cell();
    Cell c7 = new Cell();
        this.al = new ArrayList<>();
        c1.setAlive(true);
        c2.setAlive(true);
        c3.setAlive(true);
        c4.setAlive(false);
        c5.setAlive(true);
        c6.setAlive(true);
        c7.setAlive(false);
        al.add(c1);
        al.add(c2);
        al.add(c3);
        al.add(c4);
        al.add(c5);
        al.add(c6);
        al.add(c7);
    }

    public void draw(Graphics g) {
        for (Cell cell : al) {
            System.out.print(cell.getLivingNeighbours());
        }
        System.out.println(" ");
        for (Cell cell : al) {
            if(cell.isAlive()==true){
             g.setColor(Color.BLUE);
    g.fillOval(x, y, 12, 10);
            x+=30;
            }
            else{
    g.setColor(Color.RED);
            g.fillOval(x, y, 12, 10);
            x+=30;
            
                
            }
        }
        if(x>70){
            x=12;
            y+=30;
        }
    }

    public void update() {
        for (int i = 0; i < al.size(); i++) {
            Cell cl = al.get(i);
            if (cl.isAlive() == true) {
                i++;
                cl = al.get(i);
                cl.setLivingNeighbours(cl.getLivingNeighbours() + 1);
                i--;
                if (i-1 >= 0) {
                    i--;
                    cl = al.get(i);
                    cl.setLivingNeighbours(cl.getLivingNeighbours() + 1);
                    i++;

                }
            }
            

        }
        for (Cell cell : al) {
            cell.update();
            
        }
        for (Cell cell : al) {
            cell.setLivingNeighbours(0);
        }
        {

        }
    }

}
