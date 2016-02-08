package test.scala.practice.sort

import com.chongdashu.scala.practice.sort.BucketSort

class TestBucketSort extends TestSort {
    
    override def setUp() = {
        Sort = new BucketSort();
    }
    
}