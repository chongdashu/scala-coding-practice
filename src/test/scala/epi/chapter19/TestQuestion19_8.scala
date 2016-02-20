package test.scala.epi.chapter19

import com.chongdashu.scala.practice.sort.BucketSort
import org.junit.Assert._
import junit.framework.TestCase
import main.scala.epi.chapter19.Question19_2
import main.scala.epi.chapter19.Question19_8

class TestQuestion19_8 extends TestCase {
    
    override def setUp() = {
    }
    
    def testProductionSequenceLengthOne = {
        val start = "bat";
        val end = "bat";
        val dict : Set[String] = Set("bat");
        
        val expected : List[String] = List("bat");
        val actual = Question19_8.getProductionSequence(dict, start, end);
        
        assertEquals(expected, actual);
    }
    
    def testProductionSequenceLengthTwo = {
        val start = "bat";
        val end = "bot";
        val dict : Set[String] = Set("bat", "bot");
        
        val expected : List[String] = List("bat", "bot");
        val actual = Question19_8.getProductionSequence(dict, start, end);
        
        assertEquals(expected, actual);
    }
    
    def testProductionSequenceBookExample = {
        val start = "cat";
        val end = "dog";
        val dict : Set[String] = Set("bat", "cot", "dog", "dag", "dot", "cat");
        
        val expected : List[String] = List("cat", "cot", "dot", "dog");
        val actual = Question19_8.getProductionSequence(dict, start, end);
        
        assertEquals(expected, actual);
    }
    
    
}