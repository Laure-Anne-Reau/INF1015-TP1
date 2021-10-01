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
        Rectangle rectangle = new Rectangle(halfStripeThickness, maxHeight);
        Ellipse ellipse = new Ellipse(new Point2d(halfMaxWidth, halfMaxHeight));
        Ellipse creux = new Ellipse(new Point2d(halfMaxWidth-halfStripeThickness, halfMaxHeight-stripeThickness));

        rectangle.translate(new Point2d(halfMaxWidth-(halfMaxWidth/4),-halfMaxHeight));

        a.add(rectangle);
        a.add(ellipse);
        a.remove(creux);

        return a;
    }

    // TODO
    public static BaseShape create_C() {
        return null;
    }

    // TODO
    public static BaseShape create_l() {
        Rectangle l = new Rectangle(halfStripeThickness, maxHeight);
        return l;
    }

    // TODO
    public static BaseShape create_i() {
        BaseShape i = new BaseShape();
        Rectangle iBase = new Rectangle(halfStripeThickness, halfMaxHeight + (halfMaxHeight/2) );
        Circle iPoint = new Circle(halfStripeThickness);

        iBase.translate(new Point2d(halfStripeThickness/2, halfMaxHeight/2));
        iPoint.translate(new Point2d(halfStripeThickness, halfStripeThickness));

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
        Rectangle rectangleGauche = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle rectangleDroite = new Rectangle(halfStripeThickness, maxHeight);

        rectangleGauche.rotate(-550.0);
        rectangleDroite.rotate(550.0);
        rectangleGauche.translate(new Point2d(-(halfStripeThickness-(halfStripeThickness/2)), 0.0));
        rectangleDroite.translate(new Point2d(halfStripeThickness-(halfStripeThickness/2), 2.5));

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
        Rectangle rectangle = new Rectangle(halfStripeThickness, maxHeight);
        Circle cercleHaut = new Circle(halfMaxHeight/2);
        Circle cercleBas = new Circle(halfMaxHeight/2);
        Rectangle demiCercle = new Rectangle(halfMaxHeight/2,maxHeight);
        //Circle creux = new Circle((halfMaxHeight/2)-halfStripeThickness);

        demiCercle.translate(new Point2d(-maxWidth, -maxHeight));

        cercleHaut.translate(new Point2d(-(maxWidth+halfStripeThickness), -(halfMaxHeight+halfMaxHeight/2)));
        cercleBas.translate(new Point2d(-(maxWidth+halfStripeThickness), -(halfMaxHeight)));

        rectangle.translate(new Point2d(-(maxWidth+halfMaxWidth), -maxHeight));

        B.add(cercleHaut);
       // B.remove(creux);
        B.add(cercleBas);
        //B.remove(demiCercle);
       // B.add(rectangle);

        return B;
    }
}
