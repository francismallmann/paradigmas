/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;

import java.awt.*;
import java.util.Random;

/**
 *
 * @author Francis
 */
public class Triangle {
        Dimension tamanhoDoTriang = new Dimension();
        Dimension tela = new Dimension();
        String    nomeDoMovimento;
        Point     posSuperior = new Point();
        Line lin = new Line();
        Polygon poligono = new Polygon();
        int i, j, m, n, y, z, w, x;
        double aux = 3.141516 / (double)6;
        Random rand = new Random();

    Triangle(Dimension dim, String path) {
        i = (int) ((int) 3 + (Math.random() * (dim.height-(dim.height*0.8))));  
        j = (int) ((int) 3 + (Math.random() * (dim.width-(dim.width*0.8))));   
        tamanhoDoTriang.setSize(new Dimension(j, i));
        tela = dim;
        nomeDoMovimento = path;
        posSuperior.x=(int) ((int) 1 + (Math.random() * (dim.width-10))); 
        posSuperior.y= (int) ((int) 1 + (Math.random() * (dim.height-10))); 
        y=rand.nextInt(256);
        z=rand.nextInt(256);
        w=rand.nextInt(256);
    }

    void desenhaTriangulo(Graphics g) {
           Polygon p = new Polygon();
           for(x = 0; x < 3; x++){
                  p.addPoint((int)Math.round(70 * Math.cos(aux)) + posSuperior.x,(int)Math.round(70 * Math.sin(aux)) + posSuperior.y);
                  aux += 2 * Math.PI/3;
           }
           g.setColor(new Color (w,y,z));
           g.fillPolygon(p);
           g.drawPolygon(p);
    }

    void moveTriangulo() {
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
