package org.example.maven;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @BeforeMethod
    public void testBeforeMethod(){
        System.out.println("Hello I am before method");
    }
    @Test
    public void shouldAnswerWithTrue()
    {

        System.out.println("I am into testing");
    }
    @Test
    public void method2(){
        System.out.println("Hello I am method 2");
    }
    @AfterMethod
    public void testAfterMethod(){
        System.out.println("Run after after every test annotation");
    }
}
