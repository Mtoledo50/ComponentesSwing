package aula01.texto;
import java.awt.*;
import javax.swing.*;

public class TesteMostrandoTextos
{
   public static void main(String[] args)
   {
       EventQueue.invokeLater(new Runnable()
       {
           public void run()
           {
               MostrandoTextos frame = new MostrandoTextos();
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);
            }
        });
    }
}