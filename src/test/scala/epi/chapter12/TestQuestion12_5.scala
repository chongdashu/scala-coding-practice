package test.scala.epi.chapter12

import org.junit.Assert._
import junit.framework.TestCase
import main.scala.epi.chapter12.Question12_5

class TestQuestion12_5 extends TestCase {
    
    override def setUp() = {
    }
    
    def testSquareRootZero = {
        val value = 0;
        val expected = 0;
        val actual = Question12_5.squareRoot(value);
        assertEquals(s"For $value: $expected^2=${expected*expected}; but $actual^2=${actual*actual}", expected, actual);
    }
    
    def testSquareRootOne = {
        val value = 1;
        val expected = 1;
        val actual = Question12_5.squareRoot(value);
        assertEquals(s"For $value: $expected^2=${expected*expected}; but $actual^2=${actual*actual}", expected, actual);
    }
    
    def testSquareRootTwo = {
        val value = 2;
        val expected = 1;
        val actual = Question12_5.squareRoot(value);
        assertEquals(s"For $value: $expected^2=${expected*expected}; but $actual^2=${actual*actual}", expected, actual);
    }
    
    def testSquareRootThree = {
        val value = 3;
        val expected = 1;
        val actual = Question12_5.squareRoot(value);
        assertEquals(s"For $value: $expected^2=${expected*expected}; but $actual^2=${actual*actual}", expected, actual);
    }
    
    def testSquareRootFour = {
        val value = 4;
        val expected = 2;
        val actual = Question12_5.squareRoot(value);
        assertEquals(s"For $value: $expected^2=${expected*expected}; but $actual^2=${actual*actual}", expected, actual);
    }
    
    def testBookExampleOne {
        var value = 16;
        var expected = 4;
        var actual = Question12_5.squareRoot(value);
        
        assertEquals(s"For $value: $expected^2=${expected*expected}; but $actual^2=${actual*actual}", expected, actual);
    }
    
    def testBookExampleTwo {
        var value = 300;
        var expected = 17;
        var actual = Question12_5.squareRoot(value);
        
        assertEquals(s"For $value: $expected^2=${expected*expected}; but $actual^2=${actual*actual}", expected, actual);
    }
    
    
    
}