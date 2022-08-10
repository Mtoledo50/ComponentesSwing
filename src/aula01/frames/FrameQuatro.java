package aula01.frames;
import java.awt.*;
import java.awt.event.*;

/* 
 * Cria um frame simples, definindo o título, as dimensões e 
 * a posição em função do tamanho da tela, impede redimensionamento e 
 * permite fechar a janela. Atribui um icone para a janela.
 */

public class FrameQuatro extends Frame {
  public FrameQuatro() { //construtor
    addWindowListener(new WindowAdapter()   // Listener para fechar janela
    	      {public void windowClosing(WindowEvent e){System.exit(0);}});
    setTitle("Frame Quatro");  // Define o título do Frame
    setResizable(false);       // Não permite o redimensionamento
    Toolkit tk = Toolkit.getDefaultToolkit(); 	// Retorna o Toolkit default
    Dimension d = tk.getScreenSize();			// Obtém o tamanho da tela
    setSize(d.width / 2, d.height / 2);			// Define o tamanho do Frame
    setLocation(d.width / 4, d.height / 4);		// Define a posição do Frame
    Image img = tk.getImage("icone.gif");		// Define o Icone do Frame
    setIconImage(img);
    }
  
  public static void main (String[] args) {
    FrameQuatro fr = new FrameQuatro();
    fr.setVisible(true);
  }
}