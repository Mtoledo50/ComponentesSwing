package aula01.frames;

import java.awt.*;

/* 
 * Cria um frame simples, sem tamanho definido, não é possível fechar
 */

public class FrameUm extends Frame {
  public static void main (String[] args) {
    FrameUm fr = new FrameUm();
    fr.setVisible(true);
  }
}