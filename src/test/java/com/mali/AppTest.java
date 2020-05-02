package com.mali;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


/**
 * Unit test for simple App.
 */



public class AppTest {

    private final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() {
        app.init();

    }


    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}





