/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.bulelani.mavenproject.objectEquality;
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
public class objectEqualityTest {
    
    public objectEqualityTest() {
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
    public void testFalse(){
        objectEquality ob = new objectEquality();
       assertEquals(ob.name, ob.name1);
    }
    @org.testng.annotations.Test
    public void testFail(){
        objectEquality obj = new objectEquality();
       assertEquals(obj.num, obj.num1);
    }
}
