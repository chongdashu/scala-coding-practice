package com.chongdashu.scala.practice.sort

import scala.collection.mutable.ListBuffer

object MergeSort extends BaseSort  {
    
    def sort( list : List[Int]) : List[Int] = {
        
        // Base case
        if (list.isEmpty || list.length == 1) {
            return list;
        }
        
        // Recursive Case
        var left : ListBuffer[Int] = ListBuffer.empty;
        var right : ListBuffer[Int] = ListBuffer.empty;
        
        for ( (number, index) <- list.zipWithIndex) {
            if ( index % 2 == 0) {
                left += number;
            }
            else {
                right += number;
            }
        }
        
        return merge(sort(left.toList), sort(right.toList))
    }
    
    def merge ( left_ : List[Int], right_ : List[Int]) : List[Int] = {
        var result : ListBuffer[Int] = ListBuffer.empty;
        
        var left = left_;
        var right = right_;
        
        while (!left.isEmpty && !right.isEmpty) {
            var headLeft::tailLeft = left;
            var headRight::tailRight = right;
            
            if (headLeft <= headRight) {
                result += headLeft
                left = tailLeft;
            }
            else {
                result += headRight;
                right = tailRight
            }
        }
        
       result = result ++ left;
       result = result ++ right;
        
        return result.toList;
        
    }
    
     def sort(array : Array[Int]) : Array[Int] = {
         var result = array;
         
         return result;
     }

    
}





