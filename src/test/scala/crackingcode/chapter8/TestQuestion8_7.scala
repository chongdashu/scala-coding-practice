package test.scala.crackingcode.chapter8

import junit.framework.TestCase
import org.junit.Assert._
import main.scala.crackingcode.chapter8.Question8_7

class TestQuestion8_7 extends TestCase {
  
    def testEmptyString() {
        var string = "";
        var expected = Set[String](string);
        var actual = Question8_7.getPermutations(string);
        
        assertEquals(expected, actual);
    }
    
    def testStringLengthOne() {
        var string = "a";
        var expected = Set[String](string);
        var actual = Question8_7.getPermutations(string);
        
        assertEquals(expected, actual);
    }
    
    def testStringLengthTwo() {
        var string = "ab";
        var expected = Set[String]("ab", "ba");
        var actual = Question8_7.getPermutations(string);
        
        assertEquals(expected, actual);
    }
    
    def testStringLengthThree() {
        var string = "abc";
        var expected = Set[String]("abc", "acb", "bac", "bca", "cab", "cba");
        var actual = Question8_7.getPermutations(string);
        
        assertEquals(expected, actual);
    }
    
    def testStringLengthFour() {
        var string = "abcd";
        var expected = Set[String](
                "abcd", "abdc", "acbd", "acdb", "adbc", "adcb", 
                "bacd", "badc", "bcad", "bcda", "bdac", "bdca", 
                "cabd", "cadb", "cbad", "cbda", "cdab", "cdba",
                "dabc", "dacb", "dbac", "dbca", "dcab", "dcba");
        var actual = Question8_7.getPermutations(string);
        
        assertEquals(expected, actual);
    }
}