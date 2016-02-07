package test.scala.practice.sort

import junit.framework.TestCase
import org.junit.Assert._
import com.chongdashu.scala.practice.sort.BaseSort
import com.chongdashu.scala.practice.sort.QuickSort
import com.chongdashu.scala.practice.sort.BubbleSort

class TestSort extends TestCase{
    
    var Sort : BaseSort = BubbleSort;
    
    def testSort_ListReversed() = {
        val integerList = List(3,2,1);
        val expectedIntegerList = List(1,2,3);
        
        val sortedIntegerList = Sort.sort(integerList);
        assertEquals(expectedIntegerList, sortedIntegerList);
    }
    
    def testSort_ListSorted() = {
        val integerList = List(1,2,3);
        val expectedIntegerList = List(1,2,3);
        
        val sortedIntegerList = Sort.sort(integerList);
        assertEquals(expectedIntegerList, sortedIntegerList);
    }
    
    def testSort_ListRandom() = {
        val integerList = List(3,1,2);
        val expectedIntegerList = List(1,2,3);
        
        val sortedIntegerList = Sort.sort(integerList);
        assertEquals(expectedIntegerList, sortedIntegerList);
    }

}