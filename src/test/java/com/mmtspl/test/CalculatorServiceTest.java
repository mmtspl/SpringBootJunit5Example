package com.mmtspl.test;

import static org.junit.Assert.assertEquals;  
import org.junit.After;  
import org.junit.AfterClass;  
import org.junit.Before;  
import org.junit.BeforeClass;  
import org.junit.Test;  
import com.mmtspl.service.CalculationService;  

public class CalculatorServiceTest {
	  @BeforeClass  
	    public static void setUpBeforeClass() throws Exception {  
	        System.out.println("before class");  
	    }  
	    @Before  
	    public void setUp() throws Exception {  
	        System.out.println("before");  
	    }  
	  
	    @Test  
	    public void testFindMax(){  
	        System.out.println("test case find max");  
	        assertEquals(4,CalculationService.findMax(new int[]{1,3,4,2}));  
	        assertEquals(-2,CalculationService.findMax(new int[]{-12,-3,-4,-2}));  
	    }  
	    @Test  
	    public void testCube(){  
	        System.out.println("test case cube");  
	        assertEquals(27,CalculationService.cube(3));  
	    }  

		/*
		 * @Test public void testReverseWord(){
		 * System.out.println("test case reverse word");
		 * assertEquals("ym eman si nahk",CalculationService.
		 * reverseWord("my name is khan")); }
		 */
	    @After  
	    public void tearDown() throws Exception {  
	        System.out.println("after");  
	    }  
	  
	    @AfterClass  
	    public static void tearDownAfterClass() throws Exception {  
	        System.out.println("after class");  
	    }  
	  
}
