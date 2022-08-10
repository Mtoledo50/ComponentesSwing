package aula01.cores;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class TesteCores {
	public static void main (String[] args) {
		EventQueue.invokeLater(new Runnable()
	       {
	           public void run()
	           {
	       		Cores fr = new Cores(); // Cria o JFrame
	    		fr.setVisible(true);	// Torna o JFRame visivel
	    		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            }
	        });
  }
}