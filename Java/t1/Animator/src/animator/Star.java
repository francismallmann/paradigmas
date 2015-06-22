/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.Random;

/**
 *
 * @author Francis
 */
public class Star {
    
     Dimension tamanhoDaEst = new Dimension();
     Dimension tela = new Dimension();
     String    nomeDoMovimento;
     Point     posSuperior = new Point();
     Line lin = new Line();
     Random random = new Random();//obtém o gerador de números aleatórios
     int xPoints[]={55,67,109,73,83,55,27,37,1,43};
     int yPoints[]={0,36,36,54,96,72,96,54,36,36};
     int k, l, i, j, z, y, w;
     Random rand = new Random();
     double aux= 3.141516 / (double)6;
     
    public Star(Dimension dim, String path) {
        i = (int) ((int) 3 + (Math.random() * (dim.height-(dim.height*0.8))));  
        j = (int) ((int) 3 + (Math.random() * (dim.width-(dim.width*0.8))));   
        tamanhoDaEst.setSize(new Dimension(j, i));
        tela = dim;
        nomeDoMovimento = path;
        posSuperior.x=(int) ((int) 1 + (Math.random() * (dim.width-10))); 
        posSuperior.y= (int) ((int) 1 + (Math.random() * (dim.height-10))); 
        y=rand.nextInt(256);
        z=rand.nextInt(256);
        w=rand.nextInt(256);
        }

    public void desenhaStar(Graphics g) {
           Polygon p = new Polygon();
           for(int x = 0; x < 5; x++){
                  p.addPoint((int)Math.round(70 * Math.cos(aux)) + posSuperior.x,(int)Math.round(70 * Math.sin(aux)) + posSuperior.y);
                  aux+=144 * Math.PI/180;
           }
           g.setColor(new Color (w,y,z));
           g.fillPolygon(p);
           g.drawPolygon(p);
    }

    void moveEstrela() {
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
