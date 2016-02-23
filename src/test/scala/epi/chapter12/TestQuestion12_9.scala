package test.scala.epi.chapter12

import org.junit.Assert._
import junit.framework.TestCase
import main.scala.epi.chapter12.Question12_9

class TestQuestion12_9 extends TestCase {
    
    override def setUp() = {
    }
    
    def testBookExample() = {
        var array : Array[Int] = Array(3,2,1,5,4);
        
        var k1 : Int = 1;
        var expected1 : Int = 5;
        var actual1 : Int = Question12_9.findKthLargest(k1, array);
        assertEquals(s"First largest element in array is array(3)=${array(3)}", expected1,  actual1);
        
        var k3 : Int = 1;
        var expected3 : Int = 3;
        var actual3 : Int = Question12_9.findKthLargest(k3, array);
        assertEquals(s"First largest element in array is array(0)=${array(0)}", expected3,  actual3);
        
        var k5 : Int = 5;
        var expected5 : Int = 1;
        var actual5 : Int = Question12_9.findKthLargest(k5, array);
        assertEquals(s"First largest element in array is array(2)=${array(2)}", expected5,  actual5);
        
        
    }
    
    
    
}