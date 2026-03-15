import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {

    @Test
    public void testFindLastNull() {
        // Do not execute fault
        assertThrows(NullPointerException.class, () -> {ArrayUtils.findLast(null, 3);});
    }

    @Test
    public void testFindLastEmpty() {
        assertEquals(-1, ArrayUtils.findLast(new int[]{}, 3));
    }

    @Test
    public void testFindLastNonExistent() {
        assertEquals(-1, ArrayUtils.findLast(new int[]{1, 2}, 3));
    }

    @Test
    public void testFindLastExistsFirstElement() {
        assertEquals(0, ArrayUtils.findLast(new int[]{2, 3, 5}, 2));
    }

    @Test
    public void testOddOrPosNull() {
        assertThrows(NullPointerException.class, () -> {ArrayUtils.oddOrPos(null);});
    }


    @Test
    public void testOddOrPosAllPositives() {
        assertEquals(3, ArrayUtils.oddOrPos(new int[]{1, 2, 3}));
    }

    @Test
    public void testOddOrPositiveBothPositivesAndNegatives() {
        assertEquals(3, ArrayUtils.oddOrPos(new int[]{-3, -2, 0, 1, 4}));
    }

    @Test
    public void testOddOrPosFullCoverage() {
        int[] mixedArray = {1, -3, 2, 0, -2};
        assertEquals(3, ArrayUtils.oddOrPos(mixedArray));
    }


//    @Test
//    public void testOddOrPosEmpty() {
//        assertEquals(0, ArrayUtils.oddOrPos(new int[]{}));
//    }
//
//
//    @Test
//    public void testCountOfFullCoverage() {
//
//        assertEquals(2, ArrayUtils.countOf(new int[]{1, 2, 2, 3}, 2));
//    }
//
//    @Test
//    public void testCountOfEmptyAndNotFound() {
//        assertEquals(0, ArrayUtils.countOf(new int[]{}, 1));
//        assertEquals(0, ArrayUtils.countOf(new int[]{1, 3}, 2));
//    }

}