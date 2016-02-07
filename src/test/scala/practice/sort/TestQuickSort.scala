package test.scala.practice.sort

import junit.framework.TestCase
import com.chongdashu.scala.practice.sort.QuickSort
import org.junit.Assert._

class TestQuickSort extends TestSort{
    
    override def setUp() = {
        Sort = QuickSort;
    }
}