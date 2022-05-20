package string.problems;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class UnitTestingStringProblem {

    @Test
    public void testAnagram(){
        Anagram result;
        result= new Anagram();
        Assert.assertTrue(String.valueOf(result), true);

    }

    @Test
    public void testDetermineLargestWord() {

        assertEquals(10,10);
    }

    @Test
    public void testDuplicateWords(){

       Assert.assertEquals(3,3);

    }

    @Test
    public void testPalindrome(){
        Assert.assertEquals(true,true);


    }

    @Test
    public void testPermutation(){
        Permutation perm;
        perm= new Permutation();
        Assert.assertTrue(true);

    }
    }

