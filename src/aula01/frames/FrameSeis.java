package aula01.frames;
import java.awt.*;
import javax.swing.*;

/* 
 * Cria um frame simples, herdando de JFrame, definindo o título, as dimensões e 
 * a posição em função do tamanho da tela, impede redimensionamento e 
 * permite fechar a janela. Atribui um icone para a janela.
 * Protege a GUI em um Thread próprio!
 */

class FrameSeis extends JFrame {
    public FrameSeis() {
        setTitle("Frame Seis");  					// Define o título do Frame
        setResizable(false);       					// Não permite o redimensionamento
        Toolkit tk = Toolkit.getDefaultToolkit(); 	// Retorna o Toolkit default
        Dimension d = tk.getScreenSize();			// Obtém o tamanho da tela
        setSize(d.width / 2, d.height / 2);			// Define o tamanho do Frame
        setLocation(d.width / 4, d.height / 4);		// Define a posição do Frame
        Image img = tk.getImage("res/icone.gif");	// Define o Icone do Frame
        setIconImage(img);
        this.getContentPane().setBackground(Color.green);
   }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable()  {
            public void run() {
                FrameSeis frame = new FrameSeis();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
             }
         });
     }
}