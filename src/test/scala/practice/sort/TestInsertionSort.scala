package test.scala.practice.sort

import org.junit.Assert._
import com.chongdashu.scala.practice.sort.BubbleSort
import com.chongdashu.scala.practice.sort.InsertionSort

class TestInsertionSort extends TestSort {
    
    override def setUp() = {
        Sort = InsertionSort;
    }
    
}