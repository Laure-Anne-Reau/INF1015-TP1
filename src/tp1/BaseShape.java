package tp1;

import java.util.*;
import java.util.stream.Collectors;

public class BaseShape implements Cloneable {
    private Collection<Point2d> coords;

    // TODO Initialiser la liste de points.
    public BaseShape() {
        coords = new ArrayList<>();
    }

    // TODO prendre une liste de points et creer une nouvelle forme.
    public BaseShape(Collection<Point2d> coords) {
        this.coords = new ArrayList<>();
        this.coords.addAll(coords);
    }

    // TODO ajouter ou retirer des coordonnees a la liste de points.
    public BaseShape add(Point2d coord) {
        coords.add(coord);
        return null;
    }
    public BaseShape add(BaseShape shape) {
        coords.addAll(shape.getCoords());
        return null;
    }
    public BaseShape addAll(Collection<Point2d> coords) {
        this.coords.addAll(coords);
        return null;
    }
    public BaseShape remove(Point2d coord) {
        coords.remove(coord);
        return null;
    }
    public BaseShape remove(BaseShape shape) {
        this.coords.removeAll(shape.getCoords());
        return null;
    }
    public BaseShape removeAll(Collection<Point2d> coords) {
        this.coords.removeAll(coords);
        return null;
    }

    // TODO retourner les coordonnees de la liste.
    public Collection<Point2d> getCoords() {
        return coords;
    }

    // TODO retourner une nouvelle liste ou tous les points sont des copy
    public Collection<Point2d> getCoordsDeepCopy() {
        BaseShape tempBaseShape = new BaseShape();
        tempBaseShape.addAll(coords);          // Plus efficace qu'une forLoop et tempBaseShape.add(p).... Y a-t-il mieux ?
        return tempBaseShape.getCoords();   //ne pas creer de BaseShape mais renvoyer une ArrayList ou Collection directement?
    }

    // TODO appliquer la translation sur la forme.
    public BaseShape translate(Point2d point) {
        // iterator plutot que forloop ?
        for(Point2d p:coords) {
            p.translate(point);
        }
        return null;
    }

    // TODO appliquer la rotation sur la forme.
    public BaseShape rotate(Double angle) {
        // iterator plutot que forloop ?
        for(Point2d p:coords) {
            p.rotate(angle);
        }
        return null;
    }

    // TODO donner la plus grande valeur en X
    public Double getMaxX() {
        Double maxX = 0.0;
        // si pas de coords, maxX = undefined ?
        for(Point2d p:coords){
            if(p.X() > maxX){
                maxX = p.X();
            }
        }
        return maxX;
    }

    // TODO donner la plus grande valeur en Y
    public Double getMaxY() {
        Double maxY = 0.0;
        // si pas de coords, maxY = undefined ?
        for(Point2d p:coords){
            if(p.Y() > maxY){
                maxY = p.Y();
            }
        }
        return maxY;
    }

    // TODO donner les plus grandes valeurs en X et Y
    public Point2d getMaxCoord() {
        return new Point2d(getMaxX(), getMaxY());
    }

    // TODO donner la plus petite valeur en X
    public Double getMinX() {
        /*
        Double minX = coords.get(0);
        // si pas de coords, maxX = undefined ?
        for(Point2d p:coords){
            if(p.X() > minX){
                minX = p.X();
            }
        }
        return minX;*/
        return null;
    }
    // TODO donner la plus petite valeur en Y
    public Double getMinY() {
        return null;
    }

    // TODO donner les plus petites valeurs en X et Y
    public Point2d getMinCoord() {
        return null;
    }

    // TODO retourner une nouvelle forme.
    public BaseShape clone() {
        return this;
    }
}
