import org.junit.Test;

import static org.junit.Assert.*;

public class CamelCaserTest {

    /*
    This function will take the input string and if possible produce a lower camel cased version of that
string. For a string to be able to be camel cased it must only include whitespace, letters, and
digits according to the functions in the Java Character class. If the input string contains other
characters you should throw an exception of type IllegalArgumentExceptions with an "Invalid
Character" error message. If the input string contains words that start with digits you should throw
an exception of type IllegalArgumentExceptions with a "Invalid Format" error message. If a
null is passed in you should throw an exception of type IllegalArgumentException with a "Null
Input" error message. To support good programing style there is an included class ErrorConstants
that should be used for the error strings for these exceptions. In all other cases the lower camel
case version of the string should be returned.
The lower camel case version of the string is defined as follows.
• Divide the string into words, splitting on whitespace.
• Lowercase everything, then uppercase only the first character of each word except the first.
• Join all the words into a single string.
     */
    @Test
    public void handoutTestCamelCase() {


        assertEquals("thisIsMyString", CamelCaser.camelCase("this is my string"));

    }

        @Test
                public void space() {
            assertEquals("iAmTheBest", CamelCaser.camelCase("      I    am the best")); //Tests spaces at the start and in between words
            assertEquals("iHii8", CamelCaser.camelCase("I         HIi8")); // similar case with numbers and different Captials
        }

        @Test
                public void Numbers(){
            assertEquals("iHi8", CamelCaser.camelCase("I hi8")); //if there's numbers in the between the words
        }

        @Test
                public void Letters(){
            assertEquals("hahaha", CamelCaser.camelCase("HAHAHA")); //caps lock
            assertEquals("", CamelCaser.camelCase("")); //empty string
            assertEquals("hiIAmAishik", CamelCaser.camelCase("HI I aM AiSHik")); //random captials
            assertEquals("lolhi", CamelCaser.camelCase("lolHi")); //if its already good to go
            assertEquals("lolhi", CamelCaser.camelCase("lolhi")); //if there's no change required

        }





    @Test
    public void WrongCharacter() {
        try {
            CamelCaser.camelCase("*dfsdfsdf");

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }


        try {
            CamelCaser.camelCase("haha1+6");

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void IrdinaTest() { // A friend challenged my code and wrote this test case and ofc it passed :)
        assertEquals("lolhi", CamelCaser.camelCase("lolhi"));
        assertEquals("whatSp8cesAreExisting", CamelCaser.camelCase("   What     sp8Ces  aRE            existing"));
        assertEquals("whatSp8cesAre", CamelCaser.camelCase("   What     sp8Ces  aRE            ")); //space after
    }

    @Test
    public void nullInput() {
        try {
            CamelCaser.camelCase(null);

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void wrongDigits() {
        try {
            CamelCaser.camelCase("haha 8op");

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } // ok
    }
}










