import com.test.junit.activity5.Ejercicio1;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ejercicio1Test {

    @Test
    public void transformar() {
        Ejercicio1 transform = new Ejercicio1();

//		test 1
        int result = transform.transformar(8);
        assertEquals(1, result);

//		test 2
        result = transform.transformar(9);
        assertEquals(1, result);

//		test 3
        result = transform.transformar(15);
        assertEquals(1, result);

//		test 4
        result = transform.transformar(11);
        assertEquals(11, result);

//		test 5
//        result = transform.transformar(0);
//        assertEquals(0, result);

//		test 6
        result = transform.transformar(1);
        assertEquals(1, result);
    }
}