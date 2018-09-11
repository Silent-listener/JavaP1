import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharTypeTest {
    CharType charType;
   
    @Before
    public void setUp() throws Exception {
         charType = new CharType();
    }

    @After
    public void tearDown() throws Exception {
        charType = null;
    }

    @Test
    public void upperCaseCheck() {
        //Arrange
        String expectedValue = "Upper Case";
        //Act
        String result = charType.typeOfChar('S');
        //Assert
        assertEquals (expectedValue, result);
    }

    @Test
    public void lowerCaseCheck() {
        //Arrange
        String expectedValue = "Lower Case";
        //Act
        String result = charType.typeOfChar('d');
        //Assert
        assertEquals (expectedValue, result);
    }

    @Test
    public void digitCheck() {
        //Arrange
        String expectedValue = "Digit";
        //Act
        String result = charType.typeOfChar('6');
        //Assert
        assertEquals (expectedValue, result);
    }

    @Test
    public void specialCharacterCheck() {
        //Arrange
        String expectedValue = "Special Character";
        //Act
        String result = charType.typeOfChar('$');
        //Assert
        assertEquals (expectedValue, result);
    }

}