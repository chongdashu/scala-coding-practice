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
    
    def testSort_EmptyList() = {
        assertEquals(List.empty, Sort.sort(List.empty));
    }
    
    def testSort_SingleElementList() = {
        assertEquals(singleIntegerList, Sort.sort(singleIntegerList));
    }
    
    def testSort_SmallList_Reversed() = {
        assertEquals(smallIntegerListSorted, Sort.sort(smallIntegerListReversed));
    }
    
    def testSort_SmallList_Sorted() = {
        assertEquals(smallIntegerListSorted, Sort.sort(smallIntegerListSorted));
    }
    
    def testSort_SmallList_Random() = {
        assertEquals(smallIntegerListSorted, Sort.sort(smallIntegerListRandom));
    }
    
      def testSort_SmallList_AllSame() = {
        assertEquals(smallIntegerListAllSame, Sort.sort(smallIntegerListAllSame));
    }

}