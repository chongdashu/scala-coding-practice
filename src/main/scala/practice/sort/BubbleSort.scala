package com.chongdashu.scala.practice.sort

import scala.collection.mutable.ListBuffer

/**
 * The BubbleSort algorithm
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */
object BubbleSort extends BaseSort {
    
     def sort(list : List[Int]) : List[Int] = {
        
        // List to ListBuffer
        // Ref: http://stackoverflow.com/a/14443160/2669714
        val listBuffer : ListBuffer[Int] = ListBuffer.empty ++ list;
        
        for (iteration <- listBuffer.indices) {
            for (index <- listBuffer.indices 
                if index < listBuffer.length-1) {
                var curValue = listBuffer(index);
                var nextValue = listBuffer(index+1);
            
                if (curValue > nextValue) {
                    listBuffer(index+1) = curValue
                    listBuffer(index) = nextValue
                }
            }
        }
       
        
        
        return listBuffer.toList;
        
    }
}



