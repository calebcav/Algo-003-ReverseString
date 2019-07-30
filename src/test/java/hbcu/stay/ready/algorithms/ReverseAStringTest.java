package hbcu.stay.ready.algorithms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseAStringTest {

    private ReverseAString reverseAString;

    @Before
    public void setUp(){
        reverseAString = new ReverseAString();
    }

    @Test
    public void reverseAStringTest1(){
        String input = "I love Unit Testing";
        String expected = "Gnitset Tinu Evol I";
        String actual = reverseAString.reverseAString(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseAStringTest2(){
        String input = "Wutang Clan Is The Greatest";
        String expected = "Tsetaerg Eht Si Nalc Gnatuw";
        String actual = reverseAString.reverseAString(input);
        Assert.assertEquals(expected, actual);
    }
}
