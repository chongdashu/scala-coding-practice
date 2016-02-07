package test.scala.practice.sort

import org.junit.Assert._

import com.chongdashu.scala.practice.sort.BubbleSort

class TestBubbleSort extends TestSort {
    
    override def setUp() = {
        Sort = BubbleSort;
    }
    
}