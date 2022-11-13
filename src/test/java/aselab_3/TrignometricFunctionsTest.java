package aselab_3;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TrignometricFunctionsTest {
	double decimalpoints = 0.0001;
	
	public static final double pi = 3.14159265358979323846;

    @Test
    public void testSin()
    {
        // this test is used for checking sin(x) value compare to Math.sin(x)
        assertEquals(Math.sin(0.0), TrignometricFunctions.functionofSine(0.0), 0.001);
        assertEquals(Math.sin(60.0), TrignometricFunctions.functionofSine(60.0), 0.001);
        assertEquals(Math.sin(90.0), TrignometricFunctions.functionofSine(90.0), 0.001);
        assertEquals(Math.sin(120.0), TrignometricFunctions.functionofSine(120.0), 0.001);
        assertEquals(Math.sin(-180.0), TrignometricFunctions.functionofSine(-180.0), 0.001);
        assertEquals(Math.sin(-240.0), TrignometricFunctions.functionofSine(-240.0), 0.001);
        assertEquals(Math.sin(270.0), TrignometricFunctions.functionofSine(270.0), 0.001);
        assertEquals(Math.sin(360.0), TrignometricFunctions.functionofSine(360.0), 0.001);
    }

    @Test
    public void testCos()
    {
        // this test is used for checking cos(x) value compare to Math.cos(x)
    	assertEquals(Math.cos(0.0), TrignometricFunctions.functionofCos(0.0), 0.001);
        assertEquals(Math.cos(45.0), TrignometricFunctions.functionofCos(45.0), 0.001);
        assertEquals(Math.cos(150.0), TrignometricFunctions.functionofCos(150.0), 0.001);
        assertEquals(Math.cos(-180.0), TrignometricFunctions.functionofCos(-180.0), 0.001);
        assertEquals(Math.cos(-240.0), TrignometricFunctions.functionofCos(-240.0), 0.001);
        assertEquals(Math.cos(270.0), TrignometricFunctions.functionofCos(270.0), 0.001);
        assertEquals(Math.cos(360.0), TrignometricFunctions.functionofCos(360.0), 0.001);
    }

    @Test
    public void testTan()
    {
        // this test is used for checking tan(x) value compare to Math.tan(x)
    	  assertEquals( Math.tan(0.0), TrignometricFunctions.functionofTan(0.0), 0.001);
          assertEquals(Math.tan(45.0), TrignometricFunctions.functionofTan(45.0), 0.001);
          assertEquals( Math.tan(150.0), TrignometricFunctions.functionofTan(150.0), 0.001);
          assertEquals(Math.tan(-180.0), TrignometricFunctions.functionofTan(-180.0), 0.001);
          assertEquals( Math.tan(-240.0), TrignometricFunctions.functionofTan(-240.0), 0.001);
          assertEquals(Math.tan(270.0), TrignometricFunctions.functionofTan(270.0), 0.001);
          assertEquals(Math.tan(360.0), TrignometricFunctions.functionofTan(360.0), 0.001);
    }

    @Test
    public void testDegreeToRadian() {

        assertEquals(TrignometricFunctions.convertDegreeToRad(90.0), pi/2, 0.001);
        assertEquals(TrignometricFunctions.convertDegreeToRad(60.0), pi/3, 0.001);
        assertEquals(TrignometricFunctions.convertDegreeToRad(120.0), 2*pi/3, 0.001);
        assertEquals(TrignometricFunctions.convertDegreeToRad(-180.0), -pi, 0.001);
        assertEquals(TrignometricFunctions.convertDegreeToRad(-60.0), -1*pi/3, 0.001);
        assertEquals(TrignometricFunctions.convertDegreeToRad(270.0), 3*pi/2, 0.001);
        assertEquals(TrignometricFunctions.convertDegreeToRad(360.0), 4*pi/2, 0.001);
    }

	@Test
	public void factTesting() 
	{
		// this test is used for finding that whether or not your function will generate accurate value.
		assertEquals(120, TrignometricFunctions.factorial(5));
	}
	
	@Test
	public void powerTesting() 
	{
		// this test is used for finding that whether or not function will generate value for whose power is negative.
		assertEquals(Math.pow(2, 1), TrignometricFunctions.power(2, 1), "Negative power can't be calculated by this function.");
	}


	}




