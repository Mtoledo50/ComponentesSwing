package aula01.frames;
import java.awt.*;

/* 
 * Cria um frame simples, definindo o título, as dimensões, 
 * a posição e impede redimensionamento
 * mas ainda não é possível fechar
 */

public class FrameDois extends Frame {
  public FrameDois() { //construtor
    setTitle("Frame Dois");  // Define o título do Frame
    setSize(300, 300);       // Dimensão do Frame: largura: 300 pixels   altura: 200 pixels
    setResizable(true);     // Não permite o redimensionamento
    setLocation(400, 300);   // Define a posição na tela: x: 200 pixels   y: 100 pixels	
  }

  public static void main (String[] args) {
    FrameDois fr = new FrameDois();
    fr.setVisible(true);
  }
}