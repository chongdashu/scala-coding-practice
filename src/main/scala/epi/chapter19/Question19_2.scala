package main.scala.epi.chapter19
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Stack
import scala.collection.mutable.HashMap

object Question19_2 {
 
    def searchMaze(maze : String, startIndex : Int, endIndex : Int) : Array[Int] = {
        
        var v = getNodesAndEdges(maze)._1;
        var e = getNodesAndEdges(maze)._2;
        
        var path : List[Int] = depthFirstSearch(v, e, startIndex, endIndex);
            
        return path.toArray;
    }
    
    def getNodesAndEdges(maze : String) : Tuple2[Set[Int], Set[Tuple2[Int, Int]]] = {
        var mazeArray : Array[Array[Int]] = convertMazeToArray(maze);
        var nrow = mazeArray.length;
        var ncol = mazeArray(0).length;
        
        var v : Set[Int] = Set.empty;
        for (i <- (0 to nrow*ncol-1)) {
            v += i;
        }
        
        var e : Set[Tuple2[Int,Int]] = Set.empty;
        
        for (row <- 0 to nrow-1) {
            for (col <- 0 to ncol-1) {
                var cur = row * ncol + col;
                if (mazeArray(row)(col) == 0) {
                    for ( (deltaX, deltaY) <- Set((1,0), (-1,0), (0, -1), (0, 1)) ) {
                        var neighborX = row + deltaX;
                        var neighborY = col + deltaY;
                        if (neighborX >= 0 && neighborX < ncol && neighborY >= 0 && neighborY < nrow) {
                            if (mazeArray(neighborX)(neighborY) == 0) {
                                var nei = neighborX * ncol + neighborY;
                                e += Tuple2(cur, nei);
                                e += Tuple2(nei, cur);
                            }
                        }
                    }  
                }
                
            }
        }
        
        return (v, e);
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
                      println(s"parentOf(${nextIndex}) = ${CurrentIndex}");
                      parentOf(nextIndex) = CurrentIndex;   
                  }
                  
                  
              }
          }
      }

      return List.empty;
      
   }
  
  
}