import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class TomJerryTest {
    TomJerry test;

    @Before
    public void setUp() throws Exception {
        test = new TomJerry();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void OddBw20and30() {
        //Arrange
        String expectedValue = "Jerry";
        //Act
        String result = test.EvenOdd(25);
        //Assert
        assertEquals (expectedValue, result);

    }

    @Test
    public void evenBw20and30() {
        //Arrange
        String expectedValue = "Tom";
        //Act
        String result = test.EvenOdd(26);
        //Assert
        assertEquals (expectedValue, result);

    }

    @Test
    public void notBw20and30() {
        //Arrange
        String expectedValue = "Number does not lie between 20 and 30";
        //Act
        String result = test.EvenOdd(36);
        //Assert
        assertEquals (expectedValue, result);

    }

    @Test
    public void at20() {
        //Arrange
        String expectedValue = "Number does not lie between 20 and 30";
        //Act
        String result = test.EvenOdd(20);
        //Assert
        assertEquals (expectedValue, result);

    }

    @Test
    public void at30() {
        //Arrange
        String expectedValue = "Number does not lie between 20 and 30";
        //Act
        String result = test.EvenOdd(30);
        //Assert
        assertEquals (expectedValue, result);

    }


}