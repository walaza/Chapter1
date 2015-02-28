/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.bulelani.mavenproject.arrayContent;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//import org.testng.annotations.Test;
/**
 *
 * @author Training06
 */
public class arrayContentTest {
    
    public arrayContentTest() {
    }
    @org.testng.annotations.Test
    public void hello() {
        arrayContent arr = new arrayContent();
        String[] expectedArray = {"bulelani", "bulumko", "sihle"};
        String[] resultArray = arr.getArray();
        assertArrayEquals(expectedArray, resultArray);
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
}
