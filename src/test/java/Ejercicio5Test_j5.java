import com.test.junit.activity5.Ejercicio5;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio5Test_j5 {

    @Test
    void sorted() {
        List<Integer> set1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> set2 = Arrays.asList(2, 4, 6, 8);


        List<Integer> mergedSet = Ejercicio5.sorted(set1, set2);


        List<Integer> expectedSet = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);


        assertEquals(expectedSet, mergedSet);
    }

    @Test
    void sortedOne() {
        List<Integer> set1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> set2 = Arrays.asList();


        List<Integer> mergedSet = Ejercicio5.sorted(set1, set2);


        List<Integer> expectedSet = Arrays.asList(1, 3, 5, 7, 9);


        assertEquals(expectedSet, mergedSet);
    }

    @Test
    void sortedTwo() {
        List<Integer> set1 = Arrays.asList();
        List<Integer> set2 = Arrays.asList(2, 4, 6, 8);


        List<Integer> mergedSet = Ejercicio5.sorted(set1, set2);


        List<Integer> expectedSet = Arrays.asList(2, 4, 6, 8);


        assertEquals(expectedSet, mergedSet);
    }

    @Test
    void empty() {
        List<Integer> set1 = Arrays.asList();
        List<Integer> set2 = Arrays.asList();


        List<Integer> mergedSet = Ejercicio5.sorted(set1, set2);


        List<Integer> expectedSet = Arrays.asList();


        assertEquals(expectedSet, mergedSet);
    }

    @Test
    void duplicates() {
        List<Integer> set1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> set2 = Arrays.asList(4, 5, 6, 7, 8);


        List<Integer> mergedSet = Ejercicio5.sorted(set1, set2);


        List<Integer> expectedSet = Arrays.asList(1, 2, 3, 4, 4, 5, 5, 6, 7, 8);


        assertEquals(expectedSet, mergedSet);
    }
}
