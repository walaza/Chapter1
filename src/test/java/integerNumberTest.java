/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.bulelani.mavenproject.integerNumbers;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Training06
 */
public class integerNumberTest {
    
    public integerNumberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
@org.testng.annotations.Test
     public void add() {
     integerNumbers num = new integerNumbers();
     int result = num.add(10,20);
     Assert.assertEquals("Testing integers", 30, result);  
     }
  @org.testng.annotations.Test
  public void testFloats(){
      Assert.assertEquals(0.0012f, 0.0014f, 0.0002); 
  }
}
