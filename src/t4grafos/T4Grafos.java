/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4grafos;

import javax.swing.JFrame;

/**
 *
 * @author benja
 */
public class T4Grafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame ventana = new JFrame("GRAFOS");
        ventana.add(new Lienzo());
        ventana.setSize(1000, 1000);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
       
    }
    
}
