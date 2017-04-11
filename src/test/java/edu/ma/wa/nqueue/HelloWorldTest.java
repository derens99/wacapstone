package edu.ma.wa.nqueue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HelloWorldTest {

    // Run once, e.g. Database connection, connection pool
    @BeforeClass
    public static void runOnceBeforeClass() {
     }

    // Run once, e.g close connection, cleanup
    @AfterClass
    public static void runOnceAfterClass() {
    }

    // Should rename to @BeforeTestMethod
    // e.g. Creating an similar object and share for all @Test
    @Before
    public void runBeforeTestMethod() {
    }

    // Should rename to @AfterTestMethod
    @After
    public void runAfterTestMethod() {
    }

    @Test
    public void testGetMessage()
    {
      assertEquals(HelloWorld.MESSAGE, HelloWorld.getMessage());
    }



}
