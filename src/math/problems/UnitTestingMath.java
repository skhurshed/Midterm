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

    }

    @Test
    public void testMissingNumber(){

    }

    @Test
    public void testLowestNumber(){

    }

    @Test
    public void testMakePyramid(){

    }

    @Test
    public void testPattern(){

    }

    @Test
    public void testPrimeNumber(){

    }


    }

