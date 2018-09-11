import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
    HelloWorld helloworld;
    public void setUp() throws Exception {
        helloworld = new HelloWorld();
    }

    @After
    public void tearDown() throws Exception {
        helloworld = null;
    }

    @Test
    public void printHelloWorld() {
        //Arrange
        String expectedValue = "Hello, World";
        //Act
        String result = helloworld.printHelloWorld();
        //Assert
        assertEquals (expectedValue, result);
    }
}