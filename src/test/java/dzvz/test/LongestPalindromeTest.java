package dzvz.test;
import org.junit.Assert;
import org.junit.Test;

import static dzvz.LongestPalindrome.findAndPrint;

/**
 * Created by dzmirtyviarzhbitski on 1/10/16.
 */
public class LongestPalindromeTest {

    @Test
    public void testAllStringPalindrome(){
        Assert.assertEquals("ABBA", findAndPrint("ABBA"));
    }

    @Test
    public void testBiggestPalindromel(){
        Assert.assertEquals("KKKKAAbbAAKKKK", findAndPrint("ABBAdaDDDDDDjkjkLKKKKAAbbAAKKKKq"));
    }

    @Test
    public void testNoPalindrome(){
        Assert.assertEquals(null, findAndPrint("asqwerty"));
    }

    @Test
    public void testBadData(){
        Assert.assertEquals("a", findAndPrint("a"));
    }
}
