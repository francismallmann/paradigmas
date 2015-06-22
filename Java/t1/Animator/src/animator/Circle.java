/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

/**
 *
 * @author Francis
 */
public class Circle {
     Dimension tamanhoDoCirc = new Dimension();
     Dimension tela = new Dimension();
     String    nomeDoMovimento;
     Point     posSuperior = new Point();
     Line lin = new Line();
     Random random = new Random();
     int x, y, z;

    public Circle(Dimension dim, String path) {
        int i = (int) ((int) 3 + (Math.random() * (dim.height-(dim.height*0.8))));  
        int j = (int) ((int) 3 + (Math.random() * (dim.width-(dim.width*0.8))));  
        tamanhoDoCirc.setSize(new Dimension(j,i));
        tela = dim;
        nomeDoMovimento = path;
        posSuperior.x= (int) ((int) 1 + (Math.random() * (dim.width-10)));
        posSuperior.y = (int) ((int) 1 + (Math.random() * (dim.height-10)));  
        x=random.nextInt(256);
        y=random.nextInt(256);
        z=random.nextInt(256);
    }
    
    public void desenhaCirc(Graphics g) {
        g.setColor(new Color (x,y,z));
        g.fillOval(posSuperior.x, posSuperior.y, tamanhoDoCirc.width, tamanhoDoCirc.height);
    }

    void moveCirculo() {
        if("Horizontal".equals(nomeDoMovimento)){
            posSuperior=lin.movimentoHorizontal(posSuperior, tela);
        }
       if("Vertical".equals(nomeDoMovimento)){
           posSuperior= lin.movimentoVertical(posSuperior, tela);
        }
       if("Retangular".equals(nomeDoMovimento)){
           posSuperior= lin.movimentoRetangular(posSuperior, tela);
        }
       if("Triangular".equals(nomeDoMovimento)){
           posSuperior= lin.movimentoTriangular(posSuperior, tela);
        }
       if("Ricochete".equals(nomeDoMovimento)){
           posSuperior= lin.movimentoRicochete(posSuperior, tela);
        }
    }
    
}
