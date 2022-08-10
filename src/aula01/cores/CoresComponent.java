package aula01.cores;

import javax.swing.*;
import java.awt.*;
//Aqui estamos usando a biblioteca Graphics para desenhar.
public class CoresComponent extends JComponent {
	public void paintComponent (Graphics g) {
		g.setColor(Color.blue);
		g.drawString("Cor Azul", 50, 50); 
		g.setColor(Color.green); 
		g.drawLine(50, 60, 220, 60); 
		g.setColor(Color.red); 
		g.drawRect(50,70,100,30); 
		g.setColor(new Color(0,128,128)); 
		g.fillRect(50,110,100,30);
		}
}
