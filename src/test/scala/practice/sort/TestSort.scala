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
    var smallIntegerListWithDuplicates = List(7,1,5,7,3);
    var smallIntegerListWithDuplicatesSorted = List(1,3,5,7,7);
    
    var integerListWithLargeDifferencesRandom = List(50, 21,199, 9999, 155, 23, 1, 888, 255, 97, 1495);
    var integerListWithLargeDifferencesReversed = List(9999, 1495, 888, 255, 199, 155, 97, 50, 23, 21, 1);
    var integerListWithLargeDifferencesSorted = List(1, 21, 23, 50, 97, 155, 199, 255, 888, 1495, 9999);
    var integerListWithLargeDifferencesWithDuplicates = List(888, 1, 21, 23, 155, 50, 97, 155, 199, 255, 888, 1495, 9999);
    var integerListWithLargeDifferencesWithDuplicatesSorted = List(1, 21, 23, 50, 97, 155, 155, 199, 255, 888, 888, 1495, 9999);
    
    
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
    def testSort_SmallList_WithDuplicates() = {
        assertEquals(smallIntegerListWithDuplicatesSorted, Sort.sort(smallIntegerListWithDuplicates));
    }
    
    /**
     * Sort a list with elements of large differences randomly placed.
     */
    def testSort_listLargeDifferences_Random() = {
        assertEquals(integerListWithLargeDifferencesSorted, Sort.sort(integerListWithLargeDifferencesRandom));
    }
    
    /**
     * Sort a list with elements of large differences in reverse order.
     */
    def testSort_listLargeDifferences_Reversed() = {
        assertEquals(integerListWithLargeDifferencesSorted, Sort.sort(integerListWithLargeDifferencesReversed));
    }
    
    /**
     * Sort a list with elements of large differences in sorted order.
     */
    def testSort_listLargeDifferences_Sorted() = {
        assertEquals(integerListWithLargeDifferencesSorted, Sort.sort(integerListWithLargeDifferencesSorted));
    }
    
    /**
     * Sort a list with elements of large differences in random order (with duplicates).
     */
    def testSort_listLargeDifferences_WithDuplicates() = {
        assertEquals(integerListWithLargeDifferencesWithDuplicatesSorted, Sort.sort(integerListWithLargeDifferencesWithDuplicates));
    }


}