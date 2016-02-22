package test.scala.crackingcode.chapter8
import org.junit.Assert._
import junit.framework.TestCase
import main.scala.crackingcode.chapter8.Question8_6

class TestQuestion8_6 extends TestCase {
    
    override def setUp() = {
        
    }
    
    def testHanoiOneDisk = {
        var actual : Array[String] = Question8_6.hanoi(1);
        var expected : Array[String] = Array(
                "Move disk 1 from T0 to T2"
        );
        assertEquals(expected.mkString, actual.mkString);
    }
    
    def testHanoiTwoDisks = {
        var actual : Array[String] = Question8_6.hanoi(2);
        var expected : Array[String] = Array(
                "Move disk 1 from T0 to T1",
                "Move disk 2 from T0 to T2",
                "Move disk 1 from T1 to T2"
        )

//        println(expected.mkString("\n"));
        assertEquals(expected.mkString, actual.mkString);
    }
    
    def testHanoiThreeDisks = {
        var actual : Array[String] = Question8_6.hanoi(3);
        var expected : Array[String] = Array(
                "Move disk 1 from T0 to T2",
                "Move disk 2 from T0 to T1",
                "Move disk 1 from T2 to T1",
                "Move disk 3 from T0 to T2",
                "Move disk 1 from T1 to T0",
                "Move disk 2 from T1 to T2",
                "Move disk 1 from T0 to T2"
                
        )

//        println(expected.mkString("\n"));
        assertEquals(expected.mkString, actual.mkString);
    }
  
}