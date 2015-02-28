/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.bulelani.mavenproject.checkString;
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
public class checkStringTest {
    
    public checkStringTest() {
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
    public void testNull(){
        checkString str = new checkString();
        
        assertNull(str.getString());
    }
    @org.testng.annotations.Test
    public void testNotNull(){
        checkString str1 = new checkString();
        assertNotNull(str1.getSurname());
    }
}
