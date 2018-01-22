import org.junit.Test;

import static org.junit.Assert.*;

public class CamelCaserTest {

    @Test
    public void handoutTestCamelCase() {
        assertEquals("thisIsMyString", CamelCaser.camelCase("this is my string"));
        assertEquals("iAmTheBest", CamelCaser.camelCase("I am the best"));
        assertEquals(" HAHAHA", CamelCaser.camelCase("hahaha"));
        

    }
}