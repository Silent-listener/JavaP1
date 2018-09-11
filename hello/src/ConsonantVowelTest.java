import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsonantVowelTest {
    ConsonantVowel object;
    @Before
    public void setUp() throws Exception {
        object = new ConsonantVowel();
    }

    @After
    public void tearDown() throws Exception {
        object = null;
    }

    @Test
    public void vowelConsonant() {
        //Arrange
        String expectedValue = "Vowel Consonant ";
        //Act
        String result = object.checkVowelOrConsonant("ap");
        //Assert
        assertEquals (expectedValue, result);
    }

    @Test
    public void consonantConsonantConsonant () {
        //Arrange
        String expectedValue = "Consonant Consonant Consonant ";
        //Act
        String result = object.checkVowelOrConsonant("drt");
        //Assert
        assertEquals (expectedValue, result);
    }
}