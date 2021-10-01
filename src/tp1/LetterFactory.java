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
        return null;
    }

    // TODO
    public static BaseShape create_C() {
        return null;
    }

    // TODO
    public static BaseShape create_l() {
        Rectangle l = new Rectangle(maxHeight , maxWidth);
        return l;
    }

    // TODO
    public static BaseShape create_i() {
        Rectangle iBase = new Rectangle(maxHeight , maxWidth);
        Circle iPoint = new Circle(halfMaxWidth);
        BaseShape i = new BaseShape();

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
        Rectangle rectangleGauche = new Rectangle(maxHeight, maxWidth);
        Rectangle rectangleDroite = new Rectangle(maxHeight, maxWidth);
        BaseShape v = new BaseShape();

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
        return null;
    }
}
