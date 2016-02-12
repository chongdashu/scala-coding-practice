package com.chongdashu.scala.practice.sort

import scala.collection.mutable.ListBuffer
import scala.util.Random

object InsertionSort extends BaseSort {
    
    def sort( list : List[Int]) : List[Int] = {
        
        // Base case
        if (list.isEmpty || list.size == 1) {
             return list;
        }
        
        // Convert to modifiable list
        val listBuffer : ListBuffer[Int] = ListBuffer.empty ++ list;
        
        for (i <- listBuffer.indices if i > 0) {
            var j = i;
            while (j > 0 && listBuffer(j-1) > listBuffer(j)) {
                var pivotValue = listBuffer(j)
                var testValue = listBuffer(j-1)
                
                listBuffer(j) = testValue;
                listBuffer(j-1) = pivotValue;
                
                j -= 1;
            }
        }
        
        return listBuffer.toList;
    }
     def sort(array : Array[Int]) : Array[Int] = {
         var result = array;
         
         return result;
     }

}



