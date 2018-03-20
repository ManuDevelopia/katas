package info.developia.katas;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortByBinaryOnesTest {

    @Test
    public void testSort() {
        SortByBinaryOnes sortByBinary = new SortByBinaryOnes();

        // assert kata proposed imput and result
        assertEquals(sortByBinary.sort(new Integer[]{1,15,5,7,3}), new Integer[]{15, 7, 3, 5, 1});

        assertEquals(sortByBinary.sort(new Integer[]{1, 3}), new Integer[]{3, 1});
        assertEquals(sortByBinary.sort(new Integer[]{1, 2, 3, 4}), new Integer[]{3, 1, 2, 4});
    }

}