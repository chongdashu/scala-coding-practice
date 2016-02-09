package test.scala.practice.sort

import org.junit.Assert._
import com.chongdashu.scala.practice.sort.MergeSort

class TestMergeSort extends TestSort {
    
    override def setUp() = {
        Sort = MergeSort;
    }
    
}