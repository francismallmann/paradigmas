/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author francis
 */
public class Circle extends Figura{
    
    
    public Circle(Point p, Dimension dim, String path, String color){
        this.pos = p;
        this.origem = new Point((int) p.getX(), (int) p.getY());
        this.dim = dim;
        this.path = path;
        this.width = 60;
        this.heigth = 60;
        this.color = color;
    }
    
    @Override
    public void draw(Graphics g){
        g.setColor(this.stringToColor(this.color));
        g.fillOval((int)pos.getX(), (int) pos.getY(), this.width, this.heigth);
    }
}