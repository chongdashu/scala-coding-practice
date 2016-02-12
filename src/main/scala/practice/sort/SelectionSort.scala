package com.chongdashu.scala.practice.sort

import scala.collection.mutable.ListBuffer
import scala.util.Random

object SelectionSort extends BaseSort {
    
    def sort( list : List[Int]) : List[Int] = {
        
        // Base case
        if (list.isEmpty || list.size == 1) {
             return list;
        }
        
        var listBuffer : ListBuffer[Int] = ListBuffer.empty ++ list;
        var i, j : Int = 0;
        
        for (j <- 0 to list.size-1) {
            var indexMin = j;
            for (i <- j+1 to list.size) {
                if (listBuffer(i) < listBuffer(indexMin)) {
                    indexMin = i;
                }
            }
            
            var previousMin = listBuffer(indexMin);
            
            
            if (indexMin != j) {
                listBuffer(indexMin) = listBuffer(j);
                listBuffer(j) = previousMin;
                indexMin = j;
            }
        }
        
        
        return listBuffer.toList;
        
    }
    def sort(array : Array[Int]) : Array[Int] = {
         var result = array;
         
         return result;
     }
}



