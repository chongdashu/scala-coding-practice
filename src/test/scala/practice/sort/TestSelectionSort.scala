package test.scala.practice.sort

import org.junit.Assert._
import com.chongdashu.scala.practice.sort.SelectionSort

class TestSelectionSort extends TestSort {
    
    override def setUp() = {
        Sort = SelectionSort;
    }
    
}