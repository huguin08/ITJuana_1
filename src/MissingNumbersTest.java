import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MissingNumbersTest {
    @Test
    public void testFindMissingNumbersExample1() {
        // Caso de prueba 1:
        List<Integer> nums = Arrays.asList(4, 3, 2, 7, 8, 2, 3, 1);
        List<Integer> expected = Arrays.asList(5, 6);
        List<Integer> result = MissingNumbers.findMissingNumbers(nums);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindMissingNumbersExample2() {
        // Caso de prueba 2:
        List<Integer> nums = Arrays.asList(1, 1);
        List<Integer> expected = Arrays.asList(2);
        List<Integer> result = MissingNumbers.findMissingNumbers(nums);
        Assertions.assertEquals(expected, result);
    }
}