import com.test.junit.activity5.Ejercicio3;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio3Test_j5 {

    @ParameterizedTest
    @CsvSource({
            "test, password too short",
            "testtest, ********",
            "qwertyuiopasdfghjkl, ************",
            "qwertyuiopasdfghjklzxcvbnm1234567890qwertyuiop, password too long"
    })
    public void mask(String input, String result) {
        Ejercicio3 pass = new Ejercicio3();
        assertEquals(result, pass.mask(input));
    }
}