package aula01.frames;
import java.awt.*;
import java.awt.event.*;

/* 
 * Cria um frame simples, definindo o título, as dimensões, 
 * a posição, impede redimensionamento e permite fechar a janela
 */

public class FrameTres extends Frame {
  public FrameTres()  {						// construtor
    addWindowListener(new WindowAdapter()   // Listener para fechar janela
      {public void windowClosing(WindowEvent e){System.exit(0);}});
    setTitle("Frame Três");  				// Define o título do Frame
    setSize(300, 200);      				 // Dimensão do Frame: largura: 300 pixels   altura: 200 pixels
    setResizable(false);    				 // Não permite o redimensionamento
    setLocation(200, 100);   // Define a posição na tela: x: 200 pixels   y: 100 pixels	
  }
  public static void main (String[] args) {
    FrameTres fr = new FrameTres();
    fr.setVisible(true);
  }
}