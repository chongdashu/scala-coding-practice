package com.chongdashu.scala.practice.sort

import scala.collection.mutable.ListBuffer
import scala.util.Random

object QuickSort extends BaseSort {
    
    def sort( list : List[Int]) : List[Int] = {
        
        // Base case
        if (list.isEmpty || list.size == 1) {
             return list;
        }
        
        val listBuffer : ListBuffer[Int] = ListBuffer.empty ++ list;
        
        // Step (1): Randomly select a pivotIndex and pivot
        // (a)          Usually it's the last element
        // var pivotIndex : Int = listBuffer.length - 1;
        // (b)          Can be a random value too
        var pivotIndex : Int = Random.nextInt(listBuffer.length);
        var pivotValue = listBuffer(pivotIndex);
        
        val leftOfPivot : ListBuffer[Int] = ListBuffer.empty;
        val rightOfPivot : ListBuffer[Int] = ListBuffer.empty
        val centerOfPivot : ListBuffer[Int] = ListBuffer.empty;
        
        var newPivotIndex = -1;
        
        for ((element, index) <- listBuffer.zipWithIndex) {
            if (element < pivotValue) {
                leftOfPivot += element;
            }
            else if (element > pivotValue) {
                rightOfPivot += element;
            }
            else {
                centerOfPivot += element;
            }
        }
        
        return  sort((leftOfPivot ++ centerOfPivot).toList) ++ sort(rightOfPivot.toList)
        
        
    }
}



