import com.test.junit.activity5.Ejercicio4;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio4Test_j5 {

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 5, 9, 3, 5, 7",
            "0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0",
    })

    void getDiagonals(int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, int b1, int b2, int b3, int b4, int b5, int b6) {
        int[][] matrix = {
                {a1, a2, a3},
                {a4, a5, a6},
                {a7, a8, a9}
        };

        int[][] expected = {
                {b1, b2, b3},
                {b4, b5, b6}
        };
        Ejercicio4 diagonal = new Ejercicio4();
        int[][] result = diagonal.getDiagonals(matrix);

        assertArrayEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "1.1, 2.2 , 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 13.2, 16.5, 19.8",
            "-1.1, -2.2 , -3.3, -4.4, -5.5, -6.6, -7.7, -8.8, -9.9, -13.2, -16.5, -19.8",
    })

    void addColumns(double a1, double a2, double a3, double a4, double a5, double a6, double a7, double a8, double a9, double b1, double b2, double b3) {
        double[][] matrix = {
                {a1, a2, a3},
                {a4, a5, a6},
                {a7, a8, a9}
        };

        double[] expected = {
                b1, b2, b3
        };

        Ejercicio4 diagonal = new Ejercicio4();
        double[] result = diagonal.addColumns(matrix);

        assertArrayEquals(expected, result, 0.0001);
    }
}