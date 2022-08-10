package aula01.texto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class ContaPalavra extends JFrame {
	public ContaPalavra() {
		setTitle("Conta Palavra no Texto");
		setSize(500,300);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout()); 
		
		res = new JLabel("");
		panel.add(res,BorderLayout.SOUTH);
		
		JPanel pal = new JPanel();
		JLabel label1 = new JLabel("Palavra: ");
		pal.add(label1);
		
		nome = new JTextField(20); 
		pal.add(nome);
		panel.add(pal,BorderLayout.NORTH);
	
		
		JPanel tex = new JPanel();
		
		JLabel label2 = new JLabel("Texto para busca: ");
		tex.add(label2);
		
		texto = new JTextArea(4,20);	
		JScrollPane textoScroll = new JScrollPane(texto);
		tex.add(textoScroll);
		
		panel.add(tex,BorderLayout.CENTER);
		
		JButton conta = new JButton("Conta");
		EventoMouseAction acaoBotao = new EventoMouseAction();
		conta.addActionListener(acaoBotao);
		panel.add(conta,BorderLayout.EAST);
		
		TextFieldHandler handler = new TextFieldHandler();
  		nome.addActionListener(handler);
  		
  		add(panel);
	}
	
	class EventoMouseAction implements ActionListener {
		public void actionPerformed(ActionEvent event) {
				conta();
		}
	}
 	
	 class TextFieldHandler implements ActionListener {
		//PROCESSA EVENTOS DE CAMPO DE TEXTO
		public void actionPerformed(ActionEvent event) {
			conta();
		}
	}

	private void conta() {
		String palavra = nome.getText().trim();
		String [] palavras = texto.getText().split(" ");
		int cont=0; 
		for (String p: palavras)
		{ 
			if(palavra.equals(p)) cont++;  
		} 

		res.setText("Número de ocorrências: "+cont);
	}	
	
	
	JLabel res;
	JTextField nome;
	JTextArea texto;
	
	public static void main(String[] args) {
	       EventQueue.invokeLater(new Runnable()
	       {
	           public void run()
	           {
		        	ContaPalavra tt = new ContaPalavra();
		       		tt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		       		tt.setVisible(true);
	            }
	        });
	}
	
}
