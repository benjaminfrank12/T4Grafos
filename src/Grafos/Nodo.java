
package Grafos;

import java.awt.Graphics;

/**
 *
 * @author ff277
 */
public class Nodo {
    private int x,y;
    private String nombre;   //modificaciones del autor benjamin
    public static final int d=60;
    
    public Nodo(int x,int y,String nombre){ // modificaciones del autor benjamin
        this.x=x;
        this.y=y;
        this.nombre=nombre;
    }
    public void Pintar(Graphics g){
        g.drawOval(this.x-d/2,this.y-d/2,d,d);
        g.drawString(nombre, x, y);   //modificaciones del autor benjamin
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
