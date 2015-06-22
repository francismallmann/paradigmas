/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;

import java.awt.Dimension;
import java.awt.Point;

/**
 *
 * @author Francis
 */
public class Line {
   
    Dimension dim = new Dimension();
    int cont=1, velx=3, vely=3;
    
    public Point movimentoHorizontal(Point posSuperior, Dimension tela) {
        
        if(posSuperior.x >=tela.width-1 ){ 
           posSuperior.x=0;
       }
       posSuperior.x=posSuperior.x+4;
       return posSuperior;
    }
    
    
    public Point movimentoVertical(Point posSuperior, Dimension tela){
        if(posSuperior.y >=tela.width-1 ){ 
           posSuperior.y=0;
       }
       posSuperior.y=posSuperior.y+4;
       return posSuperior;
    }
    
    public Point movimentoRetangular(Point posSuperior, Dimension tela){
        if(cont<=20){
            posSuperior.x+=3;
            cont++;
        }
        else if(cont<=50){
            posSuperior.y+=3;
            cont++;
        }
        else if(cont<=70){
            posSuperior.x-=3;
            cont++;
        }
        else if(cont<=100){
            posSuperior.y-=3;
            cont++;
        }
        else {
            cont=1;
        }
        return posSuperior;
    }
    
    public Point movimentoTriangular(Point posSuperior, Dimension tela){
       if(cont<=30){
            posSuperior.x+=3;
            cont++;
        }
        else if(cont<=45){
            posSuperior.y+=3;
            posSuperior.x-=3;
            cont++;
        }
        else if(cont<=60){
            posSuperior.y-=3;
            posSuperior.x-=3;            
            cont++;
        }
        else {
            cont=1;
        }
        return posSuperior;
    }
    public Point movimentoRicochete(Point posSuperior, Dimension tela){
        posSuperior.x+=velx;
        posSuperior.y+=vely;
        if(posSuperior.x + velx > tela.width){
            velx = -velx;
            posSuperior.x=tela.width;}
        if(posSuperior.y +vely > tela.height){
            vely = -vely;
            posSuperior.y=tela.height;}
        if(posSuperior.x <= 0){
            velx = -velx;
            posSuperior.x=0;}
        if(posSuperior.y <= 0){
            vely = -vely;
            posSuperior.y=0;}
        
        return posSuperior;
    }
    
}

