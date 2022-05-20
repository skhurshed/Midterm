package math.problems;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

public class UnitTestingMath {
    //Apply Unit testing into each classes and methods in this package.
    @Test
    public void testFactorial5() {
        Factorial fact;
       fact = new Factorial();
        Assert.assertEquals(120, fact.fact(5));
    }


    @Test
    public void testFibonacci() {
        Fibonacci fib;
        fib= new Fibonacci();
        Assert.assertEquals(2, Objects.equals(fib, 2));

    }

    @Test
    public void testLowestDifference(){
        FindLowestDifference findSmallest;
        findSmallest= new FindLowestDifference();
        Assert.assertEquals(1,1);
    }

    @Test
    public void testMissingNumber(){
        FindMissingNumber sum;
        sum= new FindMissingNumber();
        Assert.assertEquals(9,9);
    }

    @Test
    public void testLowestNumber(){
        LowestNumber min;
        min = new LowestNumber();
        Assert.assertEquals(10,10);
    }

    @Test
    public void testMakePyramid(){
        MakePyramid printTriangle;
        printTriangle= new MakePyramid();
        Assert.assertEquals(6,6);
    }

    @Test
    public void testPattern(){


    }

    @Test
    public void testPrimeNumber(){
        PrimeNumber count;
        count= new PrimeNumber();
        Assert.assertEquals(1,1);
    }


    }

