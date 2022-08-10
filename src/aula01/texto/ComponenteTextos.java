package aula01.texto;
import java.awt.Graphics;
import javax.swing.*;

class ComponenteTextos extends JComponent {
    public void paintComponent (Graphics g) 
    {
        g.drawString("Escrevendo texto ...", 40, 50); 
        g.drawLine(40, 60, 200, 60);
        int i = 30;
        while (i < 200)
        {
            g.drawString("Escrevendo texto ...", 40+i, 50+i); 
            g.drawLine(40+i, 60+i, 200+i, 60+i);
            i+=30;
        } 
    }
}
