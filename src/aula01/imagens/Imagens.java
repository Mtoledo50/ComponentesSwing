package aula01.imagens;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Imagens extends JFrame {
  public Imagens() {
	  setSize(500,500);
	  setTitle("Imagens"); 
	  
	  // Cria o componente e adiciona ao JFrame
	  // o componente é desenhado quando for necessário ...
	  ComponentesImagens comp = new ComponentesImagens();
	  add(comp);
	}
  public static void main(String[] args)
  {
      EventQueue.invokeLater(new Runnable()
      {
          public void run()
          {
              Imagens frame = new Imagens();
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.setVisible(true);
           }
       });
   }
}
