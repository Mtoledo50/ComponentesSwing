package aula01.texto;

import java.awt.*;
import javax.swing.*;

public class MostrandoTextos extends JFrame 
{
    public MostrandoTextos() {
        Toolkit tk = Toolkit.getDefaultToolkit(); 
        Dimension d = tk.getScreenSize();
        setSize(d.width / 2, d.height / 2); 
        setLocation(d.width / 4, d.height / 4); 
        setTitle("Escrevendo Textos"); 
        setResizable(false);
        
        ComponenteTextos comp = new ComponenteTextos();
        add(comp);
    }
}