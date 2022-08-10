package aula01.imagens;

import java.awt.*;
import javax.swing.*;

public class TesteImagens
{
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