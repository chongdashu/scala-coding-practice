package com.chongdashu.scala.practice

import scala.collection.mutable.ListBuffer

/**
 * The BubbleSort algorithm
 * 
 * Time Complexity: O(n^2)
 */
object BubbleSort {
    
    def sort(list : List[Int]) : List[Int] = {
        
        // List to ListBuffer
        // Ref: http://stackoverflow.com/a/14443160/2669714
        val listBuffer : ListBuffer[Int] = ListBuffer.empty ++ list;
        
        for (iteration <- (0 to listBuffer.length-1)) {
            for (index <- (0 to listBuffer.length-1)) {
                if (index < (listBuffer.length - 1)) {
                    var curValue = listBuffer(index);
                    var nextValue = listBuffer(index+1);
                
                    if (curValue > nextValue) {
                        listBuffer(index+1) = curValue
                        listBuffer(index) = nextValue
                    }
                }
            }
        }
       
        
        
        return listBuffer.toList;
        
    }
}



