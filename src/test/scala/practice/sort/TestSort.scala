package test.scala.practice.sort

import junit.framework.TestCase
import org.junit.Assert._
import com.chongdashu.scala.practice.sort.BaseSort
import com.chongdashu.scala.practice.sort.QuickSort
import com.chongdashu.scala.practice.sort.BubbleSort
import junit.framework.Test

class TestSort extends TestCase{
    
    var Sort : BaseSort = BubbleSort
    
    var singleIntegerList = List(1);
    
    var smallIntegerListReversed = List(5,4,3,2,1);
    var smallIntegerListRandom = List(4,5,2,3,1);
    var smallIntegerListSorted = List(1,2,3,4,5);
    var smallIntegerListAllSame = List(7,7,7,7,7);
    var smallIntegerListSomeSame = List(7,1,5,7,3);
    var smallIntegerListSomeSameSorted = List(1,3,5,7,7);
    
    /**
     * Sorting an empty list should just return the empty list.
     */
    def testSort_EmptyList() = {
        assertEquals(List.empty, Sort.sort(List.empty));
    }
    
    /**
     * Sorting a list with a single element should just return the
     * same list.
     */
    def testSort_SingleElementList() = {
        assertEquals(singleIntegerList, Sort.sort(singleIntegerList));
    }
    
    /**
     * Sort a small list that is in reverse order.
     */
    def testSort_SmallList_Reversed() = {
        assertEquals(smallIntegerListSorted, Sort.sort(smallIntegerListReversed));
    }
    
    /**
     * Sort a small list that is already sorted.
     */
    def testSort_SmallList_Sorted() = {
        assertEquals(smallIntegerListSorted, Sort.sort(smallIntegerListSorted));
    }
    
    /**
     * Sort a small list with elements randomly interspersed.
     */
    def testSort_SmallList_Random() = {
        assertEquals(smallIntegerListSorted, Sort.sort(smallIntegerListRandom));
    }
    
    /**
     * Sort a small list with all elements having the same value.
     */
    def testSort_SmallList_AllSame() = {
        assertEquals(smallIntegerListAllSame, Sort.sort(smallIntegerListAllSame));
    }
    
    /**
     * Sort a small list with all elements having the same value.
     */
    def testSort_SmallList_SomeSame() = {
        assertEquals(smallIntegerListSomeSameSorted, Sort.sort(smallIntegerListSomeSame));
    }

}