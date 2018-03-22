package info.developia.katas;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortByBinaryOnesTest {

    @Test
    public void testSort() {
        SortByBinaryOnes sortByBinary = new SortByBinaryOnes();

        // assert kata proposed imput and result
        assertEquals(sortByBinary.sort(new Integer[]{2, 2048, 3}), new Integer[]{3, 2048, 2});
        assertEquals(sortByBinary.sort(new Integer[]{2048,1,15,5,7}), new Integer[]{15, 7, 5, 2048, 1});
        assertEquals(sortByBinary.sort(new Integer[]{2048,1,15,5,7,3}), new Integer[]{15, 7, 3, 5, 2048, 1});
        assertEquals(sortByBinary.sort(new Integer[]{1,15,5,7,3}), new Integer[]{15, 7, 3, 5, 1});
        assertEquals(sortByBinary.sort(new Integer[]{1, 3}), new Integer[]{3, 1});
        assertEquals(sortByBinary.sort(new Integer[]{1, 2, 3, 4}), new Integer[]{3, 1, 2, 4});

//        In[1, 3]
//        OUT[3, 1]
//        In[1, 2, 3, 4]
//        OUT[3, 1, 2, 4]

//        In[1, 15, 5, 7, 3]
//        OUT[15, 7, 3, 5, 1]
//        In[80, 21]
//        OUT[21, 80]
//        In[0, 1024, 33]
//        OUT[33, 1024, 0]
//        In[2, 2048, 3]
//        OUT[3, 2048, 2]

    }

}