package animator;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

// Conjunto de objetos da animacao.
class ObjectSet {
    
    private Image[] images;
    
    ArrayList<Circle> circ = new ArrayList<Circle> ();
    ArrayList<Image> imagem = new ArrayList<Image> ();
    ArrayList<Star> str = new ArrayList<Star> ();
    ArrayList<Triangle> trian = new ArrayList<Triangle>();
    ArrayList<Rectange> rect = new ArrayList<Rectange>();
    
    
    
    
    // Adiciona objetos da classe Image ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addImages(int n, Dimension dim, BufferedImage image, String path) {
        System.out.printf("Test: adding %d images\n", n);
        System.out.printf("Test: motion path %s\n", path);
        for(int i=0; i<n; i++)
            imagem.add(new Image(dim, image, path));
    }
    
    
    
    public void addStars(int n, Dimension dim, String path) {
        for(int i=0; i<n; i++)
            str.add(new Star(dim, path));
    }
    
    // Adiciona objetos da classe Star ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    public void addRectangles(int n, Dimension dim, String path) {
        for(int i=0; i<n; i++)
            rect.add(new Rectange(dim, path));
    }
    
    // Adiciona objetos da classe Star ao ObjectSet.
    public void addCircles(int n, Dimension dim, String path) {
        for(int i=0; i<n; i++)
            circ.add(new Circle(dim, path));
    }
     // Adiciona objetos da classe Star ao ObjectSet.
    public void addTriangles(int n, Dimension dim, String path) {
        for(int i=0; i<n; i++)
            trian.add(new Triangle(dim, path));
    }
    // Desenha cada um dos objetos da animacao.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void drawAll(Graphics g) {
       for(Image im : imagem){
            im.desenhaImag(g);
        }
        for(Circle c : circ){
            c.desenhaCirc(g);
        }
        for(Star star : str){
            star.desenhaStar(g);
        }
        for(Triangle t : trian){
            t.desenhaTriangulo(g);
        }
        for(Rectange retang : rect){
            retang.desenhaRetangulo(g);
        }
    }

    // Move cada um dos objetos da animacao.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void moveAll() {
        //System.out.println("moveAll");
        for(Image im : imagem){
            im.moveImage();
        }
        for(Circle cir : circ){
            cir.moveCirculo();
        }
        for(Star star : str){
            star.moveEstrela();
        }
        for(Triangle t : trian){
            t.moveTriangulo();
        }
        for(Rectange retang : rect){
            retang.moveRetangulo();
        }
    }
    }

