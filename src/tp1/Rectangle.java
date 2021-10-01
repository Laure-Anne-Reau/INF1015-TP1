package tp1;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Collection;

public class Rectangle extends BaseShape {
    // TODO creer un rectangle avec une largeur et une longueur.
    public Rectangle(Double width, Double height) {
        super();

        for(double i = 0; i <= width; i += 0.5) {
            for(double j = 0; j <= height; j += 0.5){
                add(new Point2d(i, j));
            }
        }
    }

    // TODO creer un rectangle avec les dimensions contenu dans un Point.
    public Rectangle(Point2d dimensions) {
        super();

        for(double i = 0; i <= dimensions.X(); i += 0.5) {
            for(double j = 0; j <= dimensions.Y(); j += 0.5){
                add(new Point2d(i, j));
            }
        }
    }

    // TODO initialiser le parent.
    private Rectangle(Collection<Point2d> coords) {
        this.addAll(coords);
    }

    // TODO appliquer la translation sur la forme.
    @Override
    public Rectangle translate(Point2d point) {
        super.translate(point);
        return this;
    }

    // TODO appliquer la rotation sur la forme.
    @Override
    public Rectangle rotate(Double angle) {
        super.rotate(angle);
        return this;
    }

    // TODO retourner une nouvelle forme.
    @Override
    public Rectangle clone() {
        super.clone();
        return this;
    }
}
