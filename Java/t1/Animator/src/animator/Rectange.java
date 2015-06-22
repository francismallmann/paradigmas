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
public class Rectange {
    
        Dimension tamanhoDoQuad = new Dimension();
        Dimension tela = new Dimension();
        String    nomeDoMovimento;
        Point     posSuperior = new Point();
        Line lin = new Line();
        int x, y, z;
        Random rand = new Random();
        
    public Rectange(Dimension dim, String path) {
        int i = (int) ((int) 3 + (Math.random() * (dim.height-(dim.height*0.8))));  
        int j = (int) ((int) 3 + (Math.random() * (dim.width-(dim.width*0.8))));  
        tamanhoDoQuad.setSize(new Dimension(j, i));
        posSuperior.x=(int) ((int) 1 + (Math.random() * (dim.width-10)));
        posSuperior.y = (int) ((int) 1 + (Math.random() * (dim.height-10))); 
        tela = dim;
        nomeDoMovimento = path; 
        x=rand.nextInt(256);
        y=rand.nextInt(256);
        z=rand.nextInt(256);
    }
    
    public void desenhaRetangulo(Graphics g){
        g.setColor(new Color(x,y,z));
        g.fillRect(posSuperior.x, posSuperior.y, tamanhoDoQuad.width, tamanhoDoQuad.height);
    }

    public void moveRetangulo() {
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
