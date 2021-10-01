package tp1;

import java.util.*;

public final class PointOperator {

    // TODO appliquer la translation sur le vecteur d'entree.
    public static void translate(Double[] vector, Double[] translateVector) {
        for(int i = 0; i < vector.length; i++ ) {
            vector[i] += translateVector[i];
        }
    }

    // TODO appliquer la translation sur le vecteur d'entree.
    public static void rotate(Double[] vector, Double[][] rotationMatrix) {
        double x = vector[0];
        double y = vector[1];

        vector[0] = x*rotationMatrix[0][0] + y*rotationMatrix[0][1];
        vector[1] = x*rotationMatrix[1][0] + y*rotationMatrix[1][1];
    }

    // TODO appliquer la translation sur le vecteur d'entree.
    public static void divide(Double[] vector, Double divider) {
        for(int i = 0; i < vector.length; i++ ) {
            vector[i] /= divider;
        }
    }

    // TODO appliquer la translation sur le vecteur d'entree.
    public static void multiply(Double[] vector, Double multiplier) {
        for(int i = 0; i < vector.length; i++ ) {
            vector[i] *= multiplier;
        }
    }

    // TODO appliquer la translation sur le vecteur d'entree.
    public static void add(Double[] vector, Double adder) {
        for(int i = 0; i < vector.length; i++ ) {
            vector[i] += adder;
        }
    }
}
