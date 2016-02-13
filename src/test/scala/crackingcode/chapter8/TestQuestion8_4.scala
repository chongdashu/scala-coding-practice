package test.scala.crackingcode.chapter8

import com.chongdashu.scala.practice.sort.BucketSort
import org.junit.Assert._
import junit.framework.TestCase
import main.scala.crackingcode.chapter8.Question8_4
import scala.collection.mutable.Set;

class TestQuestion8_4 extends TestCase {
    
    override def setUp() = {
    }
    
    def testEmptySet = { 
        var set : Set[Int] = Set();
        var expected : Set[Set[Int]] = Set(Set.empty[Int]);
        assertEquals(expected, Question8_4.getAllSubsets(Set.empty[Int]));
    }
    
    def testOneElementSet = { 
        var set : Set[Int] = Set(1);
        var expected : Set[Set[Int]] = Set(Set.empty[Int], Set(1));
        
        assertEquals(expected, Question8_4.getAllSubsets(set));
    }
    
    def testTwoElementSet = {
        var set : Set[Int] = Set(1,5);
        var expected : Set[Set[Int]] = Set(Set.empty[Int], Set(1), Set(5), Set(1,5));
        
        assertEquals(expected, Question8_4.getAllSubsets(set));
    }
    
    def testThreeElementSet = {
        var set : Set[Int] = Set(1,5,9);
        var expected : Set[Set[Int]] = Set(Set.empty[Int], Set(1), Set(5), Set(9),
                                           Set(1,5), Set(1,9), Set(5,9), Set(1,5,9));
        
        assertEquals(expected, Question8_4.getAllSubsets(set));
    }
    
    def testFourElementSet = {
        var set : Set[Int] = Set(1,2,3,4);
        var expected : Set[Set[Int]] = Set(
                Set.empty[Int], Set(1), Set(2), Set(3), Set(4),
                Set(1,2), Set(1,3), Set(1,4), Set(2,3), Set(2,4),
                Set(3,4), Set(1,2,3), Set(1,2,4), Set(1,3,4),
                Set(2,3,4), Set(1,2,3,4));
                                          
        var actual : Set[Set[Int]] = Question8_4.getAllSubsets(set);
        assertEquals("Length of superset should be be 16", scala.math.pow(2, set.size).toInt, actual.size);
        assertEquals(expected, Question8_4.getAllSubsets(set));
    }
    
}