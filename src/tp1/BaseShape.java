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
        return this;
    }
    public BaseShape add(BaseShape shape) {
        coords.addAll(shape.getCoords());
        return this;
    }
    public BaseShape addAll(Collection<Point2d> coords) {
        this.coords.addAll(coords);
        return this;
    }
    public BaseShape remove(Point2d coord) {
        coords.remove(coord);
        return this;
    }
    public BaseShape remove(BaseShape shape) {
        this.coords.removeAll(shape.getCoords());
        return this;
    }
    public BaseShape removeAll(Collection<Point2d> coords) {
        this.coords.removeAll(coords);
        return this;
    }

    // TODO retourner les coordonnees de la liste.
    public Collection<Point2d> getCoords() {
        return coords;
    }

    // TODO retourner une nouvelle liste ou tous les points sont des copy
    public Collection<Point2d> getCoordsDeepCopy() {
        BaseShape newBaseShape = new BaseShape();

        for (Point2d p : coords) {
            newBaseShape.add(p.clone());
        }

        return newBaseShape.getCoords();
    }

    // TODO appliquer la translation sur la forme.
    public BaseShape translate(Point2d point) {
        // iterator plutot que forloop ?
        for(Point2d p:coords) {
            p.translate(point);
        }
        return this;
    }

    // TODO appliquer la rotation sur la forme.
    public BaseShape rotate(Double angle) {
        // iterator plutot que forloop ?
        for(Point2d p:coords) {
            p.rotate(angle);
        }
        return this;
    }

    // TODO donner la plus grande valeur en X
    public Double getMaxX() {
        Iterator<Point2d> ite = coords.iterator();
        Double maxX = ite.next().X();

        for(Point2d p : coords){
            if(p.X() > maxX){
                maxX = p.X();
            }
        }
        return maxX;
    }

    // TODO donner la plus grande valeur en Y
    public Double getMaxY() {
        Iterator<Point2d> ite = coords.iterator();
        Double maxY = ite.next().Y();

        for(Point2d p : coords){
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
        Iterator<Point2d> ite = coords.iterator();
        Double minX = ite.next().X();

        for(Point2d p : coords) {
            if(p.X() < minX){
                minX = p.X();
            }
        }
        return minX;
    }

    // TODO donner la plus petite valeur en Y
    public Double getMinY() {
        Iterator<Point2d> ite = coords.iterator();
        Double minY = ite.next().Y();

        for(Point2d p : coords) {
            if(p.Y() < minY){
                minY = p.Y();
            }
        }
        return minY;
    }

    // TODO donner les plus petites valeurs en X et Y
    public Point2d getMinCoord() {
        return new Point2d(getMinX(), getMinY());
    }

    // TODO retourner une nouvelle forme.
    public BaseShape clone() {
        return new BaseShape(this.coords);
    }
}
