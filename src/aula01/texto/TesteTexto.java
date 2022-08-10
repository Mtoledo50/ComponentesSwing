package aula01.texto;

import java.awt.EventQueue;

import javax.swing.*;


public class TesteTexto extends JFrame {
	public TesteTexto() {
		setTitle("Componentes de Texto");
		setSize(500,300);
		
		JPanel panel = new JPanel();
		
		JLabel label1 = new JLabel("Informe seu nome: ");
		panel.add(label1);
		
		JTextField nome = new JTextField(20); // pode informar valor default
		panel.add(nome);
		
		
		JLabel label2 = new JLabel("Informe seu endereço: ");
		panel.add(label2);
		
		JTextArea endereco = new JTextArea(4,20);	
		JScrollPane enderecoScroll = new JScrollPane(endereco);
		panel.add(enderecoScroll);

		
		
		JLabel label3 = new JLabel("Informe sua senha: ");
		panel.add(label3);
		
		JPasswordField senha = new JPasswordField(10);
		panel.add(senha);
		
		JLabel label4 = new JLabel("Nos conte um pouco sobre você: ");
		panel.add(label4);
		
		JTextArea cv = new JTextArea(4,20);	
		cv.setLineWrap(true);  // é uma alternativa a usar o scroll
		panel.add(cv);
	
		JButton insere = new JButton("Insere");
		panel.add(insere);
		add(panel);
	}
	
	public static void main(String[] args) {
	       EventQueue.invokeLater(new Runnable()
	       {
	           public void run()
	           {
		        	TesteTexto tt = new TesteTexto();
		       		tt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		       		tt.setVisible(true);
	            }
	        });
	}
	
}
