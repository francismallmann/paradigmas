package animator;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author francis
 */
public class Rectangle extends Figura{
   
    
    public Rectangle(Point p, Dimension dim, String path, String color){
        this.dim = dim;
        this.path = path;
        this.pos = p;
        this.origem = new Point((int) p.getX(), (int) p.getY());
        this.width = 100;
        this.heigth = 70;
        this.color = color;
    }
    
    @Override
    public void draw(Graphics g){
        g.setColor(this.stringToColor(this.color));
        g.fillRect((int)this.pos.getX(), (int)this.pos.getY(), this.width, this.heigth);
    }
}