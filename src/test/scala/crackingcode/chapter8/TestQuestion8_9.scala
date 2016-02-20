package test.scala.crackingcode.chapter8

import junit.framework.TestCase
import org.junit.Assert._
import main.scala.crackingcode.chapter8.Question8_7
import main.scala.crackingcode.chapter8.Question8_9

class TestQuestion8_9 extends TestCase {
  
    def testZeroParenPairs = {
        var expected : Set[String] = Set.empty;
        var actual : Set[String] = Question8_9.getParens(0);
        assertEquals(expected, actual);
    }
    
    def testOneParenPair = {
        var expected : Set[String] = Set("()");
        var actual : Set[String] = Question8_9.getParens(1);
        assertEquals(expected, actual);
    }
    
    def testTwoParenPairs = {
        var expected : Set[String] = Set("(())", "()()");
        var actual : Set[String] = Question8_9.getParens(2);
        assertEquals(expected, actual);
    }
    
    def testThreeParenPairs = {
        var expected : Set[String] = Set(
            "((()))", "(()())", "(())()",
            "()(())", "()()()"
        );
        var actual : Set[String] = Question8_9.getParens(3);
        assertEquals(expected, actual);
    }
    
    def testFourParenPairs = {
        var expected : Set[String] = Set(
            "(((())))", "(()(()))", "((())())", "()()()()",
            "((()))()", "()(())()", "()()(())", "()((()))",
            "(())()()", "(()()())"
        );
        var actual : Set[String] = Question8_9.getParens(4);
        println(actual.size);
        assertEquals(expected, actual);
    }
}