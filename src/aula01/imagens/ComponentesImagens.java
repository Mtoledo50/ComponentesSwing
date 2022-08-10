package aula01.imagens;
import java.awt.*;

import javax.swing.*;

public class ComponentesImagens extends JComponent {
	public void paintComponent (Graphics g) {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension tamanhoTela = kit.getScreenSize();
		Image ima = kit.getImage("res/robot.gif"); 
		int larguraTela = tamanhoTela.width;
		int alturaTela = tamanhoTela.height;
		int larguraImagem = ima.getWidth(this);
		int alturaImagem = ima.getHeight(this); 
		g.drawImage(ima,4,23,null);
		for (int i = 0; i <= larguraTela / larguraImagem; i++)
			for (int j = 0; j <= alturaTela / alturaImagem; j++) 
				if (i + j > 0) // Pula a 1a imagem que já está desenhada
					g.copyArea(4,23,larguraImagem, alturaImagem, i * larguraImagem, j * alturaImagem);
	}
}