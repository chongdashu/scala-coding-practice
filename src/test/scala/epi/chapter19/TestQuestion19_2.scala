package test.scala.epi.chapter19

import com.chongdashu.scala.practice.sort.BucketSort
import org.junit.Assert._
import junit.framework.TestCase
import main.scala.epi.chapter19.Question19_2

class TestQuestion19_2 extends TestCase {
    
    override def setUp() = {
    }
    
    def testGetNodesAndEdges() = {
        var expected_v : Set[Int] = Set(0,1,2,3);
        var expected_e : Set[Tuple2[Int, Int]] = Set(
            (1,3), (2,3),
            (3,1), (3,2)
        );
        var maze : String = 
            "1 0" + "\n" +
            "0 0";
        
        var actual_v = Question19_2.getNodesAndEdges(maze)._1;
        var actual_e = Question19_2.getNodesAndEdges(maze)._2;
        
        assertEquals(expected_v, actual_v);
        assertEquals(expected_e, actual_e);
    }
    
    def testConvert2x2MazeToArray() = {
         var maze : String = 
            "1 0" + "\n" +
	        "0 1";
        var actual : Array[Array[Int]] = Question19_2.convertMazeToArray(maze);
        var expected : Array[Array[Int]] = Array(
            Array(1, 0),
            Array(0, 1)
        );
        
        for ((e, index) <- expected.zipWithIndex) {
            assertArrayEquals("Row ${index} should be the same", expected(index), actual(index));
        }
    }
    
    def testConvert5x5MazeToArray() = {
         var maze : String = 
            "1 0 0 1 0" + "\n" +
            "0 0 0 1 0" + "\n" +
            "1 0 0 1 0" + "\n" +
            "1 0 1 1 0" + "\n" +
	        "0 0 1 0 1";
        var actual : Array[Array[Int]] = Question19_2.convertMazeToArray(maze);
        var expected : Array[Array[Int]] = Array(
            Array(1, 0, 0, 1, 0),
            Array(0, 0, 0, 1, 0),
            Array(1, 0, 0, 1, 0),
            Array(1, 0, 1, 1, 0),
            Array(0, 0, 1, 0, 1)
        );
        
        for ((e, index) <- expected.zipWithIndex) {
            assertArrayEquals("Row ${index} should be the same", expected(index), actual(index));
        }
    }
    
    def testConvert2x5MazeToArray() = {
        var maze : String = 
            "1 0 0 1 0" + "\n" +
            "0 0 0 1 0";
        var actual : Array[Array[Int]] = Question19_2.convertMazeToArray(maze);
        var expected : Array[Array[Int]] = Array(
            Array(1, 0, 0, 1, 0),
            Array(0, 0, 0, 1, 0)
        );
        
        for ((e, index) <- expected.zipWithIndex) {
            assertArrayEquals("Row ${index} should be the same", expected(index), actual(index));
        }
    }
        
    def testSearchMaze2x2 = {
       var maze : String = 
            "1 0" + "\n" +
            "0 0";
       var startIndex = 2;
       var endIndex = 1;
       var expected : Array[Int] = Array(2, 3, 1);
       
       var actual : Array[Int] = Question19_2.searchMaze(maze, startIndex, endIndex);
       
       assertArrayEquals(expected, actual);
    }
    
    def testSearchMaze3x3 = {
       var maze : String = 
            "0 1 0" + "\n" +
            "0 1 0" + "\n" +
            "0 0 0";
       var startIndex = 0;
       var endIndex = 2;
       var expected : Array[Int] = Array(0, 3, 6, 7, 8, 5, 2);
       
       var actual : Array[Int] = Question19_2.searchMaze(maze, startIndex, endIndex);
       
       assertArrayEquals(expected, actual);
    }
    
}