package org.example.maven;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNgAssertions {

    @BeforeClass
    public void testBeforeClass(){
        System.out.println("Hello I am before class");
    }
    @BeforeMethod
    public void testBeforeMethod(){
        System.out.println("Hello I am before method");
    }
    @Test
    public void testAssertEqual(){
        String a ="India";
        String b ="India";
        Assert.assertEquals(a,b,"Failed in comparison");
    }
    @Test
    public void testAssertTrue(){
        int actual =1;
        int expected =1;
       // Assert.assertTrue((actual==expected));
        Assert.assertTrue(returnTrue(actual,expected),"Comparison didnt match");
    }

    @Test
    public void testAssertFalse(){
        int actual =1;
        int expected =1;
        // Assert.assertTrue((actual==expected));
        Assert.assertFalse(returnFalse(actual,expected),"Comparison matached!!");
    }
    @Test
    public void testAssertFalseForSum(){
        //verify if total return is not equal to expected,if returned FALSE test will pass else fail
        int a=2;
        int b=3;

        int expected =10;
        int actual = sum(a,b);
        // Assert.assertTrue((actual==expected));
        Assert.assertFalse((actual==expected),"Comparison matached!!");
    }
    @Test
    public void testAssertTrueForSum(){
        //verify if total return is equal to expected,if returned TRUE test will pass else fail
        int a=2;
        int b=3;

        int expected =10;
        int actual =sum(a,b);

        // Assert.assertTrue((actual==expected));
        Assert.assertTrue((actual==expected),"Comparison didnt match!!");
    }

    public static boolean returnTrue(int a,int b){
        //returns true if condition is passed as true
        return (a==b);
    }
    public static boolean returnFalse(int a,int b){
        //returns false if condition is passed as false
        return (a!=b);
    }
    @AfterMethod
    public void testAfterMethod(){
        System.out.println("Run after after every test annotation");
    }
    @AfterClass
    public void testAfterClass(){
        System.out.println("Hello I am after class");
    }
    public static int sum(int a , int b){
        int sum = a+b;
        return sum;
    }
}



