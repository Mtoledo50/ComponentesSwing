package aula01.cores;
import javax.swing.*;
class Cores extends JFrame {
  public Cores() {
	  // seta as propriedades do JFrame
	  setSize(400, 200);
	  setLocation(200, 100);
	  setTitle("Cores");
    
	  // Cria o componente e adiciona ao JFrame
	  // o componente é desenhado quando for necessário ...
	  CoresComponent comp = new CoresComponent();
	  add(comp);
  }
}