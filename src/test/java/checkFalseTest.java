/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.bulelani.mavenproject.checkFalse;
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
public class checkFalseTest {
    
    public checkFalseTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //         assertFalse(num1 > num2);
    //     assertTrue(num1 < num2);
    // @Test
    // public void hello() {}
    @org.testng.annotations.Test
    public void testFalse(){
        checkFalse cf = new checkFalse();
        assertFalse(cf.num1 > cf.num2);
    }
    @org.testng.annotations.Test
    public void testTruth(){
        checkFalse cf = new checkFalse();
        assertTrue(cf.num1 < cf.num2);
    }
}
