package aula01.frames;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/* 
 * Cria um frame simples, herdando de JFrame, definindo o título, as dimensões e 
 * a posição em função do tamanho da tela, impede redimensionamento e 
 * permite fechar a janela. Atribui um icone para a janela.
 */

public class FrameCinco extends JFrame {
  public FrameCinco() { //construtor
    setTitle("Frame Cinco");  					// Define o título do Frame
    setResizable(false);       					// Não permite o redimensionamento
    Toolkit tk = Toolkit.getDefaultToolkit(); 	// Retorna o Toolkit default
    Dimension d = tk.getScreenSize();			// Obtém o tamanho da tela
    setSize(d.width / 2, d.height / 2);			// Define o tamanho do Frame
    setLocation(d.width / 4, d.height / 4);		// Define a posição do Frame
    Image img = tk.getImage("res/icone.gif");	// Define o Icone do Frame
    setIconImage(img);
    }
  
  public static void main (String[] args) {
    FrameCinco fr = new FrameCinco();
    fr.setVisible(true);
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}