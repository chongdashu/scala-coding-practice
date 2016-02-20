package test.scala.epi.chapter5

import org.junit.Assert._
import junit.framework.TestCase
import main.scala.epi.chapter5.Chapter5_1


class TestChapter5_1 extends TestCase{
    override def setUp() = {
        
    }
    
    def testParityAllZeros = {
        var value : Long = 0x0000000000000000; 
        var expected : Long = 0;
        
        assertEquals("Parity of zero is 0", expected, Chapter5_1.calculateParityA(value));
    }
    
    def testParityOne = {
        var value : Long = 1; 
        var expected : Long = 1;
        
        assertEquals("Parity of one is 1", expected, Chapter5_1.calculateParityA(value));
    }
    
    def testParityTwo = {
        var value : Long = 2; 
        var expected : Long = 0;
        
        assertEquals("Parity of two is 0", expected, Chapter5_1.calculateParityA(value));
    }
    
    def testParityNine = {
        var value : Long = 9; // 0000 0000 ... 0101 
        var expected : Long = 0;
        
        assertEquals("Parity of nine is 0", expected, Chapter5_1.calculateParityA(value));
    }
}