package test.scala.practice.sort

import junit.framework.TestCase
import com.chongdashu.scala.practice.QuickSort
import org.junit.Assert._

class TestBubbleSort extends TestCase{
    
    override def setUp() = {
        
    }
    
    def testBubbleSort_ListReversed() = {
        val integerList = List(3,2,1);
        val expectedIntegerList = List(1,2,3);
        
        val sortedIntegerList = QuickSort.sort(integerList);
        assertEquals(expectedIntegerList, sortedIntegerList);
    }
    
    def testBubbleSort_ListSorted() = {
        val integerList = List(3,2,1);
        val expectedIntegerList = List(1,2,3);
        
        val sortedIntegerList = QuickSort.sort(integerList);
        assertEquals(expectedIntegerList, sortedIntegerList);
    }
    
    def testBubbleSort_ListRandom() = {
        val integerList = List(3,1,2);
        val expectedIntegerList = List(1,2,3);
        
        val sortedIntegerList = QuickSort.sort(integerList);
        assertEquals(expectedIntegerList, sortedIntegerList);
    }

}