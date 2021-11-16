package Grafos;

import static Grafos.Nodo.d;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.JPanel;

/**
 *
 * @author ff277
 */
public class Lienzo extends JPanel implements MouseListener {
private Vector<Nodo> vectorNodos;
private Vector<Enlace> vectorEnlaces;
private Point p1,p2;
public Lienzo(){
    this.vectorNodos=new Vector<>();
    this.vectorEnlaces=new Vector<>();
    this.addMouseListener(this);
}
public void paint(Graphics g){
    for(Nodo nodos:vectorNodos){
        nodos.Pintar(g);
    }
    for(Enlace enlace:vectorEnlaces){
        enlace.pintar(g);
    }
}
    @Override
    public void mouseClicked(MouseEvent e) {
      if(e.getButton()==MouseEvent.BUTTON1){
          this.vectorNodos.add(new Nodo(e.getX(),e.getY()));
          repaint();
      }
      if(e.getButton()==MouseEvent.BUTTON3){
          for(Nodo nodo:vectorNodos){
            if(new Rectangle(nodo.getX()-Nodo.d/2,nodo.getY()-Nodo.d/2,Nodo.d,Nodo.d).contains(e.getPoint()));{
              if(p1==null)
                  p1=new Point(nodo.getX(),nodo.getY());
              else{
                  p2=new Point(nodo.getX(),nodo.getY());
                  this.vectorEnlaces.add(new Enlace(p1.x,p1.y,p2.x,p2.y));
                  repaint();
                  p1=null;
                  p2=null;
          }
      }
    }
    }
    }
    @Override
    public void mousePressed(MouseEvent e) {
     
    }

    @Override
    public void mouseReleased(MouseEvent e) {
  
    }

    @Override
    public void mouseEntered(MouseEvent e) {
      
    }

    @Override
    public void mouseExited(MouseEvent e) {
      
   
}
}