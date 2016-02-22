package test.scala.epi.chapter12

import com.chongdashu.scala.practice.sort.BucketSort
import org.junit.Assert._
import junit.framework.TestCase
import main.scala.epi.chapter19.Question19_2
import main.scala.epi.chapter10.Question10_1
import main.scala.epi.chapter12.Question12_1

class TestQuestion12_1 extends TestCase {
    
    override def setUp() = {
    }
    
    def testFindFirstOccurrence_Empty = {
        var array : Array[Int] = Array.emptyIntArray;
        var value : Int = 1234;
        
        var expected : Int = -1;
        var actual = Question12_1.findFirstOccurrence(array, value)
        
        assertEquals(expected, actual);
    }
    
    def testFindFirstOccurrence_SingleElement_ValueExists = {
        var array : Array[Int] = Array(1234);
        var value : Int = 1234;
        
        var expected : Int = 0;
        var actual = Question12_1.findFirstOccurrence(array, value)
        
        assertEquals(expected, actual);
    }
    
    def testFindFirstOccurrence_SingleElement_ValueNotExists = {
        var array : Array[Int] = Array(4321);
        var value : Int = 1234;
        
        var expected : Int = -1;
        var actual = Question12_1.findFirstOccurrence(array, value)
        
        assertEquals(expected, actual);
    }
    
    def testFindFirstOccurrence_SmallEvenArray_ValueExists_AtStart = {
        var array : Array[Int] = Array(1234, 2341, 3412, 4123);
        var value : Int = 1234;
        
        var expected : Int = 0;
        var actual = Question12_1.findFirstOccurrence(array, value)
        
        assertEquals(expected, actual);
    }
    
    def testFindFirstOccurrence_SmallEvenArray_ValueExists_AtEnd = {
        var array : Array[Int] = Array(1234, 2341, 3412, 4123);
        var value : Int = 4123;
        
        var expected : Int = 3;
        var actual = Question12_1.findFirstOccurrence(array, value)
        
        assertEquals(expected, actual);
    }
    
    def testFindFirstOccurrence_SmallEvenArray_ValueExists_AtMiddle = {
        var array : Array[Int] = Array(1234, 2341, 3412, 4123);
        var value : Int = 2341;
        
        var expected : Int = 1;
        var actual = Question12_1.findFirstOccurrence(array, value)
        
        assertEquals(expected, actual);
    }
    
    def testFindFirstOccurrence_SmallOddArray_ValueExists_AtStart = {
        var array : Array[Int] = Array(12345, 23451, 34512, 45123, 51234);
        var value : Int = 12345;
        
        var expected : Int = 0;
        var actual = Question12_1.findFirstOccurrence(array, value)
        
        assertEquals(expected, actual);
    }
    
     def testFindFirstOccurrence_SmallOddArray_ValueExists_AtMiddle = {
        var array : Array[Int] = Array(12345, 23451, 34512, 45123, 51234);
        var value : Int = 34512;
        
        var expected : Int = 2;
        var actual = Question12_1.findFirstOccurrence(array, value)
        
        assertEquals(expected, actual);
    }
    
    def testFindFirstOccurrence_SmallOddArray_ValueExists_AtEnd = {
        var array : Array[Int] = Array(12345, 23451, 34512, 45123, 51234);
        var value : Int = 51234;
        
        var expected : Int = 4;
        var actual = Question12_1.findFirstOccurrence(array, value)
        
        assertEquals(expected, actual);
    }
    
    def testFindFirstOccurrence_SmallOddArray_ValueExists_StartMiddleEnd = {
        var array : Array[Int] = Array(12345, 23451, 12345, 45123, 12345);
        var value : Int = 12345;
        
        var expected : Int = 0;
        var actual = Question12_1.findFirstOccurrence(array, value)
        
        assertEquals(expected, actual);
    }
    
    def testFindFirstOccurrence_SmallEvenArray_ValueExists_AllSame = {
        var array : Array[Int] = Array(12345, 12345, 12345, 12345);
        var value : Int = 12345;
        
        var expected : Int = 0;
        var actual = Question12_1.findFirstOccurrence(array, value)
        
        assertEquals(expected, actual);
    }
    
    def testFindFirstOccurrence_BookExample = {
        var array : Array[Int] = Array(-14, -10 ,2, 108, 108, 243, 285, 285, 285, 401);
        
        var value1 : Int = 108;
        var expected1 : Int = 3;
        var actual1 = Question12_1.findFirstOccurrence(array, value1)
        assertEquals(expected1, actual1);
        
        var value2 : Int = 285;
        var expected2 : Int = 6;
        var actual2 = Question12_1.findFirstOccurrence(array, value2)
        assertEquals(expected2, actual2);
        
    }
    
    
    
}