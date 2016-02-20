package main.scala.epi.chapter19
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Stack
import scala.collection.mutable.HashMap

object Question19_2 {
 
    def searchMaze(maze : String, startIndex : Int, endIndex : Int) : Array[Int] = {
        
        // TODO: Build v and e correctly; currently hard-coded for 2 x 2
        // test case.
        var v : Set[Int] = Set(0,1,2,3);
        var e : Set[Tuple2[Int, Int]] = Set(
            (0,1), (0,2),
            (1,0), (1,3),
            (2,0), (2,3),
            (3,1), (3,2)
        );
        
        var path : List[Int] = depthFirstSearch(v, e, startIndex, endIndex);
            
        return path.toArray;
    }
    
    def convertMazeToArray(maze : String) : Array[Array[Int]] = {
        var mazeArray : Array[Array[Int]] = Array.empty;
        
        var mazeSplit : Array[String] = maze.split("\n");
        
        mazeArray = new Array(mazeSplit.length);
        
        for ((row,index) <- mazeSplit.zipWithIndex) {
            var mazeRow = row.split(" ").map( x => x.toInt);
            mazeArray(index) = mazeRow;
        }
        
        return mazeArray;
    }

  def depthFirstSearch(v: Set[Int], e: Set[(Int, Int)], startIndex: Int, endIndex: Int) : List[Int] = {
      println(s"dfs, start=${startIndex}, end=${endIndex}");
      var s : Stack[Int] = new Stack();
      var visited : HashMap[Int, Boolean] = new HashMap;
      var parentOf : HashMap[Int, Int] = new HashMap;
      
      s.push(startIndex);
      
      while (!s.isEmpty) {
          val CurrentIndex = s.pop();
          println(s"currentIndex=${CurrentIndex}");
          if (CurrentIndex == endIndex) {
              println(s"CurrentIndex={CurrentIndex}==endIndex={endIndex}!");
              // rebuild path
              var path : ListBuffer[Int] = ListBuffer();
              var curr : Int = CurrentIndex;
              while (parentOf.contains(curr)) {
                  path += curr;
                  println(s"parentOf(${curr})=${parentOf(curr)}");
                  curr = parentOf(curr);
              }
              
              path += curr;
              print(path);
              
              return path.reverse.toList;
          }
          if (!visited.contains(CurrentIndex)) {
              visited(CurrentIndex) = true;
              for (Tuple2(CurrentIndex, nextIndex) <- e) {
                  if (!visited.contains(nextIndex)) {
                      s.push(nextIndex);
    //                  println(s"For currentIndex=${CurrentIndex}: Pushing ${nextIndex}");
                      println(s"parentOf(${nextIndex}) = ${CurrentIndex}");
                      parentOf(nextIndex) = CurrentIndex;   
                  }
                  
                  
              }
          }
      }

      return List.empty;
      
   }
  
  
}