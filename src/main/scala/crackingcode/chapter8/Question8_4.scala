package main.scala.crackingcode.chapter8
import scala.collection.mutable.Set;

object Question8_4 {
      def getAllSubsets(set : Set[Int]) : Set[Set[Int]] = {
          
          if (set.size == 0) {
              return Set(Set.empty[Int]);
          }
          
          // (1)
          // [ (), (1) ]
          
          // (1,2)
          // [ (), (1), (2), (1,2) ]
          
          // (1,2,3)
          // [ (), (1), (2), (1,2), (3), (1,3), (2,3), ( (1,2,3) ]
          
          var result : Set[Set[Int]] = Set[Set[Int]]();
          
          result ++= getAllSubsets(set.tail);
          result ++= ( getAllSubsets(set.tail).map( x => x + set.head) );
          
          return result;
          
          
      }
}