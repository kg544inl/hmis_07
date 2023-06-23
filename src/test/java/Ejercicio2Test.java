import com.test.junit.activity5.Ejercicio2;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ejercicio2Test {

    @Test
    public void login() {
        Ejercicio2 login = new Ejercicio2();

        assertFalse(login.login("test", "test"));
        assertFalse(login.login("", "test"));
        assertFalse(login.login("test", ""));
        assertFalse(login.login("qwertyuiopasdfghjklzxcvbnm1234567890", "test"));
        assertFalse(login.login("test", "qwertyuiopasdfghjklzxcvbnm1234567890"));
        assertTrue(login.login("user", "pass"));
    }

    @Test
    public void compruebaLoginEnBD() {
        Ejercicio2 login = new Ejercicio2();

        assertFalse(login.compruebaLoginEnBD("test", "test"));
        assertTrue(login.compruebaLoginEnBD("user", "pass"));
        assertFalse(login.compruebaLoginEnBD("user", "test"));
        assertFalse(login.compruebaLoginEnBD("test", "pass"));
    }
}