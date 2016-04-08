/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin25b;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Metodos25B implements ActionListener{
    JFrame marco;
    JPanel panel;
    JTextField casilla;
    JButton bdibu;
    JButton blimp;
    
    public void crearVentana() {
        marco = new JFrame();
        casilla = new JTextField(6);
        bdibu = new JButton("Dibujar");
        blimp = new JButton("Limpiar");
        panel = new JPanel();
        
        marco.setSize(1000, 1000);
        panel.setSize(1000, 1000);
        panel.setBackground(Color.black);
        bdibu.addActionListener(this);
        blimp.addActionListener(this);
        panel.add(bdibu);
        panel.add(blimp);
        panel.add(casilla);
        
        marco.add(panel);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==(bdibu)){
            int x=0,y=0;
            for(int i=0;i<Integer.parseInt(casilla.getText());i++){
                
                Graphics graf = panel.getGraphics();
                graf.setColor(Color.red);
                graf.fillOval(50+x,50+y,150,150);
                x=x+150;
                y=y+60;
            }
        }
        else{
            panel.repaint();
        }
    }
    

    
    
    
}
