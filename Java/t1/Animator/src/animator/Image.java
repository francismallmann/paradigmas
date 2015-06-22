package animator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;

// Uma imagem na animacao.
class Image {  
    
    String    nomeDoMovimento;
    Point     posSuperior = new Point();
    BufferedImage img;
    Dimension tela = new Dimension();
    Line lin = new Line();
    
    public Image(Dimension dim, BufferedImage image, String path) {
      //  int k = (int) ((int) 0 + (Math.random() * (dim.height-20)));  
       // int l = (int) ((int) 0 + (Math.random() * (dim.width-20))); 
        tela = dim;
        nomeDoMovimento = path;
        posSuperior.y= (int) ((int) 0 + (Math.random() * (dim.height-20)));
        posSuperior.x=(int) ((int) 0 + (Math.random() * (dim.width-20))); 
        //posSuperior.setLocation(posSuperior);
        img = image;
    }

    /*public Point getPos() {
        return pos;
    }*/
    
   /* public void draw(Graphics g) {
        g.drawImage(img, (int) pos.getX(), (int) pos.getY(), null);
    }*/
    
    // Move a imagem de acordo segundo a trajetoria selecionada.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    /*public void move() {
        String    nomeDoMovimento;
        Point     posSuperior = new Point();
    }*/
    

    public void desenhaImag(Graphics g) {
        g.drawImage(img, posSuperior.x, posSuperior.y, null);
    }

    public void moveImage() {
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

