package tp1;

import org.w3c.dom.css.Rect;

public final class LetterFactory {
    final static Double maxHeight = 200.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;

    // TODO
    public static BaseShape create_e() {
        return null;
    }

    // TODO
    public static BaseShape create_a() {
        BaseShape a = new BaseShape();
        Rectangle rectangle = new Rectangle(maxWidth, maxHeight);
        Ellipse ellipse = new Ellipse(new Point2d(halfMaxWidth, halfMaxHeight));

        a.add(rectangle);
        a.add(ellipse);

        return a;

    }

    // TODO
    public static BaseShape create_C() {
        return null;
    }

    // TODO
    public static BaseShape create_l() {
        Rectangle l = new Rectangle(maxWidth, maxHeight);
        return l;
    }

    // TODO
    public static BaseShape create_i() {
        BaseShape i = new BaseShape();
        Rectangle iBase = new Rectangle(maxWidth, maxHeight);
        Circle iPoint = new Circle(halfMaxWidth);

        i.add(iBase);
        i.add(iPoint);

        return i;
    }

    // TODO
    public static BaseShape create_A() {
        return null;
    }

    // TODO
    public static BaseShape create_V() {
        BaseShape v = new BaseShape();
        Rectangle rectangleGauche = new Rectangle(maxWidth, maxHeight);
        Rectangle rectangleDroite = new Rectangle(maxWidth, maxHeight);

        rectangleGauche.rotate(100.0);
        rectangleDroite.rotate(50.0);

        v.add(rectangleGauche);
        v.add(rectangleDroite);

        return v;
    }

    // TODO
    public static BaseShape create_n() {
        return null;
    }

    // TODO
    public static BaseShape create_r() {
        return null;
    }

    // TODO
    public static BaseShape create_B() {
        BaseShape B = new BaseShape();
        Rectangle rectangle = new Rectangle(maxWidth, maxHeight);
        Circle cercleHaut = new Circle(halfMaxHeight/2);
        Circle cercleBas = new Circle(halfMaxHeight/2);

        rectangle.translate(new Point2d(-maxWidth, -maxHeight));
        cercleHaut.translate(new Point2d(halfMaxWidth/4, -halfMaxHeight));

        B.add(rectangle);
        B.add(cercleHaut);
        B.add(cercleBas);

        return B;
    }
}
