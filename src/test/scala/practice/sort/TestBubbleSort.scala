package test.scala.practice.sort

import junit.framework.TestCase
import org.junit.Assert._
import com.chongdashu.scala.practice.BubbleSort;

class TestQuickSort extends TestCase{
    
    override def setUp() = {
        
    }
    
    def testQuickSort_ListReversed() = {
        val integerList = List(3,2,1);
        val expectedIntegerList = List(1,2,3);
        
        val sortedIntegerList = BubbleSort.sort(integerList);
        assertEquals(expectedIntegerList, sortedIntegerList);
    }
    
    def testQuickSort_ListSorted() = {
        val integerList = List(1,2,3);
        val expectedIntegerList = List(1,2,3);
        
        val sortedIntegerList = BubbleSort.sort(integerList);
        assertEquals(expectedIntegerList, sortedIntegerList);
    }
    
    def testQuickSort_ListRandom() = {
        val integerList = List(3,1,2);
        val expectedIntegerList = List(1,2,3);
        
        val sortedIntegerList = BubbleSort.sort(integerList);
        assertEquals(expectedIntegerList, sortedIntegerList);
    }

}