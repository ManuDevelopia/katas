package info.developia.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Katas8kyuTest {

    @Test
    public void testRemoval() {
        assertEquals("loquen", Katas8kyu.removeFirstAndLastCharacter("eloquent"));
        assertEquals("ountr", Katas8kyu.removeFirstAndLastCharacter("country"));
        assertEquals("erso", Katas8kyu.removeFirstAndLastCharacter("person"));
        assertEquals("lac", Katas8kyu.removeFirstAndLastCharacter("place"));
    }

    @Test
    public void testFindMissingLetter() {
        assertEquals('e', Katas8kyu.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', Katas8kyu.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }

}